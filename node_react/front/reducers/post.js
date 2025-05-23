import shortId from 'shortid';

export const initialState = {
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
  }],
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
export default ( state=initialState , action ) => {
  switch (action.type) {
    case ADD_COMMENT_REQUEST:
      return {
        ...state,   // 이전(1)
        addCommentLoading: true,
        addCommentDone: false,
        addCommentError: null,
      }
    case ADD_COMMENT_SUCCESS:
      //1. postIndex 해당글가져오기
      const postIndex = state.mainPosts.findIndex( v => v.id === action.data.postId );
      const post = {...state.mainPosts[postIndex]};
      //2. post.Comments
      post.Comments = [dummyComment(action.data.content), ...post.Comments];
      //3. mainPosts 추가
      const mainPosts = [...state.mainPosts];
      mainPosts[postIndex] = post;
      return {
        ...state,   // 이전(1)
        mainPosts,
        addCommentLoading: false,
        addCommentDone: true,
      }    
    case ADD_COMMENT_FAILURE:
      return {
        ...state,   // 이전
        addCommentLoading: false,
        addCommentError: action.error,
      }
    //////////////////////// ADD COMMENT END
    case ADD_POST_REQUEST:
      return {
        ...state,   // 이전(1)
        addPostLoading: true,
        addPostDone: false,
        addPostError: null,  // 바뀐상태(2) = next(3)
      }
    case ADD_POST_SUCCESS:
      return {
        ...state,   // 이전(1)
        mainPosts : [dummyPost(action.data), ...state.mainPosts],
        addPostLoading: false,
        addPostDone: true,  // 바뀐상태(2) = next(3)
      }    
    case ADD_POST_FAILURE:
      return {
        ...state,   // 이전
        addPostLoading: false,
        addPostError: action.error,
      }
/////////////////////////////////////////////// REMOVE_POST
    case REMOVE_POST_REQUEST:
      return {
        ...state,   // 이전(1)
        removePostLoading: true,
        removePostDone: false,
        removePostError: null,  // 바뀐상태(2) = next(3)
      }
    case REMOVE_POST_SUCCESS:
      return {
        ...state,   // 이전(1)
        mainPosts : state.mainPosts.filter( v => v.id !== action.data ),
        removePostLoading: false,
        removePostDone: true,  // 바뀐상태(2) = next(3)
      }    
    case REMOVE_POST_FAILURE:
      return {
        ...state,   // 이전
        removePostLoading: false,
        removePostError: action.error,
      }
    default: {
      return {...state}          
    }
  }
}