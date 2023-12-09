<?php
require_once("models.php");
$id=(int)$_GET['id'];

$result = SectorDB::deleteSector($id);
$code = $result['code'];
$message = $result['message'];
header("Location:tablesSector.php?code=$code&message=$message");