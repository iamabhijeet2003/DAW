<?php
    class Contacte{


        private $nom;
        private $cognom;
        private $email;
        private $telefon;

        /**
         * @param $nom
         * @param $cognom
         * @param $email
         * @param $telefon
         */
       

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
        public function setNom($nom)
        {
            $this->nom = $nom;
        }

        /**
         * @return mixed
         */
        public function getCognom()
        {
            return $this->cognom;
        }

        /**
         * @param mixed $cognom
         */
        public function setCognom($cognom)
        {
            $this->cognom = $cognom;
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
        public function setEmail($email)
        {
            $this->email = $email;
        }

        /**
         * @return mixed
         */
        public function getTelefon()
        {
            return $this->telefon;
        }

        /**
         * @param mixed $telefon
         */
        public function setTelefon($telefon)
        {
            $this->telefon = $telefon;
        }


    }

?>