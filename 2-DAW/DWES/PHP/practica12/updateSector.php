<?php
require_once("models.php");

$id = $_GET['id'];
$result = SectorDB::getSectorById($id);
$code = $result['code'];
$message = $result['message'];

$sector = $result['sector'];

if(isset($_POST['nomsector'])){
    $sector->setNomsector($_POST['nomsector']);

    $code = $result['code'];
    $message = $result['message'];

}
//echo "updated sector: ".$sector->getIdsector();
header("location: tablesSector.php?code=$code&message=$message");