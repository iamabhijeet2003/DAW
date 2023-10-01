<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!--  Write a PHP program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference.
            Sample Input:
            53
            30
            51
            Sample Output:
            6
            21
            0 
    -->

    <?php 
        $n ;
       
        function differenceCalculator($n){
            $principalNumber = 51;
            if($n > $principalNumber){
                echo ($n-$principalNumber)*3;
            }
            echo "($principalNumber-$n)\n";
        }


        differenceCalculator(53);
        differenceCalculator(55);
        differenceCalculator(20);
        differenceCalculator(0);
    ?>
</body>
</html>