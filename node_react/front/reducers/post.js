export const initalState = {
  mainPosts:[{
    id: 1, 
    User: { id:1, nickname:'JMlee' },
    content: '첫번째 게시글  #node #react',
    Images: [
      {src:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT73XrVgkLQtIqmkflhAeZZXdxh7JYCnknRw&s'},
      {src:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT73XrVgkLQtIqmkflhAeZZXdxh7JYCnknRw&s'}, 
      {src:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT73XrVgkLQtIqmkflhAeZZXdxh7JYCnknRw&s'},],
    Comments: [{
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
  Comments: []
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