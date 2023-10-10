<?php
    include("functions.php");

    

    $datesToCheck = [
    '2023-02-29', // Invalid leap year date
    '2000-02-29', // Valid leap year date
    '2101-12-31', // Year out of range
    '1999-13-01', // Invalid month
    '2023-04-31', // Invalid day for April
    '2023-05-15', // Valid date
];

foreach ($datesToCheck as $date) {
    if (checkContactDate($date)) {
        echo "$date is a correct date.<br>" ;
    } else {
        echo "$date is not a correct date.<br>" ;
    }
}

    $cumpleAbhi = "2024-08-01";
    checkBirthday($cumpleAbhi);
?>


<?php

