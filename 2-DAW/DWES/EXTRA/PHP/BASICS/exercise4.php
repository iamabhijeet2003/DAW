<!-- Write a PHP program to compute the sum of the two given integer values.
 If the two values are the same, then returns triple their sum. -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    function test($a, $b){
        if($a==$b){
            return (($a+$b)*3);
        } else{
            return ($a+$b);
        }
    }

    echo test(3,4)."\n";
    echo test(1,2)."\n";
    echo test(2,2)."\n";
    ?>

</body>
</html>
