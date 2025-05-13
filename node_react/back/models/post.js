module.exports = ( sequelize , DataTypes ) => {
  ///const Post
  const Post = sequelize.define('Post' , {
    content: {
      type : DataTypes.TEXT,
      allowNull : false,
    }
  } , {
    charset : 'utf8mb4',
    collate : 'utf8mb4_general_ci' // 이모티콘
  });
  ///관계설정
  Post.associate = (db) => {
    db.Post.hasMany(db.Image);   // post.addImages, post.getImages,
    db.Post.hasMany(db.Comment); // post.addcomments, post.getcomments
    db.Post.belongsTo(db.User);  // post.addUsers, post.getUsers, post.serUsers
    db.Post.belongsTo(db.Post, {as: 'Retweet'});  //post.addRetweet
    db.Post.belongsToMany(db.Hashtag, {through: 'PostHashtag'}); // post.addHashtags
    db.Post.belongsToMany(db.User, {through: 'Like' , as: 'Likers'}); // post.addLikers, post.removeLikers
  };
  return Post;
};