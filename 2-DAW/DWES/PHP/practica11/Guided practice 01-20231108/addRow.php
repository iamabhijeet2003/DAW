<?php
session_start();
require_once("models.php");

$name=strip_tags($_POST["firstname"]);
$lastName=strip_tags($_POST["lastname"]);
$email=strip_tags($_POST["email"]);
$phone=strip_tags($_POST["phone"]);

$contacte=new Contacte();
$contacte->setName($name);
$contacte->setSurname($lastName);
$contacte->setEmail($email);
$contacte->setPhone($phone);
//$contacte=array("nom"=>$name,"cognom"=>$lastName,"email"=>$email,"telefon"=>$phone);
//array_push($_SESSION['llistat'],serialize($contacte));
if(isset($_POST["id"])) $id=strip_tags($_POST["id"]);
echo $id;

if($id==0){

    $result=ContacteDB::insert($contacte);
    $code=$result['code'];
    $message=$result['message'];
}else{
    $contacte->setId($id);
    $result=ContacteDB::update($contacte);
    $code=$result['code'];
    $message=$result['message'];
}


header("location:tables.php?code=$code&message=$message");
?>