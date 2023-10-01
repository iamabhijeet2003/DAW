<!-- 
     
$color = array(4 => 'white', 6 => 'green', 11=> 'red');
Write a PHP script to get the first element of the above array.
Expected result : white

-->
<!DOCTYPE html> 
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
             
    $color = array(4 => 'white', 6 => 'green', 11=> 'red');
    
    echo reset($color);
    ?>
</body>
</html>