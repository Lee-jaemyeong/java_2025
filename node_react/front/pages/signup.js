import React, {useState, useCallback} from 'react';
import AppLayout from '../components/AppLayout';
import Head from 'next/head';
import { Form, Input, Button, Checkbox } from 'antd';
import UserInput from '../hooks/UserInput';
import styled from 'styled-components';

const ErrorMessage = styled.div`color:red;`;  // style.div( color:red; )

const Signup = () => {
  /////////////////////////////////////////////////////////// code
  const [id, onChangeId] = UserInput('');
  const [nickname, onChangeNickname] = UserInput('');
  const [password, onChangePassword] = UserInput('');

  const [passwordRe, setChangePasswordRe] = useState('');  
  const [passwordError, setPasswordError] = useState(false);
  const onChangePasswordRe = useCallback((e) => {
    setChangePasswordRe(e.target.value);
    setPasswordError(e.target.value !== password);
  }, [password]);

  const [check, setCheck] = useState('');
  const [checkError, setCheckError] = useState(false);
  const onChangeCheck = useCallback((e) => { // console.log(e.target.checked);
    setCheck(e.target.checked);  //ture
    setCheckError(false);
  }, []);

  const onSubmitForm = useCallback(() => {
    if (password !== passwordRe) { return setPasswordError(ture); }
    if (!check) { setCheckError(true); }
  }, [id, password, passwordRe, check]);

  /////////////////////////////////////////////////////////// view
  return(
    <>
      <Head>
        <meta charSet="utf-8"/>
        <title>Signup | TheJoa</title>
      </Head>
      <AppLayout>
        <Form layout='vertical' style={{ margin:'2%' }} onFinish={onSubmitForm}>
          <Form.Item>
            <label htmlFor='id'>이메일</label>
            <Input placeholder='user@email.com' id='id' value={id} onChange={onChangeId} name='id' required />
          </Form.Item>
          <Form.Item>
            <label htmlFor='nickname'>닉네임</label>
            <Input placeholder="닉네임 입력" id='nickname' value={nickname} onChange={onChangeNickname} name="nickname" required />
          </Form.Item>
          <Form.Item>
            <label htmlFor='password'>비밀번호</label>
            <Input.Password placeholder='비밀번호 입력' id='password' value={password} onChange={onChangePassword} name='password' required />
          </Form.Item>
          <Form.Item>
            <label htmlFor='password-re'>비밀번호 체크</label>
            <Input.Password placeholder='비밀번호 입력 체크' id='password-re' value={passwordRe} onChange={onChangePasswordRe} name='password-re' required />
            {passwordError && <ErrorMessage>비밀번호를 확인해주세요.</ErrorMessage>}
          </Form.Item>
          <Form.Item>
            <label htmlFor='check'>TheJoA는 회원들의 권리를 지킵니다. 약관 내용입니다.</label>
            <Checkbox id='check' name='check' checked={check} onChange={onChangeCheck}></Checkbox>
            {checkError && <ErrorMessage>약관에 동의하셔야 합니다.</ErrorMessage>}
          </Form.Item>
          <Form.Item>
            <Button type='primary' htmlType='submit'>회원가입</Button>
          </Form.Item>
        </Form>
      </AppLayout>
    </>
  );
};
export default Signup;