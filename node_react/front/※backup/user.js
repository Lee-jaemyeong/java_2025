// step1) 초기값
export const initialState = {
    logInLoading: false,  // 로그인 시도중  -  로딩창
    logInDone: false,
    logInError: null,

    logOutLoading: false,  // 로그아웃 시도중  -  로딩창
    logOutDone: false,
    logOutError: null,

   //////////////////////////////////////// 추가1
   signUpLoading: false, // 회원가입 시도중
   signUpDone: false,
   signUpError: null,

   changeNicknameLoading: false, // 닉네임 변경 시도중
   changeNicknameDone: false,
   changeNicknameError: null,


   followDone: false,
   followError: null,

   unfollowLoading: false, // 언팔로우 시도중
   unfollowDone: false,
   unfollowError: null,

   //////////////////////////////////////// 추가1- END

    user: null,
    signupDate : {},
    loginDate : {}
};
////////////////////////////////////////////
// step2) 로그인할때마다 설정 함수
//// ver-1
export const loginAction = ( data ) => {
  return { type:'LOG_IN_REQUEST', data, }
};
export const logoutAction = {
  type: 'LOG_OUT_REQUEST',
};
//// ver-2
export const LOG_IN_REQUEST = 'LOG_IN_REQUEST';  // 로그인 시도중  -  로딩창
export const LOG_IN_SUCCESS = 'LOG_IN_SUCCESS';
export const LOG_IN_FAILURE = 'LOG_IN_FAILURE';

export const LOG_OUT_REQUEST = 'LOG_OUT_REQUEST';  // 로그아웃 시도중  -  로딩창
export const LOG_OUT_SUCCESS = 'LOG_OUT_SUCCESS'; 
export const LOG_OUT_FAILURE = 'LOG_OUT_FAILURE'; 

export const SIGN_UP_REQUEST = 'SIGN_UP_REQUEST';  // 로그아웃 시도중  -  로딩창
export const SIGN_UP_SUCCESS = 'SIGN_UP_SUCCESS'; 
export const SIGN_UP_FAILURE = 'SIGN_UP_FAILURE'; 

// --
export const CHANGE_NICKNAME_REQUEST = 'CHANGE_NICKNAME_REQUEST';
export const CHANGE_NICKNAME_SUCCESS = 'CHANGE_NICKNAME_SUCCESS'; 
export const CHANGE_NICKNAME_FAILURE = 'CHANGE_NICKNAME_FAILURE'; 

export const FOLLOW_REQUEST = 'FOLLOW_REQUEST';
export const FOLLOW_SUCCESS = 'FOLLOW_SUCCESS'; 
export const FOLLOW_FAILURE = 'FOLLOW_FAILURE'; 

export const UNFOLLOW_REQUEST = 'UNFOLLOW_REQUEST';
export const UNFOLLOW_SUCCESS = 'UNFOLLOW_SUCCESS'; 
export const UNFOLLOW_FAILURE = 'UNFOLLOW_FAILURE'; 

// --
const dummyUser = (data) => ({
  ...data,
  nickname: 'JMLee',
  id: 1,
  Posts: [{ id: 1 }],
  Followings: [{ nickname:'apple' }, { nickname:'banana' }, { nickname:'coconut' }],
  Followers: [{ nickname:'one' }, { nickname:'two' }, { nickname:'three' }]
});

// step3) 이전 + 상태 = 다음상태
export default ( state=initialState, action ) => {
  switch (action.type) {
  case LOG_IN_REQUEST:
    return {
      ...state,   // 이전
      logInLoading: true,  // 로그인 시도중  -  로딩창
      logInDone: false,
      logInError: null,
    }
  case LOG_IN_SUCCESS:
    return {
      ...state,   // 이전
      logInLoading: false,  // 로그인 시도중  -  로딩창
      logInDone: true,
      user : dummyUser(action.data)
    }    
  case LOG_IN_FAILURE:
    return {
      ...state,   // 이전
      logInLoading: false,  // 로그인 시도중  -  로딩창
      logInError: action.error,
    }       
  case LOG_OUT_REQUEST:
    return {
      ...state,   // 이전
      logOutLoading: true,  // 로그아웃 시도중  -  로딩창
      logOutDone: false,
      logOutError: null,
    }
  case LOG_OUT_SUCCESS:
    return {
      ...state,   // 이전
      logOutLoading: false,  // 로그아웃 시도중  -  로딩창
      logOutDone: true,
      user: null
    }    
  case LOG_OUT_FAILURE:
    return {
      ...state,   // 이전
      logOutLoading: false,
      logOutError: action.error
    }  
  ////////////////////////////////
  case SIGN_UP_REQUEST:
    return {
      ...state,   // 이전
      signUpLoading: true, // 회원가입 시도중
      signUpDone: false,
      signUpError: null,
    }
  case SIGN_UP_SUCCESS:
    return {
      ...state,   // 이전
      signUpLoading: false, // 회원가입 시도중
      signUpDone: true,
    }    
  case SIGN_UP_FAILURE:
    return {
      ...state,   // 이전
      signUpLoading: false, // 회원가입 시도중
      signUpError: action.error,
    }  
  ////////////////////////////////
  case CHANGE_NICKNAME_REQUEST:
    return {
      ...state,   // 이전
      changeNicknameLoading: true, // 닉네임 변경 시도중
      changeNicknameDone: false,
      changeNicknameError: null,
    }
  case CHANGE_NICKNAME_SUCCESS:
    return {
      ...state,   // 이전
      user: { ...state.user, nickname: action.data.nickname },
      changeNicknameLoading: false,
      changeNicknameDone: true,
    }    
  case CHANGE_NICKNAME_FAILURE:
    return {
      ...state,   // 이전
      changeNicknameLoading: false,
      changeNicknameError: action.error,
    }  
  ////////////////////////////////     
  default:
    return { ...state }
  }
};