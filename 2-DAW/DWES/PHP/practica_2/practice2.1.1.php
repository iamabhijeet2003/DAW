<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        // return the first and the last character of a string
        $string = "Hola Mundo";

        $first_char = substr($string,0,1);
        $last_char = substr($string,-1,1);

        echo "Method 1:\n";
        echo "First character: " . $first_char . "\n";
        echo "Last character: " . $last_char . "\n";
    ?>
</body>
</html>
