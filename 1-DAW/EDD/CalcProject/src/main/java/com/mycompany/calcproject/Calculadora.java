/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calcproject;
/** 
 @author abhijeet
*/


public class Calculadora {    
    private double lastResult;
    private String lastOp;
    /**
     * Este metodo de clase retorna el ultimo resultado.
     * @return double
     */
    
    public double getLastResult(){
       return this.lastResult;
    }

    
    /**
     * Este método de clase devuelve la ultima operación
     * @return String
     */
    public String getLastOp(){
       return this.lastOp;
    }

    /**
     * Este método de clase suma los dos operadores entrantes y devuelve el resultado
     * @param op1
     * @param op2
     * @return float
     */
    public float suma(float op1, float op2){
        float result=op1+op2;
        this.lastResult=result;
        this.lastOp="Suma";
        return result;
    }

    /**
     * Este método de clase resta los dos operadores en orden que entran y devuelve el resultado
     * @param op1
     * @param op2
     * @return float
     */
    public float resta(float op1, float op2){
        float result=op1-op2;
        this.lastResult=result;
        this.lastOp="Resta";
        return result;
    }

    /**
     * Este método de clase multiplica a los dos operadores entrantes y devuelve el resultado
     * @param op1
     * @param op2
     * @return float
     */
    public float multiplica(float op1, float op2){
        float result=op1*op2;
        this.lastResult=result;
        this.lastOp="Multiplica";
        return result;
    }

    /**
     * Este método de clase divide a los dos operadores entrantes en el orden en el 
     * que entran y devuelve el resultado
     * @param op1
     * @param op2
     * @return float
     */
    public float divideix(float op1, float op2){
        float result=op1/op2;
        this.lastResult=result;
        this.lastOp="Divideix";
        return result;
    }

    /**
     * Este método de clase saca el % de los dos operadores entrantes y 
     * devuelve el % de los dos operadores multiplicados y divididos entre 100.
     * @param op1
     * @param op2
     * @return float
     */
    public float tantpercent(float op1, float op2) {
        float result=(op1*op2)/100;
        this.lastResult=result;
        this.lastOp="Percentatge";
        return result;
    }
    
    /**
     * Este método de clase eleva al op1 el op2, 
     * es decir op1=2^4=op2 y devuelve el resultado de la potencia
     * @param op1
     * @param op2
     * @return double
     */
    public double potencia(float op1, float op2) {
        double result=Math.pow(op1, op2);
        this.lastResult=result;
        this.lastOp="Potència";
        return result;
    }
    
    /**
     *Este método de clase saca la raíz cuadrada del operador entrante, 
      en este caso de solo uno y devuelve la raíz cuadrada del operador
     * @param op1
     * @return double
     */
    public double arrelq(float op1) {
        double result=Math.sqrt(op1);
        this.lastOp="Arrel quadrada";
        this.lastResult=result;
        return result;
    }
}