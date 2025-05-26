import shortId from 'shortid';
import produce from 'immer';
import {faker} from '@faker-js/faker';
faker.seed(123);

export const initialState = {
  /*
  mainPosts:[{
    id: 1, 
    User: { id:1, nickname:'JMlee' },
    content: '첫번째 게시글  #node #react',
    Images: [
      { id:shortId.generate() , src:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT73XrVgkLQtIqmkflhAeZZXdxh7JYCnknRw&s'},
      { id:shortId.generate() , src:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT73XrVgkLQtIqmkflhAeZZXdxh7JYCnknRw&s'}, 
      { id:shortId.generate() , src:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT73XrVgkLQtIqmkflhAeZZXdxh7JYCnknRw&s'},
    ],
    Comments: [{
      id:shortId.generate(), 
      User: {id:shortId.generate(), nickname:'one'}, content:'hello'
    }, {
      User: {id:shortId.generate(), nickname:'two'}, content:'hi'
    }]
  }], */
  mainPosts: [],
  /////////////////////////// 추가 START
    //postAdd: false,
    imagePaths: [],
    hasMorePosts: true,

    loadPostsLoading: false,
    loadPostsDone: false,
    loadPostsError: null,

    addPostLoading: false,
    addPostDone: false,
    addPostError: null,

    removePostLoading: false,
    removePostDone: false,
    removePostError: null,

    addCommentLoading: false,
    addCommentDone: false,
    addCommentError: null,
  /////////////////////////// 추가 END 
}

export const addPost = { type:'ADD_POST_REQUEST', }
export const addPostAction = ( data ) => {
  return { type:'ADD_POST_REQUEST', data, }
};

//////// dummyPost
const dummyPost = (data) => ({
  //id: 2,
  id:shortId.generate(),
  content: data,
  User: { id:1, nickname: 'JMlee' },
  Images: [],
  Comments: []
});

const dummyComment = (data) =>({
  //id: 2,
  id:shortId.generate(),
  content: data,
  User: { id:1, nickname: 'JMlee' },
});
//10개씩 무한스크롤 부르는 메서드
export const generateDummyPost = (number) => Array(number).fill().map(() => ({
    id: shortId.generate(), 
    User: { id:shortId.generate(), nickname:faker.internet.username(), },
    content: faker.lorem.paragraph(),
    Images: [
      { src: faker.image.avatar() },
    ],
    Comments: [{
      id:shortId.generate(), 
      User: {id:shortId.generate(), nickname: faker.internet.username()}, content: faker.lorem.sentence()
      }
    ]
  })
);

export const LOAD_POST_REQUEST = 'LOAD_POST_REQUEST'; 
export const LOAD_POST_SUCCESS = 'LOAD_POST_SUCCESS';
export const LOAD_POST_FAILURE = 'LOAD_POST_FAILURE';

export const ADD_POST_REQUEST = 'ADD_POST_REQUEST';
export const ADD_POST_SUCCESS = 'ADD_POST_SUCCESS';
export const ADD_POST_FAILURE = 'ADD_POST_FAILURE';

export const REMOVE_POST_REQUEST = 'REMOVE_POST_REQUEST';
export const REMOVE_POST_SUCCESS = 'REMOVE_POST_SUCCESS';
export const REMOVE_POST_FAILURE = 'REMOVE_POST_FAILURE';

export const ADD_COMMENT_REQUEST = 'ADD_COMMENT_REQUEST';
export const ADD_COMMENT_SUCCESS = 'ADD_COMMENT_SUCCESS';
export const ADD_COMMENT_FAILURE = 'ADD_COMMENT_FAILURE';

///////////////////////////////////////////////////////// next
// ADD_POST_REQUEST
// ADD_POST_SUCCESS
// ADD_POST_FAILURE
const reducer = (state=initialState , action) => produce(state, (draft) => {
  switch (action.type) {
    case ADD_COMMENT_REQUEST:
      draft.addCommentLoading = true;
      draft.addCommentDone = false;
      draft.addCommentError = null;
      break;
    case ADD_COMMENT_SUCCESS:
      //1. postIndex 해당글가져오기
        const post = draft.mainPosts.find((v) => v.id === action.data.postId);
      //2. post.Comments
        post.Comments.unshift(dummyComment(action.data.content));
      draft.addCommentLoading = false;
      draft.addCommentDone = true;
      break;
    case ADD_COMMENT_FAILURE:
      draft.addCommentLoading = false;
      draft.addCommentError = action.error;
      break;
    //////////////////////// ADD COMMENT END
    case ADD_POST_REQUEST:
      draft.addPostLoading = true;
      draft.addPostDone = false;
      draft.addPostError = null;
      break;
    case ADD_POST_SUCCESS:
      draft.addPostLoading = false;
      draft.addPostDone = true;
      draft.mainPosts.unshift(dummyPost(action.data));
      break;
    case ADD_POST_FAILURE:
      draft.addPostLoading = false;
      draft.addPostError = action.error;
      break;
/////////////////////////////////////////////// POST END
    case REMOVE_POST_REQUEST:
      draft.removePostLoading = true;
      draft.removePostDone = false;
      draft.removePostError = null;
      break;
    case REMOVE_POST_SUCCESS:
      draft.removePostLoading = false;
      draft.removePostDone = true;
      draft.mainPosts = draft.mainPosts.filter( v => v.id !== action.data );
      break;
    case REMOVE_POST_FAILURE:
      draft.removePostLoading = false;
      draft.removePostError = action.error;
      break;
/////////////////////////////////////////////// REMOVE_POST END    
    case LOAD_POST_REQUEST:
      draft.loadPostsLoading = true;
      draft.loadPostsDone = false;
      draft.loadPostsError = null;
      break;
    case LOAD_POST_SUCCESS:
      draft.loadPostsLoading = false;
      draft.loadPostsDone = true;
      draft.mainPosts = action.data.concat(draft.mainPosts); //새로운 데이터10 + 기존 데이터
      console.log('....... mainPosts', action.data.concat(draft.mainPosts).length);
      draft.hasMorePosts = draft.mainPosts.length < 50;  // 게시물 50개 부근 보이게 체크
      break;
    case LOAD_POST_FAILURE:
      draft.loadPostsLoading = false;
      draft.loadPostsError = action.error;
      break;

    default:
      break;          
  }
});

export default reducer;