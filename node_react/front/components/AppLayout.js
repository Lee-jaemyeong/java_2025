import React, {useState, useMemo, useCallback} from 'react';  // react 불러오기
import PropTypes from 'prop-types'; // props 타입검사하는 역할
import Link from 'next/link';
import {Menu, Input, Row, Col} from 'antd';
import UserProfile from './UserProfile';
import LoginForm from './LoginForm';
import styled from 'styled-components';
import Router from 'next/router';

import { useSelector } from 'react-redux'; //## reducer1
import UserInput from '../hooks/UserInput'
const InputSearch = styled(Input.Search)`vertical-align: middle;`;

const AppLayout = ({children}) => {
  //2. login상태 
  //const [ isLogin , setIsLogin ] = useState(false);
  // 실수주의!
  const { user } = useSelector( state => state.user ); //##redux 2
  const stylebg = useMemo( () => ({backgroundColor:'#efefef'}) , []);
  const [searchInput, onChangeSearchInput] = UserInput('');
  const onSearch = useCallback(() => {
    Router.push(`/hashtag/${searchInput}`);
  },[searchInput]);
  ////////////////////////////////////////////////////
  const items = [
    { label:  <Link href="/" >LOGO</Link>, key:'/'},
    { label: <Link href="/profile" >프로필</Link>, key:'/profile' },
    { label: <Link href="/signup" >회원가입</Link>, key:'/signup' },
    { label: <InputSearch
              placeholder="input search text" 
              enterButton 
              value={searchInput}
              onChange={onChangeSearchInput}
              onSearch={onSearch}
              /> , key:'/search' 
    }
  ];

  /// 1. 변수 vs useState
  // 단순대입시 state값의 변경점을 reactDom 알지 못함.
  // let logo = "My react";
  // const changeLogo = () => { console.log('..... 로고바꾸기'); logo = "welcome!"; };
  let [logo, setLogo] = useState('... TheJoa ...'); // 2번째 - 함수를 통해서 재렌더링
  const changeLogo = () => { console.log('..... 로고바꾸기'); setLogo('LOGIN'); };

  //////////////////////////////////////////////////// # view
  return(
    <div>
      <Menu mode="horizontal" items={items} />
      <Row gutter={8}>
        <Col xs={24} md={6}> 
          {/*<h3 onClick={ ()=>{ console.log('....'); } }>{logo}</h3>*/}
          {/* <h3 onClick={ changeLogo } >{logo}</h3> */}
          { user? <UserProfile /> : <LoginForm /> }   {/* ##redux 3 */}

        </Col>
        <Col xs={24} md={12} style={stylebg} > {children} </Col>   
        <Col xs={24} md={6}> <div> 
          <a href="http://thejoa.com"
            target="_blank"
            rel="noreferrer noopener">TheJoa</a> copyrights. all reserved. </div> </Col>
      </Row>          
    </div>
  );
};
AppLayout.propTypes = {
  children : PropTypes.node.isRequired
};
export default AppLayout;