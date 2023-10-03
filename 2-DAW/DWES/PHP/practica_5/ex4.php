<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Creating a function to sum an array
        Create a function that receives an array as a parameter. The array must have numbers.The function
        must do the addition of all the numbers in the array and then return the result
 -->
    <?php
        $array =array(1,2,3,4,5,6);
        function sumarArray($array){
            $suma = 0;
           

            foreach($array as $key => $value){
                $suma += $value;
            }

            return $suma;
        }


        echo sumarArray($array);
    ?>
</body>
</html>