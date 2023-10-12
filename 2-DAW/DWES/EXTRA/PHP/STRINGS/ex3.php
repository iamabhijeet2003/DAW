<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    //Write a PHP program to count the words in the string
    $string = "This string has five words.";

    /*
    $string_words_count = explode(" ",$string);

    $number_of_words = count($string_words_count);
    echo "There are $number_of_words words in the string";
    */


    echo str_word_count($string);
    ?>
</body>
</html>