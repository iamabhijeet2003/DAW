<?php

class Response{
    public static function result($code,$response){
        header('Content-Type: application/json; charset=utf-8');
        http_response_code($code);

        return json_encode($response);

    }
}