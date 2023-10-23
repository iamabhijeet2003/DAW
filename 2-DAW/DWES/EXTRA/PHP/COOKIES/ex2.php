<?php

$cookieName = "username";

if(isset($_COOKIE[$cookieName])){
    $cookieValue = $_COOKIE[$cookieName];
    echo "Value of cookie : ".$cookieValue;
}else{
    echo "Cookie doesn't exists";
}
?>