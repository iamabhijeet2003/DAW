"""Ejercicio Propuesto 4 Pedir por teclado cuántos números se quieren mostrar. 
A continuación, se mostrarán los números desde ese número hasta el 1."""

numero=int(input("Cuantos numeros quieres: "))
uno = 1

if numero<uno:
    for i in range(numero,1):
         print(i)
else :
    for i in range(numero,1,-1):
         print(i)
    
