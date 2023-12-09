<?php
session_start();
include("classes.php");
if (!isset($_SESSION["llistat"])) {
    header("location:tables.php");
}

if($_POST)
header("location:tables.php");
?>