package org.example.excepcions;

public class saldoNegatiu extends RuntimeException{
    public saldoNegatiu(String message){
        super(message);
    }
}
