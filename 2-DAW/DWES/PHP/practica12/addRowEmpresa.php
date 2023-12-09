<?php

session_start();
require_once ("modelsEmpresa.php");

$NIF=strip_tags($_POST['NIF']);
$nom=strip_tags($_POST['nom']);
$domicili=strip_tags($_POST['domicili']);
$cpostal=strip_tags($_POST['cpostal']);
$poblacio=strip_tags($_POST['poblacio']);
$telefono=strip_tags($_POST['telefono']);
$email=strip_tags($_POST['email']);
$idsector=strip_tags($_POST['idsector']);
$id=strip_tags($_POST['id']);
$empresa = new Empresa();
$empresa->setNIF($NIF);
$empresa->setNom($nom);
$empresa->setDomicili($domicili);
$empresa->setCpostal($cpostal);
$empresa->setPoblacio($poblacio);
$empresa->setTelefono($telefono);
$empresa->setEmail($email);
$empresa->setIdsector($idsector);

if($id==""){
    $result = EmpresaDB::insertEmpresa($empresa);
}else{
    $empresa->setNIF($_POST['NIF']);
    $result = EmpresaDB::updateEmpresa($empresa);
    $code = $result['code'];
    $message = $result['message'];
}



header("Location: tablesEmpresa.php?code=$code&message=$message");