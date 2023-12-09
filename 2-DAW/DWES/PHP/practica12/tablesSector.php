<?php
$title = "Sectores";

session_start();
include ("cabecera.php");
require_once("models.php");
require_once("view.php");
$message="";
$messageClass="bg-light text-dark";
if(isset($_GET['code'])){
    $code = strip_tags($_GET['code']);
    $message = strip_tags($_GET['message']);
    $messageClass=($code==0)?'bg-danger' : 'bg-success';
}

$id=0;
$nomSector="";
if(isset($_GET['id'])){
    $id = (int)strip_tags($_GET['id']);
    $sector = SectorDB::getSectorById($id);
    $code=$sector['code'];
    $message=$sector['message'];
    $sector=$sector['sector'];

    $nomSector = $sector->getNomsector();
}
?>

<nav class="navbar navbar-expand-sm p-3 mb-2 bg-secondary text-white">

    <!--<a class="btn btn-primary mt-2" href="tablesSector.php">Ir a Sectores</a>
    <a class="btn btn-primary mt-2" href="tablesEmpresa.php">Empresas</a>-->
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="tablesSector.php">Sectores</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="tablesEmpresa.php">Empresa</a>
        </li>
    </ul>
</nav>


<div class="container mt-5">
    <div class="row"">
        <div class="col-5">
            <form action="addRowSector.php" method="post">
                <div class="form-group">
                    <input type="hidden" name="id" value="<?=$id?>">

                    <label>Nombre Sector: </label>
                    <input type="text" name="nomsector" class="form-control" value="<?=$nomSector?>" required>
                </div>

                <div class='form-group'>
                    <input class='btn btn-primary' type="submit" name="button" value="Send"/>
                    <a class="btn btn-outline-info" href="tablesSector.php">Clear</a>
                </div>
            </form>
        </div>
        <div class="col">
            <?php
            $t = new TableContent();
            $t->setTitle("Sectores");
            $t->setTitles(array("Nombre Sector"));
            $listadoSectors = SectorDB::getAllSectors();
            $t->setSectores($listadoSectors);
            $t->drawTable();
            ?>
        </div>
    </div>
</div>
<?php include ("foot.php");?>
</body>
</html>
