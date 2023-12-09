<?php
require_once ("modelsEmpresa.php");
$id=$_GET['id'];
$result = EmpresaDB::deleteEmpresa($id);
$message = $result['message'];
$code = $result['code'];

header("Location: tablesEmpresa.php?code=$code&message=$message");