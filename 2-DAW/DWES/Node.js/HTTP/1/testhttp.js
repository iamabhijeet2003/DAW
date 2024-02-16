const http = require('http');

const server = http.createServer((req,res) => {
    console.log("metodo", req.method)
    console.log("url",req.url)
    res.end("Hola mundo desde server")   
})

server.listen(3000)