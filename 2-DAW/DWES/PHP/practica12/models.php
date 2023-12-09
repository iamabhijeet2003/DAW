<?php
class DB {
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

class Sector{
    private  $idsector;
    private $nomsector;

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

    /**
     * @return mixed
     */
    public function getNomsector()
    {
        return $this->nomsector;
    }

    /**
     * @param mixed $nomsector
     */
    public function setNomsector($nomsector): void
    {
        $this->nomsector = $nomsector;
    }



}

class SectorDB{
    static public function getAllSectors(){
        try {
            $pdo = DB::connect();

            if($pdo==null) return array('code'=>0,'message'=>'NO database connection');
            $sql = "SELECT * FROM sector";
            $stmt = $pdo->prepare($sql);
            $stmt->setFetchMode(PDO::FETCH_CLASS|PDO::FETCH_PROPS_LATE, 'Sector');
            $stmt->execute();
            $result = $stmt->fetchAll();
            return $result;
        }catch(Throwable $e) {
            return array('code'=>0,'message'=>'Error'.$e->getMessage());
        }
    }

    public static function getSectorById($idSector){
        try {
            $pdo = DB::connect();

            if($pdo==null) return array('code'=>0,'message'=>'NO database connection');
            $sql = "SELECT * FROM sector WHERE idsector = :idsector";
            $stmt = $pdo->prepare($sql);
            $stmt->setFetchMode(PDO::FETCH_CLASS|PDO::FETCH_PROPS_LATE, 'Sector');
            $stmt->execute(['idsector'=>$idSector]);
            $result = $stmt->fetch();
            $fila = $stmt->rowCount();
            return array('code'=>1,'message'=>"$fila sector added succesfully ",'sector'=>$result);
        }catch(Throwable $e) {
            return array('code'=>0,'message'=>'Error'.$e->getMessage());
        }
    }
    static public function insertSector($sector){
        try {
            $pdo = DB::connect();
            if($pdo==null) return array('code'=>0,'message'=>'NO database connection');
            $sql = "INSERT INTO sector VALUES (null,:nomsector)";
            $stmt = $pdo->prepare($sql);

            $stmt -> execute(
                [
                    'nomsector'=>$sector->getNomsector()
                ]
            );
            $result = $stmt->rowCount();
            return array('code'=>1,'message'=>"$result sector added succesfully");
        }catch(Throwable $e) {
            return array('code'=>0,'message'=>'Error'.$e->getMessage());
        }
    }

    static  public function deleteSector($idSector){
        try{
            $pdo = DB::connect();
            if($pdo==null) return array('code'=>0,'message'=>'NO database connection');
            $sql = "Delete FROM sector WHERE idsector = :idsector";
            $stmt = $pdo->prepare($sql);
            $stmt->execute(['idsector'=>$idSector]);
            $result = $stmt->rowCount();
            return array('code'=>1,'message'=>"$result sector deleted succesfully");
        }catch (Throwable $e) {
            if(str_contains($e->getMessage(),"1451")){
                return array('code'=>0,'message'=>'Error no se pudo eliminar el sector porque esta relacionado con otras tablas');
            }
            return array('code'=>0,'message'=>'Error: '.$e->getMessage());
        }
    }


    static public function updateSector($sector){
        try{
            $pdo = DB::connect();
            if($pdo==null) return array('code'=>0,'message'=>'NO database connection');
            $sql = "UPDATE sector SET nomsector = :nomsector WHERE idsector = :idsector";
            $stmt = $pdo->prepare($sql);
            $stmt->execute(
                [
                    'nomsector'=>$sector->getNomsector(),
                    'idsector'=>$sector->getIdsector()
                ]
            );
            $result = $stmt->rowCount();
            return array('code'=>1,'message'=>"$result sector updated succesfully");
        }catch (Throwable $e) {
            return array('code'=>0,'message'=>'Error'.$e->getMessage());
        }
    }
}



