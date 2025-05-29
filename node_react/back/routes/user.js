const express = require('express');
const router = express.Router();
const bcrypt = require('bcrypt');
const passport = require('passport');
const {User, Post, Image, Comment} = require('../models');
const { isLoggedIn, isNotLoggedIn } = require('./middlewares');
const {Op} = require('sequelize');

// 1. 회원가입
// localhost:3065/user/
// 설정1 : Header Content-Type : application/json
// 설정2 : Body  -[Row]  -[Json]
// { "email": "test@test.com", "nickname" : "test", "password": "test"}
router.post('/', isNotLoggedIn, async (req, res, next) => { //res.send('.... 회원가입');
  try{
    //1. 이메일 중복확인  sql - select: 객체.findOne
    const user = await User.findOne({where: {email: req.body?.email}});
    //2. 결과확인 - 존재하면 이미 사용중인 아이디입니다.
    if(user) { return res.status(403).send('이미 사용중인 아이디입니다.'); }
    //3. 비밀번호 암호화
    const hashPassword = await bcrypt.hash(req.body.password, 12); // 암호화강도 10~13
    //4. 사용자 생성  객체.create
    await User.create({
      email: req.body.email,
      nickname: req.body.nickname,
      password: hashPassword,
    });
    //5. 응답 - 회원가입 성공 ok
    res.status(201).send('회원가입완료!');
  }catch(error) {
    console.error(error);
    next(error);
  }
});

// 2. 로그인
// localhost:3065/user/login
router.post('/login', isNotLoggedIn, async (req, res, next) => { // res.send('.... 로그인');
  passport.authenticate('local' , ( err, user, info ) => {
    //1. err 오류처리
    if(err) { console.error(err); return next(err); }

    //2. 인증정보있다면 - 세션 401 상태코드 ( 인증필요 )
    if(info) { return res.status(401).send(info.reason); }

    //3. 사용자세션에 등록
    return req.login( user, async (loginErr) => {
      // 3-1. 로그인시 에러발생
      if(loginErr) { console.error(loginErr); return next(loginErr); }
      // 3-2. 사용자정보조회 ( sql - join )
      const fullUser = await User.findOne({  // select
        where:{ id: user.id } , // 아이디를 이용해서 정보조회
        attributes: { exclude: ['password'] }, // password 제외하고 조회
        include: [{ model: Post, attributes: ['id'] }, 
                  { model: User, as:'Followers', attributes: ['id'] }, // 사용자가 팔로우한 다른 유저 id 
                  { model: User, as:'Followings', attributes: ['id'] }], // 사용자를 팔로우하는 다른 유저 id
      });
      return res.status(200).json(fullUser);
    });
  })(req, res, next);  // passport.authenticate()의 반환값을 즉시실행
});

//3. 로그인한 경우 사용자의 정보가져오기
//  GET: localhost:3065/user
// 설정1 : Header Cookie: connect.sid=Cookie 값으로 설정된 값
// 로그인 후에 Cookie에 id값

/*
3-1. router.get 이용해서 - 사용자정보페이지  출력
3-2. 1) 로그인사용자확인, 로그인한 유저 정보반환 
*/
router.get('/', isLoggedIn, async (req, res, next) => { //res.send('사용자 정보 조회');
  try {
    //1) 로그인사용자확인
    //2) 로그인한 유저 정보반환 
    if(req.user) {
      const fullUser = await User.findOne({
        // 조건: id로 검색
        where:{ id: req.user.id },
        // 비밀번호 제외 결과 가져오기
        attributes: {exclude: ['password']},
        // Post, Followers, Followings
        include: [{ model: Post, attributes: ['id'] },
                  { model: User, as:'Followers', attributes: ['id'] },
                  { model: User, as:'Followings', attributes: ['id'] }]
      });
      res.status(200).json(fullUser);
    } else {
      res.status(200).json(null);  // 로그인안되면 null 반환
    }
  } catch(error) {
    console.error(error);
    next(error);
  }
});

//4. 로그아웃
// POST: localhost:3065/user/logout  로그아웃기능입니다. 출력
router.post('/logout', isLoggedIn, (req, res, next) => {
  //res.send('로그아웃기능입니다.');
  req.logout(function(err) {
    if(err) { return next(err); }
    req.session.destroy((err) => {
      if (err) {
        return next(err);
      }
      // 현재 세션 삭제
    res.send('로그아웃 성공!'); // 로그아웃이 되면 문자열 반환
    });
  });
});

//5. 닉네임변경
// POST: localhost:3065/user/nickname  닉네임변경 출력
// 1. 로그인
// 2. Header 쿠키설정
// 3. Body - [Raw] - [Json] { "nickname":"4444" }
router.patch('/nickname', isLoggedIn, async (req, res, next) => {
  //res.send('닉네임변경');
  // update users set nickname=? where id=?
  try{
    await User.update({
      nickname: req.body.nickname,
    } , {
      where: { id: req.user.id }
    });
    res.status(200).json({ nickname: req.body.nickname });
  } catch(error) {
    console.error(error);
    next(error);
  }
});

