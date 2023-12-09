<?php

require_once("interfaces.php");
include_once("classes.php");
class Tablecontents implements Table{

    private string $tableCaption;
    private array $titles=array();

    private array $contact = array();

    public function getTableCaption(): string
    {
        return $this->tableCaption;
    }

    public function setTableCaption(string $tableCaption): void
    {
        $this->tableCaption = $tableCaption;
    }

    public function getTitles(): array
    {
        return $this->titles;
    }

    public function setTitles(array $titles): void
    {
        $this->titles = $titles;
    }

    public function getContact(): array
    {
        return $this->contact;
    }

    public function setContact(array $contact): void
    {
        $this->contact = $contact;
    }




    public function drawHeader()
    {
        // TODO: Implement drawHeader() method.
        echo '<thead>';
        echo '<tr>';

        foreach ($this->titles as $title) {
            echo '<th>' . $title . '</th>';
        }

        echo '</tr>';
        echo '</thead>';

    }

    public function drawRows()
    {
        // TODO: Implement drawRows() method.
        echo '<tbody>';
        foreach ($this->contact as $contactes) {
            $contactes=unserialize($contactes);
            echo '<tr>';
            echo '<td>' . $contactes->getNom() . '</td>';
            echo '<td>' . $contactes->getCognom() . '</td>';
            echo '<td>' . $contactes->getEmail() . '</td>';
            echo '<td>' . $contactes->getTelefon() . '</td>';
            echo '</tr>';
        }
        echo '</tbody>';
    }

    public function drawTable()
    {


        // TODO: Implement drawTable() method.

        echo "<table>";
        $this->drawHeader();
        $this->drawRows();
        echo "</table>";
    }

}