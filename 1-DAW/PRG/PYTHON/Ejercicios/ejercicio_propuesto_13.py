"""Ejercicio Propuesto 13: Muestra el producto de todos los números impares entre el 1 y el 40."""

start=1
end=40
producto=1
for i in range (start,end+1):
    num_impar=i%2
    if num_impar==1:
        producto*=i
print(producto)
