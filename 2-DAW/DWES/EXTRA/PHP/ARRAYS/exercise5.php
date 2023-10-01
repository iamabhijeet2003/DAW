<!-- Write a PHP script to sort the following associative array :
array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40") in
a) ascending order sort by value
b) ascending order sort by Key
c) descending order sorting by Value
d) descending order sorting by Key -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $array1 = array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
        asort($array1);
        echo"Ascending order sort by value<br>";
        foreach($array1 as $name => $age) {
            echo "Age of $name is $age.<br>";
        }

        $array2 = array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
        ksort($array2);
        echo "<br>Ascending order sort by Key<br>";
        foreach($array2 as $name => $age) {
            echo "Age of $name is $age.<br>";
        }

        $array3 = array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
        arsort($array3);
        echo "<br>Descending order sorting by Value<br>";
        foreach($array3 as $name => $age) {
            echo "Age of $name is $age.<br>";
        }

        $array4 = array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
        krsort($array4);
        echo "<br>Descending order sorting by key<br>";
        foreach($array4 as $name => $age) {
            echo "Age of $name is $age.<br>";
        }
    ?>
</body>
</html>