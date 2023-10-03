<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table {
        border: 4px solid blue;
        width: 10%;
        }

        td {
        padding: 5px;
        text-align: left;
        border-right: 2px solid red;
        border-bottom: 2px solid red;
        }

        /* tr:hover {background-color: #D6EEEE;} */
    </style>
</head>
<body>
    <!-- 
        Create a variable with a numeric value (from 1 to 10) and then display an HTML table with the
        multiplication table of the given number.
     -->
    <?php
        $num = 8;
        echo "<table>";
        echo "<tbody >";
        for($i=1;$i<=10;$i++){
            
            echo "<tr>";
            echo "<td>$num</td>";
            echo "<td>x</td>";
            echo "<td>$i = </td>";
            echo "<td>".($num*$i)."</td>";
            echo "</tr>";
            
            
        }
        echo "</tbody>";
        echo "</table>";
    ?>
</body>
</html>
