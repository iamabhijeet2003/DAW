<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Last element of an array
        We have an array which content we don’t know. Display on the screen the element in the last position
        of the array.
        1 $array1=(1,5,8,10);
        2 // we would show "10"
        3 $array2=("Pepe","Juan","Lola","Luisa","Ana","Jaime");
        4 // we would show "Jaime"
 -->

 <?php 
    $array1 = array(1,5,8,10);
    $array2 = array("Pepe","Juan","Lola","Luisa","Ana","Jaime");
    
    $array1Count = count($array1);
    $array2Count = count($array2);
  
    $array1LastIndex = $array1Count -1;
    $array2LastIndex = $array2Count -1;

    $array1LastElement = $array1[$array1LastIndex];
    $array2LastElement = $array2[$array2LastIndex];

    echo "$array1LastElement<br>";
    echo "$array2LastElement<br>";
    
?>

</body>
</html>
