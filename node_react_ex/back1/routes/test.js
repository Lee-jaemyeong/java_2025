const express = require('express');
const router = express.Router();

router.get('/', (req,res) => {res.send('test 확인')});

module.exports = router;