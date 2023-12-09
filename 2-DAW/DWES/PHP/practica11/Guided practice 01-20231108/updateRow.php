<?php
require_once ("models.php");


$id=$_GET['id'];
$result = ContacteDB::getById($id);
$code=$result['code'];
$message=$result['message'];

$contacte=$result['contacte'];
echo "Modificando el contacte ".$contacte->getName()." ".$contacte->getSurname()." ".$contacte->getEmail()." ".$contacte->getPhone();


if(isset($_POST['name']) && isset($_POST['surname']) && isset($_POST['email']) && isset($_POST['phone'])) {
    $contacte->setName($_POST['name']);
    $contacte->setSurname($_POST['surname']);
    $contacte->setEmail($_POST['email']);
    $contacte->setPhone($_POST['phone']);

    $code=$result['code'];
    $message=$result['message'];
}


header("location:tables.php?code=$code&message=$message");