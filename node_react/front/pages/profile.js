import React from 'react';
import AppLayout from '../components/AppLayout';
import Head from 'next/head';
import NickNameForm from '../components/NickNameForm.js';
import FollowList from '../components/FollowList.js';

const Profile = () => {
  const data = [ {nickname:'Title1',}, {nickname:'Title2',}, {nickname:'Title3',}, {nickname:'Title4',}, ];

  return(
    <>
      <Head>
        <meta charSet="utf-8"/>
        <title>Profile | TheJoa</title>
      </Head>
      <AppLayout>
        <NickNameForm/>
        <FollowList header="팔로잉" data={data} />
        <FollowList header="팔로워" data={data} />
      </AppLayout>
    </>
  );
};
export default Profile;