import React, {useState, useCallback, useEffect} from 'react';
import AppLayout from '../components/AppLayout';
import Head from 'next/head';
import { Form, Input, Button, Checkbox } from 'antd';
import UserInput from '../hooks/UserInput';
import styled from 'styled-components';
import Router from 'next/router';

// 1. SIGN_UP_REQUEST
import { SIGN_UP_REQUEST } from '../reducers/user';
// 2. dispatch, useSelector
import {useDispatch, useSelector} from 'react-redux';

const ErrorMessage = styled.div`color:red;`;  // style.div( color:red; )

//--
const Signup = () => {
  // 3. useSelector 이용해서 - signUpLoading 가져오기
  const { signUpLoading, signUpDone, signUpError, user } = useSelector( state => state.user );
  // 4. dispatch 선언
  const dispatch = useDispatch();

  useEffect(() => {
    if (user && user.id) { Router.replace('/'); }
  }, [user && user.id]);

  useEffect(() => {
    if (signUpDone) { Router.replace('/'); } 
  }, [signUpDone]);

  useEffect(() => {
    if (signUpError) { alert(signUpError); } 
  }, [signUpError]);

  /////////////////////////////////////////////////////////// code
  const [email, onChangeemail] = UserInput('');
  const [nickname, onChangeNickname] = UserInput('');
  const [password, onChangePassword] = UserInput('');

  const [passwordRe, setChangePasswordRe] = useState('');  
  const [passwordError, setPasswordError] = useState(false);
  const onChangePasswordRe = useCallback((e) => {
    setChangePasswordRe(e.target.value);
    setPasswordError(e.target.value !== password);
  }, [password]);

  const [check, setCheck] = useState(false);
  const [checkError, setCheckError] = useState(false);
  const onChangeCheck = useCallback((e) => { // console.log(e.target.checked);
    setCheck(e.target.checked);  //true
    setCheckError(false);
  }, []);

  const onSubmitForm = useCallback(() => {
    if (password !== passwordRe) { return setPasswordError(true); }
    if (!check) { setCheckError(true); }

    // 5. dispatch
    return dispatch({
      type: SIGN_UP_REQUEST,
      data:{ email, password, nickname }
    });

  }, [email, password, passwordRe, check]);

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
            <label htmlFor='email'>이메일</label>
            <Input placeholder='user@email.com' id='email' value={email} onChange={onChangeemail} name='email' required />
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
            <Button type='primary' htmlType='submit' loading={signUpLoading} >회원가입</Button>
          </Form.Item>
        </Form>
      </AppLayout>
    </>
  );
};
export default Signup;