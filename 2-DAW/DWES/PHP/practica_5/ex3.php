<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 
        Function to extract first and last character of a string
        Create a function that receives as a parameter a string. The function will return an array of 2 positions:
        in the first position we’ll get the first character of the string, and in the second position we’ll get the
        last character of the string. For example:
        1 $originalString='I am a student';
        2 // let's suppose that the name of the function is f
        3 $array=f($originalString);
        4 echo "First: ".$array[0]." Last: ".$array[1];
        The output should be: first: I, last: t
     -->

     <?php
        $orignalString = "I am a student";
        
        function returnFirstandLastChar($originalString) {
            $first_char = substr($originalString,0,1);
            $last_char = substr($originalString,-1,1);

            $arrayReturn = array($first_char, $last_char);
            return $arrayReturn;

        }

        $array = returnFirstandLastChar($orignalString);
        echo "First: ".$array[0]." Last: ".$array[1];
     ?>
</body>
</html>