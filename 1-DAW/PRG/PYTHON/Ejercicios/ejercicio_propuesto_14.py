"""Ejercicio Propuesto 14: Muestra la suma, el producto y la media de los 100 primeros números naturales."""
start=1
end = 101

suma = 0
producto=1
media = 0

for i in range (start,end):
    suma = suma+i
    producto=producto*i
    media = suma/100
print("La suma de los numeros naturales entre 1 y 100 es: ",suma)
print("El producto de los numeros naturales entre 1 y 100 es: ",producto)
print("La media de los numeros naturales entre 1 y 100 es: ",media)