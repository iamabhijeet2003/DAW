<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 
        Given an array with names and phones
        1 $phones=array("John"=>"123123","Louise"=>"952342","Mary"=>"852342",
        2 "David"=>"9692834","Annie"=>"75324","Martin"=>"959235");
        Show the names and phones where the phone number starts with 9.
        Result: Louise:952342 David:9692834 Martin:959235
     -->
    <?php
        $phones=array("John"=>"123123","Louise"=>"952342","Mary"=>"852342",
                    "David"=>"9692834","Annie"=>"75324","Martin"=>"959235");
        foreach($phones as $key =>$value){
            if(substr($value,0,1)=='9'){
                echo "$key : $value<br>";
            }
        }
    ?>
</body>
</html>
