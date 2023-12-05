"""Ejercicio Propuesto 15: Calcula el factorial de un número introducido por teclado (n!=n*n-1*n
-2*...*3*2*1)."""

numero = int(input("Dame un numero para calcular su factorial: "))
factorial = 1
for i in range(1,numero+1):
    factorial=factorial*i
print("El factorial de numero introducido es: ",factorial)