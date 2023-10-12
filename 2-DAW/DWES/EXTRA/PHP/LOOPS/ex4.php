<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    //Write a factorial program using for loop in php
    function factorial($num){
        $fact = 1;
        for($i=$num;$i>=1;$i--){
            $fact = $fact*$i;

        }
        return $fact;
    }

    echo factorial(4);
    ?>
</body>
</html>