<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!--  Extracting information from a date
            We have a string containing a date in theformat “dd/mm/YYYY”. Show on the screen the day, themonth
            and the year, every one in a separate line, without using date functions.
            1 $stringDate="10/11/2022";
            2 // we would display
            3 // Day: 10
            4 // Month: 11
            5 // Year: 2022
-->

        <?php
            $stringDate="10/11/2022";     
            $stringExtract = explode("/", $stringDate);

            echo("Day : $stringExtract[0]<br>");
            echo("Month : $stringExtract[1]<br>");
            echo("Year : $stringExtract[2]<br>");
        ?>
</body>
</html>
