<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 
        Given the same array of the previous exercise, display on screen only the numbers placed in pair positions.
        $array=array(10,4,5,7,8,11,222,33,14);
     -->

     <?php
        $array=array(10,4,5,7,8,11,222,33,14);
        foreach($array as $key =>$value){
            if($key%2== 0){
                echo"$value<br>";
            }
        }
     ?>
</body>
</html>