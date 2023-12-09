<?php
require_once ("models.php");
$id=(int)$_GET['id'];

$result = ContacteDB::delete($id);
$code=$result['code'];
$message=$result['message'];

header("location:tables.php?code=$code&message=$message");
