module.exports = ( sequelize , DataTypes ) => {
  ///const Comment
  const Comment = sequelize.define('Comment',{
    content : {
      type : DataTypes.TEXT,
      allowNull : false,
    }
  },{
    charset : 'utf8mb4',
    collate : 'utf8mb4_general_ci' // 이모티콘
  });
  ///관계설정
  Comment.associate = (db) => {
    db.Comment.belongsTo(db.Post);
    db.Comment.belongsTo(db.User);
  };
  return Comment;
};