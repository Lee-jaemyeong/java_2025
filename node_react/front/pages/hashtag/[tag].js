import React, { useState, useEffect } from "react";
import { useRouter } from "next/router";
import axios from 'axios';

import AppLayout from "../../components/AppLayout";
import PostCard from "../../components/PostCard";
import { useDispatch, useSelector } from "react-redux";
import { LOAD_HASHTAG_POSTS_REQUEST } from '../../reducers/post';
import { LOAD_MY_INFO_REQUEST } from '../../reducers/user';
import wrapper from '../../store/configureStore';
import {END} from 'redux-saga';

const Hashtag = () => {
  const dispatch = useDispatch();
  const router = useRouter();
  const {tag} = router.query;

  const {mainPosts, hasMorePosts, loadPostsLoading, postError} = useSelector(state => state.post);
  // const [ mainPosts, setMainPosts ] = useState([]);
  // const [ hasMorePosts, setHasMorePosts ] = useState(true);
  // const [ loading, setLoading ] = useState(true);
  // const [ error, setError ] = useState(null);
/*
  useEffect(() => {
    ///////// axios
    const fetchData = async () => {
      try {
        setLoading(true);
        const hashtagResponse = await axios.get( `http://localhost:3065/hashtag/${tag}`, {withCredentials:true} );
        setMainPosts(hashtagResponse.data);
        setHasMorePosts(hashtagResponse.data.length > 0);
      } catch (err) {
        setError(err);
      } finally {
        setLoading(false);
      }
    };
    if(tag){fetchData();}
  },[tag]);  
*/
  /// 스크롤
  useEffect(() => {
    const onScroll = () => {
      // screenY vs pageYOffset
      // screenY: 현재창에서 마우스커서Y
      // pageYOffset: 페이지를 스크롤 측정 Y
      if(window.pageYOffset + document.documentElement.clientHeight > document.documentElement.scrollHeight - 200) {
        if( hasMorePosts && !loadPostsLoading ) {
          dispatch({
            type: LOAD_HASHTAG_POSTS_REQUEST,
            lastId: mainPosts[mainPosts.length-1]?.id,
            data: tag
          })
        /*
          axios.get( `http://localhost:/3065/hashtag/${tag}?lastId=${mainPosts[mainPosts.length-1]?.id}` , {withCredentials : true} )
            .then((hashtagResponse) => {
              setMainPosts((prev) => [ ...prev, ...hashtagResponse.data ]);
              setHasMorePosts( hashtagResponse.data.length > 0 );
            })
            .catch((err) => setError(err));
          */
        }
      }
    }
    window.addEventListener('scroll', onScroll);
    return () => {
      window.removeEventListener('scroll', onScroll);  // 스크롤했다면 스크롤했던 거 remove, 메모리에 쌓임
    }
  },[mainPosts, hasMorePosts, tag, loadPostsLoading]);  

  if( loadPostsLoading ) { return <div>해쉬태그 게시글 ing ...</div>; }
  if( postError ) { return <div> error ...</div>; }

  /////////////////////////// view
  return(
    <AppLayout>
      { mainPosts.map((post) => { 
        return ( <PostCard post={post} key={post.id} /> );} )}
    </AppLayout>
  );  
};

////////////////////////////////////////////////////////
export const getServerSideProps = wrapper.getServerSideProps(async (context) => {
  //1. cookie 설정
  const cookie = context.req? context.req.headers.cookie : '';
  axios.defaults.headers.Cookie = '';

  if (context.req && cookie) { axios.defaults.headers.Cookie = cookie; }

  //2. redux 액션
  context.store.dispatch({ type:LOAD_MY_INFO_REQUEST });
  context.store.dispatch({ type:LOAD_HASHTAG_POSTS_REQUEST , data:context.params.tag });
  context.store.dispatch(END);  

  await context.store.sagaTask.toPromise();

});
////////////////////////////////////////////////////////

export default Hashtag;