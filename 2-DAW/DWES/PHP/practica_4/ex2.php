<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 

        Repeat the exercise 01, but this time print in bold the numbers divisible by 5.
        Result: 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25

     -->
    <?php
        for($i=1;$i<26;$i++){
            if($i<25){
                if($i%5== 0){
                    echo "<b>$i,</b>";
                }else{
                    echo "$i,";
                }
            }else{
                if($i%5== 0){
                    echo "<b>$i</b>";
                }
            }
        }
    ?>
</body>
</html>