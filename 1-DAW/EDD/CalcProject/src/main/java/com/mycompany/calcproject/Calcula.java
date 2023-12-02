/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcproject;

import java.util.Scanner;

/**
 *
 * @author Abhijeet
 * @version 1.0
 */
public class Calcula {
    
    private static float operand1;
    private static float operand2;
   
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Tecleja un número: ");
        float operand1=entrada.nextFloat();
        System.out.print("Tecleja un altre número: ");
        float operand2=entrada.nextFloat();
        Calculadora myCalc=new Calculadora();
        System.out.println("La suma entre "+operand1+" i "+operand2+" és "+myCalc.suma(operand1, operand2));
        System.out.println("La resta entre "+operand1+" i "+operand2+" és "+myCalc.resta(operand1, operand2));
        System.out.println("La multiplicació entre "+operand1+" i "+operand2+" és "+myCalc.multiplica(operand1, operand2));
        System.out.println("La divisió entre "+operand1+" i "+operand2+" és "+myCalc.divideix(operand1, operand2));
        System.out.println("El "+operand1+"% de "+operand2+" és "+myCalc.tantpercent(operand1,operand2));
        System.out.println("El resultat de elevar "+operand1+" a "+operand2+" és "+myCalc.potencia(operand1, operand2));
        System.out.println("L'arrel quadrada de "+operand1+" és "+myCalc.arrelq(operand1));
        System.out.println("Última operació realitzada: "+myCalc.getLastOp()+"; últim resultat: "+myCalc.getLastResult());
    }
}

