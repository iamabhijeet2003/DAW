<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <style>
        h1{
            color: blue;
        }

        form{
            color:green;
            font-weight: bolder;
        }

        div{
            
            color: blueviolet;
        }
        #send{
            background-color: blue;
            color: white;
        }
    </style>
</head>
<body>
    <h1>Practice 07</h1>
    <form action="valida.php" method="post">
        <label for="username">Username</label>
        <input type="text" name="username" id="username">

        <label for="passwd">Password</label>
        <input type="password" name="passwd" id="passwd">

        <br>Select a language to be attended
    <div>
        <label for="idioma">Castellano</label>
        <input type="radio" name="idioma" id="idioma" value="Castellano">
        <label for="idioma">Valencia</label>
        <input type="radio" name="idioma" id="idioma" value="Valencia">
        <label for="idioma">English</label>
        <input type="radio" name="idioma" id="idioma" value="English">
    </div>
            
    

        <input type="submit" value="Send" id="send">
    </form>
</body>
</html>