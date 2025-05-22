import React, { useState, useCallback } from 'react';
import { Card, Avatar, Button, List, Comment, Popover } from 'antd';
import { EllipsisOutlined, HeartOutlined, HeartTwoTone, MessageOutlined, RetweetOutlined } from '@ant-design/icons';
import CommentForm from './CommentForm';
import PostImages from './PostImages';
import { useSelector } from 'react-redux';

const PostCard = ({post}) => {
  /////////////////////////////////////////////////////// code
  const id = useSelector( state => state.user.user?.id );
  // console.log(id);

  //1. 좋아요 - false
  const [like, setLike] = useState(false);
  const onClickLike = useCallback(() => { setLike((prev) => !prev); }, [] );

  //2. 댓글 - 댓글의 상태체크 / 댓글처음에는 안보이게, 클릭하면 토글기능
  const [comment, setComment] = useState(false);
  const onClickComment = useCallback(() => { setComment(prev => !prev); }, []);

  /////////////////////////////////////////////////////// view
  return(
    <div style={{margin:'3%'}}>
      <Card
        cover={ post.Images && post.Images.length > 0 && <PostImages images={post.Images}/> }
        actions={[
          <RetweetOutlined key="retweet" />,
          like
            ? <HeartTwoTone twoToneColor="#f00" key="heart" onClick={onClickLike} />
            : <HeartOutlined key="heart" onClick={onClickLike} />,
          
          <MessageOutlined key="comment" onClick={onClickComment}/>,
          <Popover content={(
            <Button.Group>
              { id && id === post.User.id
              ?(
                <>
                <Button>수정</Button>
                <Button type="primary">삭제</Button>
                </>
               )
              : <Button style={{backgroundColor:'red', color:'white'}}>신고</Button>
              }
            </Button.Group>
          )}>
            <EllipsisOutlined />
          </Popover>
        ]}
      >
        <Card.Meta avatar={<Avatar>{post.User.nickname[0]}</Avatar>} 
                   title={post.User.nickname}
                   description={post.content} />
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

export default PostCard;