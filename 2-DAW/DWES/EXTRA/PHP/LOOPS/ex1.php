<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    /* 
    Create a script that displays 1-2-3-4-5-6-7-8-9-10 on one line.
     There will be no hyphen(-) at starting and ending position.
    */

    for($i=1;$i<11;$i++){
        if($i<=9){
            echo "$i-";
        }else{
            echo $i;
        }
    }
    
    ?>
</body>
</html>