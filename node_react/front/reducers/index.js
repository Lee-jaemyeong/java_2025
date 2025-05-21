import {HTPARTE, HYDRATE} from 'next-redux-wrapper'; // redux 상태를 서버애서 생성, 클라이언트에 전달
import { combineReducers } from 'redux';

import user from './user';
import post from './post';

// step3) 이전상태+액션 = 다음 상태
const rootReducer = combineReducers({
  index: ( state={}, action ) => {
    switch (action.type) {
    case HYDRATE : 
      console.log('HYDRATE', action);
      return { ...state, ...action.payload };
    default:
      return { ...state }
    }
  },
  user,
  post,
});
export default rootReducer;