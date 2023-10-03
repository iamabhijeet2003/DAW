<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 
        Validating a DNI
        Create a function that receives as a parameter a string. The string should be a valid DNI without the
        final char. The function must return the letter that fits the DNI, using this formula:
        dni % 23 —> a result between 0 and 22 With the result we will get the letter from this table
        0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
        T R W A G M Y F P D X B N J Z S Q V H L C K E
        If the DNI is not valid, then the function will return an error message like “DeNI not valid”.
        Call the function using your own DNI and check the result.
     -->

     <?php
       
        function validarDNI($dni) {
            $expectedLetter = 'TRWAGMYFPDXBNJZSQVHLCKE';
            if(is_numeric($dni) && strlen($dni)==8) {
                $letter = $dni%23;
                return $expectedLetter[$letter];
            } else{
                echo "Introduce un DNI correcto por favor.";
                return false;
            }

        }

        $dni = 20963415;
        $dni_incorrecto = "23nd233";         
        echo "La letra para el DNI: $dni es: ".validarDNI($dni)."<br>";
        echo validarDNI($dni_incorrecto)."<br>";
    ?>
</body>
</html>