<?php
$title = "Empresa";

session_start();
include ("cabecera.php");
require_once("modelsEmpresa.php");
require_once ("viewEmpresa.php");
require_once ("models.php");
$message="";
$messageClass="bg-light text-dark";
if(isset($_GET['code'])){
    $code = strip_tags($_GET['code']);
    $message = strip_tags($_GET['message']);
    $messageClass=($code==0)?'bg-danger' : 'bg-success';
}


$id=$NIF=$nom=$domicili=$cpostal=$poblacio=$telefono=$email=$idsector="";

if(isset($_GET['id'])){
    $id=strip_tags($_GET['id']);
    $result = EmpresaDB::getEmpresaByNIF($id);
    $empresa = $result['empresa'];
    $NIF = $empresa->getNIF();
    $nom = $empresa->getNom();
    $domicili = $empresa->getDomicili();
    $cpostal = $empresa->getCpostal();
    $poblacio = $empresa->getPoblacio();
    $telefono = $empresa->getTelefono();
    $email = $empresa->getEmail();
    $idsector = $empresa->getIdsector();
}
?>

<nav class="navbar navbar-expand-sm p-3 mb-2 bg-secondary text-white">

<!--<a class="btn btn-primary mt-2" href="tablesSector.php">Ir a Sectores</a>
<a class="btn btn-primary mt-2" href="tablesEmpresa.php">Empresas</a>-->
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="tablesEmpresa.php">Empresa</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="tablesSector.php">Sectores</a>
        </li>
    </ul>
</nav>
<div class="container mt-5">
    <div class="row"">
        <div class="col-5">
            <form action="addRowEmpresa.php" method="post">
                <input type="hidden" name="id" value="<?=$id?>">
                <div class="form-group">

                    <label>NIF: </label>
                    <input type="text" name="NIF" class="form-control" value="<?=$NIF?>" required>
                </div>
                <div class="form-group">

                    <label>Nom: </label>
                    <input type="text" name="nom" class="form-control" value="<?=$nom?>" required>
                </div>

                <div class="form-group">

                    <label>Domicili: </label>
                    <input type="text" name="domicili" class="form-control" value="<?=$domicili?>" required>
                </div>


                <div class="form-group">

                    <label>Codigo Postal: </label>
                    <input type="text" name="cpostal" class="form-control" value="<?=$cpostal?>" required>
                </div>
                <div class="form-group">

                    <label>Poblacio: </label>
                    <input type="text" name="poblacio" class="form-control" value="<?=$poblacio?>" required>
                </div>

                <div class="form-group">

                    <label>Telefono: </label>
                    <input type="text" name="telefono" class="form-control" value="<?=$telefono?>" required>
                </div>

                <div class="form-group">
                    <label>Email: </label>
                    <input type="email" name="email" class="form-control" value="<?=$email?>" required>
                </div>

                <div class="form-group">
                    <label>Sector:  </label>
                    <select name="idsector" class="form-control" required>
                        <?php
                        $sectors = SectorDB::getAllSectors();
                        foreach ($sectors as $sector) {
                            $idSectorSeleccionado=$sector->getIdSector();
                            if($idsector==$idSectorSeleccionado){
                                echo "<option value='$idSectorSeleccionado' selected>".$sector->getNomSector()."</option>";
                            }else {
                                echo "<option value='$idSectorSeleccionado'>".$sector->getNomSector()."</option>";
                            }

                        }
                        ?>
                    </select>
                </div>


                <div class='form-group'>
                    <input class='btn btn-primary' type="submit" name="button" value="Send"/>
                    <a class="btn btn-outline-info" href="tablesEmpresa.php">Clear</a>
                </div>


            </form>
        </div>
        <div class="col">
            <?php
            $t = new TableContent();
            $t->setTitle("Empresas");
            $t->setTitles(array("NIF","Nom","Domicili","Codigo Postal","Poblacio","Telefono","Email","Sector"));
            $listadoSectors = EmpresaDB::getAllEmpresas();
            $t->setEmpresas($listadoSectors);
            $t->drawTable();
            ?>
        </div>
    </div>
</div>
<?php include ("foot.php");?>
</body>
</html>
