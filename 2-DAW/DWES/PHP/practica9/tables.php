<?php
session_start();

include("classes.php");
require_once("Tablecontents.php");

$title="Contacts";
if (!isset($_SESSION["llistat"])) {
    
    $_SESSION["llistat"] = array();
}
include("cab.php");
$table = new Tablecontents();

$table->setTableCaption("<h1>Abhijeet</h1>");
$array=["Nom","Cognom","Email","Telefon"];
$table->setTitles($array);


$table->setContact($_SESSION["llistat"]);
?>
<div class='container'>
    <div class='row'>
    <div class='col'>
    <form action='addRow.php' method="POST">
    <div class='form-group'>
    <label>Name: </label><input class='form-control' type="text" name="firstname" required/><br/>
    </div>
    <div class='form-group'>
    <label>Surname: </label><input class='form-control' type="text" name="lastname" required/><br/>
    </div>
    <div class='form-group'>
    <label>Email: </label><input class='form-control' type="email" name="email" required/><br/>
    </div>
    <div class='form-group'>
    <label>Phone: </label><input class='form-control' type="number" name="phone" required/><br/>
    </div>
    <div class='form-group'>
    <input class='btn btn-primary' type="submit" name="button" value="Send"/>
    </div>
    </form>
    </div>
    <div class='col'>
        <?php
        $table->drawTable();
        ?>

    </div>
    </div>
</div>
</body>
</html> 
