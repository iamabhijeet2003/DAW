"""Ejercicio Propuesto 16: Pide un número por teclado y digas si es un número primero o no. 
Nota: un número es primero si solo es divisible por 1 y por él mismo."""

numero = int(input("Dame un numero para saber si es primero: "))

probar = 1
for i in range(2,numero):
    if numero == 2:
        print("es primo")
        break
    probar=numero%i
    if probar ==0:
        print("El numero introducido no es primo.")
        break
    
    print("El numero introducido es primo.")
    break