//////////////////////////////////////////////
//6. 팔로우
// PATCH: localhost:3065/users/:userId/follow  팔로우기능추가
//        localhost:3065/users/2/follow
//1. 위의 경로로 router 작성
//2. 넘겨받은 아이디로 유저인지 select 구문확인 / User.findOne
//3. 유저에 추가 user.addFollowers
//4. 상태표시
router.patch('/:userId/follow', isLoggedIn, async ( req, res, next ) => {
  try {
    const user = await User.findOne({ where: { id:req.params.userId } });
    if (!user) { res.status(403).send('유저를 확인해주세요'); }

    await user.addFollowers(req.user.id);
    res.status(200).json({ UserId: parseInt(req.params.userId , 10) }); //10진수

  } catch(error) {
    console.error(error);
    next(error);
  }
});


//7. 팔로잉찾기 ( 내가 찾아보는 친구들 )
// GET: localhost:3065/users/followings
//1. 위의 경로로 router 작성
//2. 넘겨받은 아이디로 유저찾기
//3. 해당유저의 팔로잉찾기 user.getFollowings()
router.get('/followings', isLoggedIn, async ( req, res, next ) => {
  try{
    const user = await User.findOne({ where: { id: req.user.id } });
    if (!user) { res.status(403).send('유저를 확인해주세요'); } // 403 금지된.없는 유저

    const followings = await user.getFollowings();
    res.status(200).json(followings);
  } catch(error) {
    console.error(error);
    next(error);
  }
});

//8. 팔로우찾기
// GET: localhost:3065/users/followers
//1. 위의 경로로 router 작성
//2. 넘겨받은 아이디로 유저찾기
//3. 해당유저의 팔로워찾기 user.getFollowers()
router.get('/followers', isLoggedIn, async ( req, res, next ) => {
  try{
    const user = await User.findOne({ where: { id: req.user.id } });
    if (!user) { res.status(403).send('유저를 확인해주세요'); }

    const followers = await user.getFollowers();
    res.status(200).json(followers);    
  } catch(error) {
    console.error(error);
    next(error);
  }
});

//9. 언팔로우
// DELETE: localhost:3065/users/:userId/follow
//         localhost:3065/users/2/follow  (친구번호)
//1. 위의 경로로 router 작성
//2. 언팔로우할 친구찾기
//3. 팔로우 삭제 - removeFollowers
//4. 상태표시
router.delete('/:userId/follow', isLoggedIn, async (req, res, next) => {
  try {
    const user = await User.findOne( {where: {id: req.params.userId}});
    if (!user) { res.status(403).send('유저를 확인해주세요'); }
    
    await user.removeFollowers( req.user.id );
    res.status(200).json({ UserId: parseInt( req.params.userId, 10 )});
  } catch(error) {
    console.error(error);
    next(error);
  }
});

//10. 나를 팔로워한 사람 차단
// DELETE: localhost:3065/users/follower/:userId
//1. 위의 경로로 router 작성
//2. 언팔로우할 친구찾기
//3. 팔로우 삭제 - removeFollowers
//4. 상태표시
router.delete('/follower/:userId', isLoggedIn, async (req, res, next) => {
  try {
    const user = await User.findOne({ where: { id: req.params.userId } });
    if (!user) { res.status(403).send('유저를 확인해주세요'); }

    await user.removeFollowings(req.user.id);
    res.status(200).json({ UserId: parseInt( req.params.userId, 10 )})
  } catch(error) {
    console.error(error);
    next(error);
  }
});

//11. 각유저별 해당정보 GET  /user/1
router.get('/:userId', async (req, res, next) => {
  try {
    //1) 로그인사용자확인
    //2) 로그인한 유저 정보반환 
      const fullUser = await User.findOne({
        where:{ id: req.params.userId }, // 조건: id로 검색
        attributes: {exclude: ['password']}, // 비밀번호 제외 결과 가져오기
        include: [{ model: Post, attributes: ['id'] },
                  { model: User, as:'Followers', attributes: ['id'] },
                  { model: User, as:'Followings', attributes: ['id'] }]
      }); // Post, Followers, Followings
      if (fullUser) {
        const data = fullUser.toJSON();
        data.Posts = data.Posts.length;
        data.Followers = data.Followers.length;
        data.Followings = data.Followings.length;
        res.status(200).json(data);  
        console.log('.......... user/번호',data);
      } else {
        res.status(404).json('유저를 확인해주세요.');
      }
  } catch(error) {
    console.error(error);
    next(error);
  }
});

//12. 해당유저의 포스트가져오기
// GET   /user/1/posts
router.get('/:userId/posts', async (req, res, next) => {
  // res.send('posts - 10개');
  try{
    const where = { UserId: req.params.userId };
    // 맨마지막에서 10개 카운트시 글중간에 추가 + [11] 10,,,
    if( parseInt(req.query.lastId, 10) ) { where.id={ [Op.lt]: parseInt(req.query.lastId, 10) } }
    const posts = await Post.findAll({
      where,
      limit: 10,
      order: [
        ['createdAt','DESC'],
        [Comment,'createdAt','DESC']
      ],
      include: [
        { model: User , attributes: ['id','nickname'] },
        { model: Image },
        { model: Comment, include: [{ model: User , attributes: ['id','nickname']}] },
        { model: User, as: 'Likers', attributes: ['id'] },
        { model: Post, as: 'Retweet', include: [{ model: User, attributes: ['id','nickname'] }, { model: Image }] } // 원본글 작성자와 이미지 포함.
      ]
    });
    res.status(200).json(posts);
  } catch(error) {
    console.error(error);
    next(error);
  }
});

//////////////////////////////////////////////
module.exports = router;