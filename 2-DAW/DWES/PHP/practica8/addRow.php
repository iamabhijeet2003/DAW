<?php
session_start();
include("classes.php");
if (!isset($_SESSION["llistat"])) {
    header("location:tables.php");
}

$name=strip_tags($_POST["firstname"]);
$lastName=strip_tags($_POST["lastname"]);
$email=strip_tags($_POST["email"]);
$phone=strip_tags($_POST["phone"]);

$contacte=new Contacte();
$contacte->setNom($name);
$contacte->setCognom($lastName);
$contacte->setEmail($email);
$contacte->setTelefon($phone);


array_push($_SESSION["llistat"],serialize($contacte));


header("location:tables.php");
?>