<?php
$title="Contacts";
?>
<?php
session_start();
include("cab.php");
require_once("models.php");
require_once("views.php");
$message="";
$messageClass="bg-light";
if(isset($_GET['code'])){
    $code=strip_tags($_GET['code']);
        $message=strip_tags($_GET['message']);
        $messageClass=($code==0)?'bg-danger':'bg-success';
}
$id=0;
$nom=$cognom=$email=$telefon="";
if(isset($_GET['id'])) {
    $id = (int)strip_tags($_GET['id']);
    $contact = ContacteDB::getById($id);
    $code=$contact['code'];
    $message=$contact['message'];
    $contact=$contact['contact'];

    $nom=$contact->getName();
    $cognom=$contact->getSurname();
    $email=$contact->getEmail();
    $telefon=$contact->getPhone();

}
?>
<div class='container mt-5'>
    <div class='row'>
    <div class='col-5'>
    <form action='addRow.php' method="POST">
    <div class='form-group'>
        <input type="hidden" name="id" value="<?=$id?>">

    <label>Name: </label><input class='form-control' type="text" name="firstname" value="<?=$nom?>" required/><br/>
    </div>
    <div class='form-group'>
    <label>Surname: </label><input class='form-control' type="text" name="lastname" value="<?=$cognom?>" required/><br/>
    </div>
    <div class='form-group'>
    <label>Email: </label><input class='form-control' type="email" name="email" value="<?=$email?>" required/><br/>
    </div>
    <div class='form-group'>
    <label>Phone: </label><input class='form-control' type="number" name="phone" value="<?=$telefon?>" required/><br/>
    </div>
    <div class='form-group'>
    <input class='btn btn-primary' type="submit" name="button" value="Send"/>
    </div>
    </form>
    </div>  
    <div class='col'>
        <?php 
      
        $t=new Tablecontents();
        $t->setTitle("Contact list");
        $t->setTitles(array("Id","Name","Surname","Email","Phone"));
        
        $llistat=ContacteDB::getAll();
        $t->setContactes($llistat);
        $t->drawTable();
        ?>
    </div>
    </div>
</div>
<?php include "foot.php"; ?>
</body>
</html> 
