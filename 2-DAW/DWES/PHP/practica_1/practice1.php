<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Kilometres to miles converter -->
    <h1 style="color: blue;">Practice 01</h1>
    <h2 style="color: red">Kilometres to miles</h2>
    <?php 
        $oneKM = 0.641371;
        $kms=10;

        $resultado=$oneKM*$kms;

        var_dump($resultado);
        echo "<h3 style='color: green;'>$kms kilometres are $resultado miles</h3>";
    ?>
</body>
</html>
