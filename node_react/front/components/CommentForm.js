import React, { useCallback , useEffect} from 'react';
import { Form, Input, Button } from 'antd';
import PropTypes from 'prop-types';
import UserInput from '../hooks/UserInput';

// 1. ADD_COMMENT_REQUEST
import { ADD_COMMENT_REQUEST } from '../reducers/post';
// 2. useDispatch, useSelector
import { useDispatch, useSelector } from 'react-redux';

const CommentForm = ({ post }) => {  // 어떤게시글에 대한 댓글
    //3. addCommentLoading, addCommentDone
    const { addCommentLoading, addCommentDone } = useSelector( state => state.post );    
    const id = useSelector( state => state.user.user?.id);
    //4. dispatch
    const dispatch = useDispatch();

    ////////////////////////////////////////////////// code
    const [comment, onChangeComment, setText] = UserInput('');
    useEffect(() => {
      if (addCommentDone) { setText(''); }
    }, [addCommentDone]);
    const onSubmitForm = useCallback(() => {
      console.log( post.id, comment );
      dispatch({
        type: ADD_COMMENT_REQUEST,
        data: { content:comment, userId:id, postId:post.id }
      })
    }, [comment] );

    ////////////////////////////////////////////////// view
    return(
      <Form layout="vertical" style={{ margin:50, position:'relative' }} onFinish={onSubmitForm} >
          <Input.TextArea rows={5} value={comment} onChange={onChangeComment}  />
          <Button type="primary" style={{position:'absolute', right:0, bottom:-50,}}     
                  htmlType='submit' loading={addCommentLoading}>댓글</Button>
      </Form>
    );
};
CommentForm.propTypes = {
  post: PropTypes.object.isRequired
};
export default CommentForm;