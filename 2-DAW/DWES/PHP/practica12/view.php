<?php
require_once("models.php");


interface Table {
    public function drawHeader();
    public function drawRows();
    public function drawTable();
}

class TableContent implements Table {
    private $title;
    private $titles;
    private $sectores;

    /**
 * @return mixed
 */
public function getTitle()
{
    return $this->title;
}/**
 * @param mixed $title
 */
public function setTitle($title): void
{
    $this->title = $title;
}/**
 * @return mixed
 */
public function getTitles()
{
    return $this->titles;
}/**
 * @param mixed $titles
 */
public function setTitles($titles): void
{
    $this->titles = $titles;
}/**
 * @return mixed
 */
public function getSectores()
{
    return $this->sectores;
}/**
 * @param mixed $sectores
 */
public function setSectores($sectores): void
{
    $this->sectores = $sectores;
}


    public function drawHeader() {
        echo "<table class='table table-sm caption-top'>";
        echo "<caption class='text-center m-2 p-1 bg-' style='background-color: rgba(0, 0, 0, 0.15);'>$this->title</caption>";
        echo "<table class='table table-sm'>";
        echo "<tr>";
        foreach($this->titles as $columna) {
            echo "<th>$columna</th>";
        }

        echo "</tr>";
    }

    public function drawRows() {

        foreach ($this->sectores as $sector) {
            echo "<tr>";
            echo "<td>" . $sector->getNomSector() . "</td>";
            $id = $sector->getIdSector();
            echo "<td> <a class='btn btn-danger btn-sn' href='deleteSector.php?id=$id'>Delete</a>";
            echo " <a class='btn btn-warning btn-sn' href='tablesSector.php?id=$id'>Update</a></td>";
            echo "</tr>";
        }
    }

    public function drawTable() {
        $this->drawHeader();
        $this->drawRows();
        echo "</table>";
    }


}