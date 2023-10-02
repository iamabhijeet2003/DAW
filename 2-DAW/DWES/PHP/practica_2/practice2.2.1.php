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
    First and last character of any string
    Write a PHP script to obtain the first and the last character of any string that might or not end with a
    special character symbol.
    For instance, the last character of the string “Hello, world.” would be the “d”.
    And the last character of the string “Hello, world” would be the “d” as well.
    */
        $string = "Hola Mundo.";
        $stringSinPunto = str_replace('.','',$string);
        $first_char = substr($stringSinPunto,0,1);
        $last_char = substr($stringSinPunto,-1,1);
        echo "Ejercicio 2.2 Method 1:\n";
        echo "First character: " . $first_char . "\n";
        echo "Last character: " . $last_char . "\n";
    ?>

</body>
</html>
