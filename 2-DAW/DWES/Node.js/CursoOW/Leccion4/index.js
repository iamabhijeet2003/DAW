const http = require('http');
const fs = require('fs');

http.createServer(function (req, res){
    if(req.method==='GET'){
        res.writeHead(200, {'Content-type': 'text/html'});
        fs.createReadStream('./public/index.html','utf-8').pipe(res);
    }else if(req.method==='POST'){
        let body = '';

        req.on('data',chunk =>{
            body += chunk;
        });

        req.on('end', ()=>{
            res.end(body);
        })
    }
}).listen(3024)