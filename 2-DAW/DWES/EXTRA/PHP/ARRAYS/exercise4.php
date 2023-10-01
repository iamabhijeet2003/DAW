<!-- Write a PHP script that inserts a new item in an array in any position.
Expected Output :
Original array : 
1 2 3 4 5 
After inserting '$' the array is :
1 2 3 $ 4 5 -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $array1 = array(1,2,3,4,5,6);

        echo "Original Array: ";
        foreach($array1 as $a){
            echo "$a ";
        }
        echo "<br>";
        echo "Array after inserting '$' sign: ";
        array_splice($array1,3,0,'$');
        foreach($array1 as $a){
            echo "$a ";
        }
    ?>
</body>
</html>