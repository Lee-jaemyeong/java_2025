const Sequelize = require('sequelize');
const env = process.env.NODE_ENV || 'development';
const config = require('/../config/config.json')[env];
const db = {};

sequelize = new Sequelize(config.database, config.username, config.password, config);

db.sequelize = sequelize;
db.Sequelize = Sequelize;

module.exports = db;
