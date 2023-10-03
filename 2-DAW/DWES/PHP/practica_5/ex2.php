<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 
        Classify elements from an array
        Given an array with 10 numbers, display on the screen how many numbers are with one digit, two
        digits, three digits and more than three digits.
            -->
    <?php
    $array=array(10,4,44,233,1000,9,99,999,3,27);
    $one_digit = 0;
    $two_digit = 0;
    $three_digit = 0;
    $more_than_three = 0;
   
    foreach($array as $value){
        $length = strlen($value);
        if($length==1){
            $one_digit += 1;
        } else if($length== 2){
            $two_digit += 1;
        } else if ( $length== 3){
            $three_digit += 1;
        } else{
            $more_than_three++;
        }
    }
    echo "One digit number : $one_digit <br>";
    echo "Two digit number : $two_digit <br>";
    echo "Three digit number : $three_digit <br>";
    echo "More than 3 digits number : $more_than_three <br>";

    ?>
</body>
</html>