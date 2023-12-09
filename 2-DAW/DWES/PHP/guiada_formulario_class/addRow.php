<?php
session_start();
if (!isset($_SESSION["llistat"])) {
    header("Location:tables.php");
}

$name=strip_tags($_POST["firstname"]);
$lastName=strip_tags($_POST["lastname"]);
$email=strip_tags($_POST["email"]);
$phone=strip_tags($_POST["phone"]);



$contacte=array("nom"=>$name, "cognom"=>$lastName,"email"=> $email,"phone"=>$phone);

array_push($_SESSION["llistat"],$contacte);



header("location:tables.php");
?>