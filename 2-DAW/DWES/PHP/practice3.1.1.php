<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Write a PHP script to display on the screen, in “dd‑mm‑yyyy” format, the date of yesterday, today and
        tomorrow.   
         Yesterday was 24-09-2023, today is 25-09-2023, and tomorrow will be
        26-09-2023 -->

        <?php
            $currentDate = date("d-m-Y");
            $yesterday = date("d-m-Y", strtotime("-1 day", strtotime($currentDate)));
            $tomorrow = date("d-m-Y", strtotime("+1 day", strtotime($currentDate)));


            echo "Yesterday was $yesterday, today is $currentDate, and tomorrow will be $tomorrow";
        ?>
</body>
</html>