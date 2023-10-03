<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 
        Creating a function to sum or multiply an array
        Create a function that receives two parameters. The first is an array, and the second is a string. The
        array must have numbers, and the string can be “+” or “*“.
        If the string is “+”, then the function will return the addition of all the numbers in the array. If the string
        is “*“, then the function will return the multiplication of all the numbers in the array
     -->

    <?php
        function contarMultiplicar($array,$string){
            $suma = 0;
            $producto = 1;  
            if(substr($string,0,1) == "+"){
                foreach($array as $key => $value){
                    $suma += $value;
                }
                return $suma;
            }

            if(substr($string,0,1) == "*"){
                foreach($array as $key => $value){
                    $producto *= $value;
                }
                return $producto;
            }

        }

        $array = array(1,2,3,4);


        echo contarMultiplicar($array,"+")."<br>";
        echo contarMultiplicar($array,"*");

    ?>
</body>
</html>