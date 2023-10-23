<?php

//script to set a cookie name user and value with user1 and and expiratio time of 1hour

$cookieName = "user";
$cookieValue = "User1";

$expirationTime = Time()+3600;

setcookie($cookieName,$cookieValue,$expirationTime);

echo "Cookie named user has been set";

