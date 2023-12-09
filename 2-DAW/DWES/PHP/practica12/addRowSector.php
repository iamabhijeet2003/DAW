<?php
session_start();
require_once("models.php");

$nomSector = strip_tags($_POST["nomsector"]);

$sector = new Sector();
$sector->setNomsector($nomSector);
$id=0;
if(isset($_POST["id"])){
    $id = strip_tags($_POST["id"]);
}

if($id==0){
    $result = SectorDB::insertSector($sector);
    $code = $result['code'];
    $message = $result['message'];
}else{
    $sector->setIdsector($id);
    $result = SectorDB::updateSector($sector);
    $code = $result['code'];
    $message = $result['message'];
}

header("Location:tablesSector.php?code=$code&message=$message");