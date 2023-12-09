<?php
$title="Contacts";
?>
<?php
session_start();
if (!isset($_SESSION["llistat"])) {
    
    $_SESSION["llistat"] = array();
}
include("cab.php");
include("classes.php");
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
        //echo "ací va el llistat"; 
        
        //var_dump($_SESSION["llistat"]);
        ?>

        <table class='table'>
        <tr>
            <th>Nom</th>
            <th>Cognom</th>
            <th>Email</th>
            <th>Phone</th>
        </tr>
        <?php
 
        foreach($_SESSION["llistat"] as $contacte) {
            $contacte=unserialize($contacte);
            echo "<tr>";
            echo "<td>".$contacte->getNom()."</td>";
            echo "<td>".$contacte->getCognom()."</td>";
            echo "<td>".$contacte->getEmail()."</td>";
            echo "<td>".$contacte->getTelefon()."</td>";
            echo "</tr>";
        }
        ?>
        </table>
    </div>
    </div>
</div>
<?php
/*
if(!isset($_SESSION['table'])) {
    $table=new Table();
    $table->setCaption("CONTACTES");
    $table->setTitles(array("Name","Surname","Email","Phone"));
    $table->setData(array());
    $_SESSION['table']=$table;
}
echo "<table>";
$byname=(isset($_POST['byname'])?strip_tags($_POST['byname']):"");
$buttonValue=($byname==""?"Filter":"Show all");
$_SESSION['table']->drawTable($byname);
echo "</table>";
echo "<br/>";
echo "<a href='newrow.php'>New contact</a>";
*/
?>
<!--
<form action="tables.php" method="POST">
    <?php
    /*
    if($byname=="") {
      echo "<label>Find by name: </label>";
      echo "<input type='text' name='byname'/><br/>";
    }
    */
    ?>
    <input type="submit" value="<?=$buttonValue?>" name="filterButton"/>
</form>
-->
</body>
</html> 
