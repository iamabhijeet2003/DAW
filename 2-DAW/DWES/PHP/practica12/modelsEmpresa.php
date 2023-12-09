<?php

class Empresa{
    private $NIF;
    private $nom;
    private $domicili;
    private $cpostal;
    private $poblacio;
    private $telefono;
    private $email;
    private $idsector;

    /**
     * @return mixed
     */
    public function getNIF()
    {
        return $this->NIF;
    }

    /**
     * @param mixed $NIF
     */
    public function setNIF($NIF): void
    {
        $this->NIF = $NIF;
    }

    /**
     * @return mixed
     */
    public function getNom()
    {
        return $this->nom;
    }

    /**
     * @param mixed $nom
     */
    public function setNom($nom): void
    {
        $this->nom = $nom;
    }

    /**
     * @return mixed
     */
    public function getDomicili()
    {
        return $this->domicili;
    }

    /**
     * @param mixed $domicili
     */
    public function setDomicili($domicili): void
    {
        $this->domicili = $domicili;
    }

    /**
     * @return mixed
     */
    public function getCpostal()
    {
        return $this->cpostal;
    }

    /**
     * @param mixed $cpostal
     */
    public function setCpostal($cpostal): void
    {
        $this->cpostal = $cpostal;
    }

    /**
     * @return mixed
     */
    public function getPoblacio()
    {
        return $this->poblacio;
    }

    /**
     * @param mixed $poblacio
     */
    public function setPoblacio($poblacio): void
    {
        $this->poblacio = $poblacio;
    }

    /**
     * @return mixed
     */
    public function getTelefono()
    {
        return $this->telefono;
    }

    /**
     * @param mixed $telefono
     */
    public function setTelefono($telefono): void
    {
        $this->telefono = $telefono;
    }

    /**
     * @return mixed
     */
    public function getEmail()
    {
        return $this->email;
    }

    /**
     * @param mixed $email
     */
    public function setEmail($email): void
    {
        $this->email = $email;
    }

    /**
     * @return mixed
     */
    public function getIdsector()
    {
        return $this->idsector;
    }

    /**
     * @param mixed $idsector
     */
    public function setIdsector($idsector): void
    {
        $this->idsector = $idsector;
    }

}

class DBmodel {
    static function connect() {
        try {
            $pdo = new PDO("mysql:host=localhost;dbname=jobs",
                'admin', 'php',
                array(PDO::ATTR_PERSISTENT => true));
            $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            $pdo->exec("SET NAMES 'utf8'");

        }
        catch (PDOException $e) {
            return null;
        }
        return $pdo;
    }
}

class EmpresaDB{
    static  public function getAllEmpresas(){
        try{
            $pdo = DBmodel::connect();
            if($pdo==null) return array('code'=>0,'message'=>'NO database connection');
            $sql = "SELECT * FROM empresa";
            $stmt = $pdo->prepare($sql);
            $stmt->setFetchMode(PDO::FETCH_CLASS|PDO::FETCH_PROPS_LATE, 'Empresa');
            $stmt->execute();
            $result = $stmt->fetchAll();
            return $result;
        }catch (Throwable $e) {
            echo "Error ".$e->getMessage();
        }
    }

    static public function getEmpresaByNIF($NIF){
        try{
            $pdo = DBmodel::connect();
            if($pdo==null) return array('code'=>0,'message'=>'NO database connection');
            $sql = "SELECT * FROM empresa WHERE NIF = :NIF";
            $stmt = $pdo->prepare($sql);
            $stmt->setFetchMode(PDO::FETCH_CLASS|PDO::FETCH_PROPS_LATE, 'Empresa');
            $stmt->execute(['NIF'=>$NIF]);
            $result = $stmt->fetch();
            $fila = $stmt->rowCount();
            return array('code'=>1,'message'=>"$fila selected",'empresa'=>$result);
        }catch (Throwable $e) {

            return array('code'=>0,'message'=>$e->getMessage());
        }
    }

    static public function insertEmpresa($empresa){
        try{
            $pdo= DBmodel::connect();
            if($pdo==null) return array('code'=>0,'message'=>'NO database connection');
            $sql = "INSERT INTO empresa VALUES (:NIF, :nom, :domicili, :cpostal, :poblacio, :telefono, :email, :idsector)";
            $stmt = $pdo->prepare($sql);

            $stmt -> execute(
                [
                    'NIF'=>$empresa->getNIF(),
                    'nom'=>$empresa->getNom(),
                    'domicili'=>$empresa->getDomicili(),
                    'cpostal'=>$empresa->getCpostal(),
                    'poblacio'=>$empresa->getPoblacio(),
                    'telefono'=>$empresa->getTelefono(),
                    'email'=>$empresa->getEmail(),
                    'idsector'=>$empresa->getIdsector()
                ]
            );
            $result = $stmt->rowCount();
            return array('code'=>1,'message'=>"$result inserted");
        }catch (Throwable $e) {
            echo "Error ".$e->getMessage();
        }
    }

    static public function deleteEmpresa($NIF){
        try{
            $pdo= DBmodel::connect();
            if($pdo==null) return array('code'=>0,'message'=>'NO database connection');
            $sql = "DELETE FROM empresa WHERE NIF = :NIF";
            $stmt = $pdo->prepare($sql);
            $stmt->execute(['NIF'=>$NIF]);
            $result = $stmt->rowCount();
            return array('code'=>1,'message'=>"$result deleted");
        }catch (Throwable $e) {
            return array('code'=>0,'message'=>$e->getMessage());
        }
    }



    static public function updateEmpresa($empresa){
        try{
            $pdo = DBmodel::connect();
            if($pdo==null) return array('code'=>0,'message'=>'NO database connection');
            $sql = "UPDATE empresa SET nom = :nom, domicili = :domicili, cpostal = :cpostal, poblacio = :poblacio, telefono = :telefono, email = :email, idsector = :idsector WHERE NIF = :NIF";
            $stmt = $pdo->prepare($sql);

            $stmt->execute(
                [
                    'NIF'=>$empresa->getNIF(),
                    'nom'=>$empresa->getNom(),
                    'domicili'=>$empresa->getDomicili(),
                    'cpostal'=>$empresa->getCpostal(),
                    'poblacio'=>$empresa->getPoblacio(),
                    'telefono'=>$empresa->getTelefono(),
                    'email'=>$empresa->getEmail(),
                    'idsector'=>$empresa->getIdsector()
                ]
            );
            $result = $stmt->rowCount();
            return array('code'=>1,'message'=>"$result updated");
        }catch (Throwable $e){

            return array('code'=>0,'message'=>$e->getMessage());
        }
    }
}


