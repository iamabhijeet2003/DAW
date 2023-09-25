<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP first page</title>
</head>
<body>
    <!-- Basic syntax practice -->
    <h1>My first PHP application</h1>

    <br>
    <h2>Here I show the version</h2>
    <?php echo phpversion()
    ?>

    <?php $name = "Abhi"?>
    <h2>My name is Abhi</h2> 
    <h2>My name is <?php echo $name?></h2> 

    <h2>My name is <span style="color: blue;"><?php echo $name?></span></h2>

    <h2>My name is <?php echo "<h1>$name</h1>"; ?></h2>


    
</body>
</html>