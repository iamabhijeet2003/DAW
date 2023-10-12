<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Create a script using a for loop to add all the integers between 0 and 30 and display the total. -->
    <?php
    $total = 0;
    for($i=0;$i<=30;$i++){
        $total += $i;
       
    }

    echo $total;
    ?>
</body>
</html>