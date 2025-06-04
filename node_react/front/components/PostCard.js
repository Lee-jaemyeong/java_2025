import React, { useState, useCallback, useEffect } from 'react';
import PropTypes from 'prop-types';

import { Card, Avatar, Button, List, Comment, Popover } from 'antd';
import { EllipsisOutlined, HeartOutlined, HeartTwoTone, MessageOutlined, RetweetOutlined } from '@ant-design/icons';
import CommentForm from './CommentForm';
import PostImages from './PostImages';
import FollowButton from './FollowButton';
import PostCardContent from './PostCardContent';

import { useSelector, useDispatch } from 'react-redux'; //2. useDispatch
//1. REMOVE_POST_REQUEST
import { REMOVE_POST_REQUEST, LIKE_POST_REQUEST, UNLIKE_POST_REQUEST, UPDATE_POST_REQUEST,RETWEET_REQUEST } from '../reducers/post';
import Link from 'next/Link';

const PostCard = ({post}) => {
  if (!post || !post.User) {return null;}
  const id = useSelector( state => state.user.user?.id );
  /////////////////////////////////////////////////////// code
  const {removePostLoading , removePostDone} = useSelector( state => state.post ) // 3.
  // console.log(id);
  const dispatch = useDispatch(); // 4.

  //1. 좋아요 - false
  //const [like, setLike] = useState(false);
  const onClickLike = useCallback(() => { 
    if (!id) {return alert('로그인을 하시면 좋아요 추가가 가능합니다.');}
    return dispatch({
      type: LIKE_POST_REQUEST,
      data: post.id
    });
  }, [id] );

  const onClickunLike = useCallback(() => { 
    if (!id) {return alert('로그인을 하시면 좋아요 추가가 가능합니다.');}
    return dispatch({
      type: UNLIKE_POST_REQUEST,
      data: post.id
    });
  }, [id] );

  const like = post.Likers?.find((v) => v.id === id); // 내가 눌렀는지 체크

  //2. 댓글 - 댓글의 상태체크 / 댓글처음에는 안보이게, 클릭하면 토글기능
  const [comment, setComment] = useState(false);
  const onClickComment = useCallback(() => { setComment(prev => !prev); }, []);

  //3. 삭제버튼
  useEffect(() => {
     if(removePostDone) { console.log('....removePostDone'); alert('게시글을 삭제했습니다.'); }
   }, []);
  const onRemovePost = useCallback(() => {
    dispatch({ 
      type: REMOVE_POST_REQUEST,
      data: post.id 
    })
  }, []);  

  //4. 수정
  const [editMode, setEditMode] = useState(false);
  const onClickUpdate = useCallback(() => { setEditMode(true); },[]);
  const onCancelUpdate = useCallback(() => { setEditMode(false); },[]);
  const onEditPost = useCallback((editText) => () => {
    dispatch({
      type: UPDATE_POST_REQUEST,
      data: { PostId:post.id, content:editText }
    });
  },[post]);

  //5. 리게시물
  const onRetweet = useCallback(() => {
    if (!id) { return alert('로그인 후 리트윗이 가능합니다.'); }
    return dispatch({
      type: RETWEET_REQUEST,
      data: post.id
    });
  });

  /////////////////////////////////////////////////////// view
  return(
    <div style={{margin:'3%'}}>
      <Card
        cover={ post.Images && post.Images.length > 0 && <PostImages images={post.Images}/> }
        actions={[
          <RetweetOutlined key="retweet" onClick={onRetweet} />,
          like
            ? <HeartTwoTone twoToneColor="#f00" key="heart" onClick={onClickunLike} />
            : <HeartOutlined key="heart" onClick={onClickLike} />,
          
          <MessageOutlined key="comment" onClick={onClickComment}/>,
          <Popover content={(
            <Button.Group>
              { id && id === post.User.id
              ?(
                <>
                <Button onClick={onClickUpdate} >수정</Button>
                <Button type="danger" onClick={onRemovePost} loading={removePostLoading}>삭제</Button>
                </>
               )
              : <Button style={{backgroundColor:'red', color:'white'}}>신고</Button>
              }
            </Button.Group>
          )}>
            <EllipsisOutlined />
          </Popover>
        ]}
        title={post.RetweetId ? `${post.User.nickname}님이 리트윗하셨습니다.` : null}
        extra={<>{id && id !== post.User.id && <FollowButton post={post} />}</>}
      >
      { post.RetweetId && post.Retweet ? (
        <Card cover={post.Retweet.Images[0] && <PostImages images={post.Retweet.Images} />}>
          <Card.Meta
            avatar={<Link href={`/user/${post.Retweet.User.id}`} prefetch={false}>
                    <Avatar>{post.Retweet.User.nickname[0]}</Avatar></Link>} 
            title={post.Retweet.User.nickname}
            description={
              <PostCardContent 
                editMode={editMode}
                onEditPost={onEditPost}
                onCancelUpdate={onCancelUpdate}
                postData={post.Retweet.content}
              />} 
          />
        </Card>
      ) : (
        <Card.Meta
          avatar={<Link href={`/user/${post.User.id}`} prefetch={false}><Avatar>{post.User.nickname[0]}</Avatar></Link>} 
          title={post.User.nickname}
          description={
            <PostCardContent 
              editMode={editMode}
              onEditPost={onEditPost}
              onCancelUpdate={onCancelUpdate}
              postData={post.content}
            />} 
        />
      )}
      </Card>
    { comment && (
      <>
        {/* 댓글폼 */}
        <CommentForm post={post} />
        {/* 댓글리스트 */}
        <List 
          header={`댓글 ${post.Comments.length}`}
          itemLayout='horizontal'
          dataSource={post.Comments}
          renderItem={ (item) => (
            <li>
              <Comment
                avatar={<Avatar>{item.User.nickname[0]}</Avatar>}
                content={item.content}
                author={item.User.nickname}
              />
            </li>
          )
          }
        />
      </>
    )}
    </div>
  );
};

PostCard.propTypes = { post: PropTypes.object.isRequired };

export default PostCard;