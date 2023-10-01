<!--
Create a simple HTML form and accept the user name and display the name through PHP echo statement.
-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Please input your name : </h2>
    <form method="post">
        <label for="name">Name</label>
        <input type="text" id="name" name="name">
        <input type="submit" value="submit">
    </form>

    <?php 
    //here we retrieve the name to show later
    $name = $_POST['name'];
    echo "<h1>Hello $name</h1>";

    ?>
</body>
</html>
