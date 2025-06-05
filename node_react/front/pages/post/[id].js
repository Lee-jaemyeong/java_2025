import React, { useState, useEffect } from "react";
import { useRouter } from "next/router";
import axios from 'axios';

import AppLayout from "../../components/AppLayout";
import PostCard from "../../components/PostCard";
import { useDispatch, useSelector } from "react-redux";
import { LOAD_POST_REQUEST } from '../../reducers/post';
import { LOAD_MY_INFO_REQUEST } from '../../reducers/user';
import wrapper from '../../store/configureStore';
import {END} from 'redux-saga';

const Post = () => {
  const dispatch = useDispatch();
  const router = useRouter();
  const {id} = router.query;
  const {singlePost} = useSelector(state => state.post);

  return(
    <AppLayout>
      <PostCard post={singlePost} />
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
  context.store.dispatch({ type:LOAD_POST_REQUEST , data:context.params.id });
  context.store.dispatch(END);  

  await context.store.sagaTask.toPromise();

});
////////////////////////////////////////////////////////

export default Post;