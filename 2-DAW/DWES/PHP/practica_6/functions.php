<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 
        Write in the file functions.php a function named checkContactDate that accepts a string
        containing a date in the format “yyyy-mm-dd” and returns true if the date is correct. To be correct, the
        date must accomplish the next requirements:
        • The year must be between 1900 and 2100.
        • The month must be between 1 and 12.
        • The days must be between:
        – 1 and 31 if the month is 1, 3, 5, 7, 8, 10, 12.
        – 1 and 30 if the month is 4, 6, 9, 11.
        – 28 if the month is 2 and the year is not leap year; 29 if the month is 2 and the year is a leap
        year.
        Optionally, you can create a function to calculate if a year is a leap year.
        The function must be strictly typed, both the input parameters and the output values.
        Use the function in the main script to check if various dates are correct. If they are incorrect, show the
        proper error message.
     -->
    <?php

        function isLeapYear(int $year): bool {
            return ($year % 4 === 0 && $year % 100 !== 0) || ($year % 400 === 0);
        }
        function checkContactDate(string $date): bool{
            $dateSeparated = explode("-", $date);

            

            if(count($dateSeparated) != 3 || !checkdate($dateSeparated[1],$dateSeparated[2],$dateSeparated[0])) {
                return false;
            }

            $year = (int)$dateSeparated[0];
            $month = (int)$dateSeparated[1];
            $day = (int)$dateSeparated[2];
            
            
            if($year<1900 || $year>2100) {
                return false;
            }

            if($month< 1|| $month> 12) {
                return false;
            }


            switch ($month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return ($day >= 1 && $day <= 31);
                case 4:
                case 6:
                case 9:
                case 11:
                    return ($day >= 1 && $day <= 30);
                case 2:
                    return ($day >= 1 && ($day <= (isLeapYear($year) ? 29 : 28)));
                default:
                    return false;
            }
        }


        /*
        Write in the file functions.php a function named checkBirthday that accepts a string containing a date in the format “yyyy-mm-dd” and returns the number of days until the birthday. For example,
        if the input data is “1990-10-10” and today is “2023-10-15”, the function must return 5.
        Then, in the main script, if the number o days returned is 0, show the message:
        • Today is your birthday.
        IES Jaume II el Just - DWES 1/3
        Unit 03. Practice 3.1 Course 2023-2024
        If the number of days is between 1 and 7, show the message:
        • There are X days left for your birthday.
        Use the previous function to check if the input date is valid. If it’s not valid, return null.
        Remember to comment all the functions!!

        */

        function checkBirthday(string $birthdayDate):int{
            checkContactDate( $birthdayDate);

            $dateSeparated = explode("-", $birthdayDate);

            

            if(count($dateSeparated) != 3 || !checkdate($dateSeparated[1],$dateSeparated[2],$dateSeparated[0])) {
                return false;
            }

            $month = (int)$dateSeparated[1];
            $day = (int)$dateSeparated[2];


            $currentDate = date("Y-m-d");

            $birthdayDate = new DateTime("$year,$month,$day");
            $currentDateObj = new DateTime("$currentDate");
            $interval = $birthdayDate->diff($currentDateObj);

            return $interval->days;
        }
     ?>
</body>
</html>