<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 
        Create a script to construct the following pattern, using nested for loop.

        *  
        * *  
        * * *  
        * * * *  
        * * * * *   
     -->
<?php
     $num = 5;
     for($i=0;$i<$num;$i++){
        for($j=0;$j<=$i;$j++){
            echo "*";
        }
        echo "<br>";
     }

     ?>
</body>
</html>