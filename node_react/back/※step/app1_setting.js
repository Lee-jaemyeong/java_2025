const http = require('http');
const server = http.createServer( (req, res) => {
  console.log( req.url , req.method );
  res.write("<h1>one</h1>");
  res.write("<h2>two</h2>");
  res.write("<h3>three</h3>");
  res.end('hello node');
});

server.listen( 3065 , () => {
  console.log('서버실행 중.....');
});
