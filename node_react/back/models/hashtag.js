module.exports = ( sequelize , DataTypes ) => {
  ///const Hashtag
  const Hashtag = sequelize.define('Hashtag',{
    name : {
      type : DataTypes.STRING(20),
      allowNull : false,
    }
  },{
    charset : 'utf8',
    collate : 'utf8_general_ci'
  });
  ///관계설정
  Hashtag.associate = (db) => {
    db.Hashtag.belongsToMany(db.Post, {through:'PostHashtag'});
  };
  return Hashtag;
};