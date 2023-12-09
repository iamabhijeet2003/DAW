<?php
require_once("models.php");
interface Table {
    
    public function drawHeader();
    public function drawRows(); 
    public function drawTable(); 
}
class Tablecontents implements Table {
	private $title; // titol del llistat
	private $titles; // titols de les columnes
	private $contactes; // llista de contactes
	

	/**
	 * @return mixed
	 */
	public function getTitle() {
		return $this->title;
	}
	
	/**
	 * @param mixed $title 
	 * @return self
	 */
	public function setTitle($title): self {
		$this->title = $title;
		return $this;
	}

	/**
	 * @return mixed
	 */
	public function getTitles() {
		return $this->titles;
	}
	
	/**
	 * @param mixed $titles 
	 * @return self
	 */
	public function setTitles($titles): self {
		$this->titles = $titles;
		return $this;
	}

	/**
	 * @return mixed
	 */
	public function getContactes() {
		return $this->contactes;
	}
	
	/**
	 * @param mixed $contactes 
	 * @return self
	 */
	public function setContactes($contactes): self {
		$this->contactes = $contactes;
		return $this;
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
		foreach($this->contactes as $contacte) {
			echo "<tr>";
			echo "<td>".$contacte->getId()."</td>";
			echo "<td>".$contacte->getName()."</td>";
			echo "<td>".$contacte->getSurname()."</td>";
			echo "<td>".$contacte->getEmail()."</td>";
			echo "<td>".$contacte->getPhone()."</td>";
            $id=$contacte->getId();
            echo "<td> <a class='btn btn-danger btn-sn' href='deleteRow.php?id=$id'>Delete</a>";
            echo " <a class='btn btn-warning btn-sn' href='tables.php?id=$id'>Update</a></td>";
			echo "</tr>";
		}
	} 
    public function drawTable() {
		$this->drawHeader();
		$this->drawRows();
		echo "</table>";
	}
}
