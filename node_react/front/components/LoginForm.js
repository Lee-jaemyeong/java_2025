import React, { useState, useCallback, useEffect } from 'react';
import {Input, Button, Form, Row, Col} from 'antd';
import Link from 'next/Link';
import UserInput from '../hooks/UserInput';

import {LOG_IN_REQUEST} from '../reducers/user';  //#1. redux
import {useDispatch, useSelector} from 'react-redux';  //#2. redux - useDispatch

const LoginForm = () => { //#3 redux

  const { logInLoading, logInError } = useSelector( state => state.user );

  ////////////////////////////////////////// code
  const [email, onChangeEmail] = UserInput('');   
  const [password, onChangePassword] = UserInput('');

  const dispatch = useDispatch(); //#4. redux

  //Q. 로그인 버튼 클릭시 - count의 숫자 증가, 콘솔창에 숫자증가   (useState)
  // const [count, setcount] = useState(1);
  // const onClickCount = useCallback(() => {
  //   setcount(count + 1);
  //   console.log(count)
  // });

    useEffect(() => {
    if (logInError) { alert(logInError); }
    }, [logInError]);


  const onSubmitForm = useCallback(() => { // 컴포넌트가 처음 렌더링될 때 한번만 생성
    //setIsLogin(true);
    dispatch( { type: LOG_IN_REQUEST, data: {email, password} });   //#5  redux
  }, [email, password]);    // id, password 값이 변경될 때

  ////////////////////////////////////////// view
  return (
    <>
      <Form layout='vertical' style={{ padding: '3%' }} onFinish={onSubmitForm} >
        <Form.Item label="아이디" name="email" >
          <Input placeholder="user@gmail.com 형식으로 입력" 
                 name="email" value={email} onChange={onChangeEmail} required />
        </Form.Item>
        <Form.Item label="비밀번호" name="password" >
          <Input.Password placeholder="비밀번호 입력" 
                          name="password" value={password} onChange={onChangePassword} required />
        </Form.Item>
        <Form.Item style={{textAlign:'center'}}>
          <Button type="primary" style={{ marginRight: '2%' }} htmlType='submit' loading={logInLoading} >로그인</Button>
          <Link href="/signup" legacyBehavior ><a><Button>회원가입</Button></a></Link>
        </Form.Item>
      </Form>
    </>
  );
};

export default LoginForm;