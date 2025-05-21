import React from 'react';
import { Card, Avatar, Button, List, Comment, Popover } from 'antd';
import { EllipsisOutlined, HeartOutlined, MessageOutlined, RetweetOutlined } from '@ant-design/icons';
import CommentForm from './CommentForm';
import PostImages from './PostImages';

const PostCard = ({post}) => {
  return(
    <div style={{margin:'3%'}}>
      <Card
        cover={ post.Images && post.Images.length > 0 && <PostImages images={post.images}/> }
        actions={[
          <RetweetOutlined/>,
          <HeartOutlined/>,
          <MessageOutlined key="comment" onClick={CommentForm}/>,
          <Popover content={(
            <Button.Group>
              <Button>수정</Button>
              <Button type="primary">삭제</Button>
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
    </div>
  );
};

export default PostCard;