module.exports = ( sequelize , DataTypes ) => {
  ///const Image
  const Image = sequelize.define('Image',{
    src : { 
      type : DataTypes.STRING(200),
      allowNull : false,
    }
  },{
    charset : 'utf8',
    collate : 'utf8_general_ci'
  });
  ///관계설정
  Image.associate = (db) => {
    db.Image.belongsTo(db.Post);
  };
  return Image;
};