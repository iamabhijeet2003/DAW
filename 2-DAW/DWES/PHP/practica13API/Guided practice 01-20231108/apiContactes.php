<?php
require_once "classes.php";
require_once "models.php";
switch($_SERVER['REQUEST_METHOD']) {
    case "GET":

        parse_str($_SERVER['QUERY_STRING'],$params);

        if(isset($params['id'])){
            $id =trim(strip_tags($params['id']));
            $resposta = ContacteDB::getById($id);
            if($resposta['code'] == 0){
                $resposta = array('result'=>"Error","data" =>"id not found");
            }else{

                $contacto = $resposta['contact'];
                if(empty($contacto)){
                    echo Response::result(500,array("message" => $resposta['message']));
                }else{
                    echo Response::result(200,array("message" => $resposta['message'],"contactes" => $contacto->toArray()));
                }

            }

        }else{
            $resposta = ContacteDB::getAll();
            if($resposta['code'] == 0) {
                echo Response::result(500,array("message" => $resposta['message']));

            }
            else {
                $llistat = array();
                foreach ($resposta['result'] as $contacte) {
                    array_push($llistat,$contacte->toArray());
                }
                echo Response::result(200,array("message" => $resposta['message'],"contactes" => $llistat));

            }
        }

        break;
    case "POST":
        try{
            $params=json_decode(file_get_contents("php://input"),true);
            if(!isset($params)){
                echo Response::result(400,array("message" => "la peticion esta vacia"));
            }else{
                $contacte=new Contacte();
                $contacte->setName(strip_tags($params['name']));
                $contacte->setSurname(strip_tags($params['surname']));
                $contacte->setEmail(strip_tags($params['email']));
                $contacte->setPhone(strip_tags($params['phone']));
                $resposta=ContacteDB::insert($contacte);
                if($resposta['code']==0){
                    echo Response::result(400,array("message" => $resposta['message']));
                }else{
                    echo Response::result(200,array("message" => "contact added succesfully"));
                }
            }
        }catch(Exception $e){
            echo Response::result(400,array("message" => $e->getMessage()));
        }
        break;
    case "PUT":

        try{
            $paramsJson=json_decode(file_get_contents("php://input"),true);
            parse_str($_SERVER['QUERY_STRING'],$paramsGet);
            echo Response::result(200,array("message" => "la peticion es un PUT"));
            if(!isset($paramsGet['id'])){

                echo Response::result(400,array("message" => "empty id"));
            }elseif(!isset($paramsJson)){
                echo Response::result(400,array("message" => "empty data"));
            }else{
                $contacte=new Contacte();
                $contacte->setName(strip_tags($paramsJson['name']));
                $contacte->setSurname(strip_tags($paramsJson['surname']));
                $contacte->setEmail(strip_tags($paramsJson['email']));
                $contacte->setPhone(strip_tags($paramsJson['phone']));
                $contacte->setId($paramsGet['id']);
                $resposta = ContacteDB::update($contacte);
                if($resposta['code']==0){
                    echo Response::result(400,array("message" => $resposta['message']));
                }else{
                    echo Response::result(200,array("message" => "contact updated succesfully"));
                }
            }
        }catch(Exception $e){
            echo Response::result(400,array("message" => $e->getMessage()));
        }
        break;
    case "DELETE":
        parse_str($_SERVER['QUERY_STRING'],$params);

        if(isset($params['id'])){
            $id =trim(strip_tags($params['id']));
            $resposta = ContacteDB::delete($id);
            if($resposta['code'] == 0){
                $resposta = array('result'=>"Error","data" =>"id not found");
            }else{

                if($resposta['rows']==0){
                    echo Response::result(200,array("message" => $resposta['message']));
                }else{
                    echo Response::result(200,array("message" => $resposta['message']));
                }

            }

        }else{
            echo Response::result(400,array("message" =>"empty id"));
        }
        break;

    default:
        echo Response::result(400,array("message" => "la peticion no existeix"));
}

