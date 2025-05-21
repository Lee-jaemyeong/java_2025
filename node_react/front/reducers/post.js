export const initalState = {
  mainPosts:[{
    id: 1, 
    User: { id:1, nickname:'JMlee' },
    content: '첫번째 게시글  #node #react',
    Images: [
      {src:'https://mblogthumb-phinf.pstatic.net/MjAxNzAzMjBfNzEg/MDAxNDkwMDE2OTA3NjI5.-p_6mhq3cUq7Nl4byOoEndBx1nij6GemuKNyxkK3xCIg.l5TMzs9JrL9YtmLZUXwkS3RV2w0OM22iUNsb9xWhOeIg.PNG.wizpet1756/1.PNG?type=w800'}, 
      {src:'https://mblogthumb-phinf.pstatic.net/MjAxNzAzMjBfNzEg/MDAxNDkwMDE2OTA3NjI5.-p_6mhq3cUq7Nl4byOoEndBx1nij6GemuKNyxkK3xCIg.l5TMzs9JrL9YtmLZUXwkS3RV2w0OM22iUNsb9xWhOeIg.PNG.wizpet1756/1.PNG?type=w800'}, 
      {src:'https://mblogthumb-phinf.pstatic.net/MjAxNzAzMjBfNzEg/MDAxNDkwMDE2OTA3NjI5.-p_6mhq3cUq7Nl4byOoEndBx1nij6GemuKNyxkK3xCIg.l5TMzs9JrL9YtmLZUXwkS3RV2w0OM22iUNsb9xWhOeIg.PNG.wizpet1756/1.PNG?type=w800'},],
    Comment: [{
      User: {nickname:'one'}, content:'hello'
    }, {
      User: {nickname:'two'}, content:'hi'
    }]
  }],
  postAdd: false,
  imagePaths: [],
}

export const addPost = { type:'ADD_POST', }

//////// dummyPost
const dummyPost = {
  id: 2,
  content: 'dummy',
  User: { id:1, nickname: 'JMlee' },
  Images: [],
  Comment: []
};
////////

export default ( state=initalState , action ) => {
  switch (action.type) {
    case 'ADD_POST':
      return {
        ...state,
        mainPosts: [dummyPost, ...state.mainPosts],   // 맨앞으로
        // mainPosts: [...state.mainPosts, dummyPost],   // 맨뒤로
        postAdd: true  // 글쓰기 추가
      }
    default: {
      return {...state}
    }
  }
}