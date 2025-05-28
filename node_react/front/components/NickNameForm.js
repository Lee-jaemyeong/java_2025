import React , {useMemo, useCallback} from 'react';
import { Form, Input } from 'antd';
import { useSelector, useDispatch } from 'react-redux';

import userInput from '../hooks/UserInput';
import { CHANGE_NICKNAME_REQUEST } from '../reducers/user';

const NickNameForm = () => {
  const {user} = useSelector((state) => state.user);
  const [nickname, onChangeNickname] = userInput(user?.nickname || '');
  const dispatch = useDispatch();

  const onSubmit = useCallback (() => {
    dispatch({
      type: CHANGE_NICKNAME_REQUEST,
      data: nickname,
    });
  }, [nickname]);

  const style = useMemo(() => ({ margin:'1%', padding:'10px' }), []);

  return(
    <Form style={style} >
      <Input.Search value={nickname} onChange={onChangeNickname} addonBefore="닉네임" enterButton="수정" onSearch={onSubmit} />
    </Form>
  );
};

export default NickNameForm;