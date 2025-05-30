import React, {useState, useCallback, useEffect} from 'react';
import AppLayout from '../components/AppLayout';
import Head from 'next/head';
import NickNameForm from '../components/NickNameForm.js';
import FollowList from '../components/FollowList.js';
import { useSelector } from 'react-redux';
import Router from 'next/router';
import axios from 'axios';

//--
const Profile = () => {
  const {user} = useSelector( state => state.user ); // 중앙저장소 - user
  const [followersLimit, setFollowersLimit] = useState(3);
  const [followingsLimit, setFollowingsLimit] = useState(3);
  const [followersData, setFollowersData] = useState([]); 
  const [followingsData, setFollowingsData] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);  

  //1. 유저가 있는지 확인하고 /
  useEffect(() =>{ if(!(user && user.id)) { Router.push('/'); } } , [user && user.id])
  //2. 유저 호출
  useEffect(() => {
    ///////// axios
    const fetchData = async () => {
      try {
        setLoading(true);

        const followersResponse = await axios.get(
          `http://localhost:3065/user/followers?limit=${followersLimit}`, {withCredentials:true}
        );
        const followingsResponse = await axios.get(
          `http://localhost:3065/user/followings?limit=${followingsLimit}`, {withCredentials:true}
        );

        setFollowersData(followersResponse.data);
        setFollowingsData(followingsResponse.data);
      } catch (err) {
        setError(err);
      } finally {
        setLoading(false);
      }
    };
    fetchData();
  },[followingsLimit, followersLimit]);
  
  //3. 3명씩 followingsData 추가 - 3,6,9,,,,
  const loadMoreFollowings = useCallback(() => { setFollowingsLimit( prev=>prev+3 ); },[]);
  //4. 3명씩 followersData 추가 - 3,6,9,,,,
  const loadMoreFollowers = useCallback(() => { setFollowersLimit( prev=>prev+3 ); },[]);

  // const data = [ {nickname:'Title1',}, {nickname:'Title2',}, {nickname:'Title3',}, {nickname:'Title4',}, ];

  if (!user) { return ".... 내정보 로딩중"; }
  if (error) { console.error(error); return "<div>팔로잉/팔로워 로딩중 에러발생</div>"; }

  return(
    <>
      <Head>
        <meta charSet="utf-8"/>
        <title>Profile | TheJoa</title>
      </Head>
      <AppLayout>
        <NickNameForm/>
        <FollowList header="팔로잉" data={followingsData} onClickMore={loadMoreFollowings} loading={ !setFollowingsData && !error} />
        <FollowList header="팔로워" data={followersData} onClickMore={loadMoreFollowers} loading={ !setFollowersData && !error } />
      </AppLayout>
    </>
  );
};
export default Profile;