<?php
session_start();

$correctEmail = "peter@mail.com";
$correctPass = "12345678";

if($_SESSION['pass']==$correctPass && $_SESSION['email']==$correctEmail) {
    echo "Login correct: <br>";
} else {
    echo "Login incorrect: <br>";
}
echo $_SESSION['email'] . ", " . $_SESSION['pass'] . "<br>";

session_destroy();