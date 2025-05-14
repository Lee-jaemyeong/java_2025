module.exports = ( sequelize , DataTypes ) => {
  /// const User
  const User = sequelize.define('User' , { //users테이블 - 자동으로 s 붙어서 생성
    //id 기본값으로 자동설정
    email: {
      type : DataTypes.STRING(30) , // STRING, TEXT, BOOLEAN, INTEGER, FLOAT, DATATIME
      allowNull: false, // 필수
      unique : true , // 고유값
    },
    nickname: {
      type : DataTypes.STRING(30) ,
      allowNull: false,
    },
    password: {
      type : DataTypes.STRING(100) ,
      allowNull: false,
    },
  }, {
      charset : 'utf8',
      collate : 'utf8_general_ci' // 한글저장
  });  
  /// 관계설정
  User.associate = (db) => {
    db.User.hasMany(db.Post);
    db.User.hasMany(db.Comment);
    db.User.belongsToMany( db.Post , { through: 'Like' , as:'Liked' });
    db.User.belongsToMany( db.User , { through: 'Follow', as: 'Followers', foreignKey: 'FollowingId' });
    //                                                        user.getFollowers()
    // Follow 테이블에서 팔로우하는 사람 (FollowingId) 을 기준으로 관계설정 - 팔로우하는 사람 ID
    db.User.belongsToMany( db.User , { through: 'Follow', as: 'Followings', foreignKey: 'FollowerId' });
    //                                                        user.getFollowings()
  };
  return User;
};

