import React, { useCallback } from 'react';
import { Form, Input, Button } from 'antd';
import PropTypes from 'prop-types';
import UserInput from '../hooks/UserInput';
import { useSelector } from 'react-redux';

const CommentForm = ({ post }) => {  // 어떤게시글에 대한 댓글
    ////////////////////////////////////////////////// code
    const {isLogin} = useSelector( state => state.user );
    const [comment, onChangeComment] = UserInput('');
    const onSubmitForm = useCallback(() => {
      console.log( post.id, comment );
    }, [comment] );
    ////////////////////////////////////////////////// view
    return(
      <Form layout="vertical" style={{ margin:50, position:'relative' }} onFinish={onSubmitForm} >
          <Input.TextArea rows={5} value={comment} onChange={onChangeComment}  />
          <Button type="primary" style={{position:'absolute', right:0, bottom:-50,}}     
                  htmlType='submit'>댓글</Button>
      </Form>
    );
};
CommentForm.propTypes = {
  post: PropTypes.object.isRequired
};
export default CommentForm;