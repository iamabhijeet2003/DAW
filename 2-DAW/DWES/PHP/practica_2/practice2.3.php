<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<?php
/*
First and last character of any string
    Write a PHP script to obtain the first and the last character of any string that might or not end with a
    special character symbol.
    For instance, the last character of the string “Hello, world.” would be the “d”.
    And the last character of the string “Hello, world” would be the “d” as well.
*/

// Input string
$inputString = "Hello, world.";

// Find the position of the last period
$lastPeriodPosition = strrpos($inputString, '.');

// Remove the last period if it exists, else use the original string
$inputString = substr_replace($inputString, '', $lastPeriodPosition, ($lastPeriodPosition !== false) ? 1 : 0);

// Get the last character
$lastCharacter = substr($inputString, -1);

// Output the results
echo "Input string: $inputString\n";
echo "Last character: $lastCharacter\n";
?>

    
</body>
</html>
