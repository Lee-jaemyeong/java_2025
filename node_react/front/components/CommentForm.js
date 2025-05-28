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
    const { addCommentLoading, addCommentDone } = useSelector( state => state.post ); // 중앙저장소   
    const id = useSelector( state => state.user.user?.id); // 사용자 체크
    //4. dispatch
    const dispatch = useDispatch();

    ////////////////////////////////////////////////// code
    const [comment, onChangeComment, setText] = UserInput('');
    useEffect(() => {
      if (addCommentDone) { setText(''); }
    }, [addCommentDone]);
    const onSubmitForm = useCallback(() => { // 전송버튼시
      console.log( post.id, comment );
      if(!id) {return alert('로그인이 필요합니다.'); } // 로그인시 댓글달기
      dispatch({
        type: ADD_COMMENT_REQUEST, // 타입요청
        data: { content:comment, userId:id, postId:post.id }
      })
    }, [comment, id]);
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