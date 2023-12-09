<?php
require_once ("modelsEmpresa.php");

interface Table {
    public function drawHeader();
    public function drawRows();
    public function drawTable();
}


class TableContent implements Table {
    private $title;
    private $titles;
    private $empresas;

    /**
     * @return mixed
     */
    public function getTitle()
    {
        return $this->title;
    }

    /**
     * @param mixed $title
     */
    public function setTitle($title): void
    {
        $this->title = $title;
    }

    /**
     * @return mixed
     */
    public function getTitles()
    {
        return $this->titles;
    }

    /**
     * @param mixed $titles
     */
    public function setTitles($titles): void
    {
        $this->titles = $titles;
    }

    /**
     * @return mixed
     */
    public function getEmpresas()
    {
        return $this->empresas;
    }

    /**
     * @param mixed $empresas
     */
    public function setEmpresas($empresas): void
    {
        $this->empresas = $empresas;
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
        foreach ($this->empresas as $empresa) {
            echo "<tr>";

            echo "<td>". $empresa->getNIF(). "</td>";
            echo "<td>". $empresa->getNom(). "</td>";
            echo "<td>". $empresa->getDomicili(). "</td>";
            echo "<td>". $empresa->getCpostal(). "</td>";
            echo "<td>". $empresa->getPoblacio(). "</td>";
            echo "<td>". $empresa->getTelefono(). "</td>";
            echo "<td>". $empresa->getEmail(). "</td>";
            echo "<td>". $empresa->getIdsector(). "</td>";
            $nif = $empresa->getNIF();
            echo "<td> <a class='btn btn-danger btn-sn' href='deleteEmpresa.php?id=$nif'>Delete</a>";
            echo " <a class='btn btn-warning btn-sn' href='tablesEmpresa.php?id=$nif'>Update</a></td>";
        }
    }

    public function drawTable() {
        $this->drawHeader();
        $this->drawRows();
        echo "</table>";
    }

}