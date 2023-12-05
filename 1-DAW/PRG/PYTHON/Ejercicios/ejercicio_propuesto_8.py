"""Ejercicio Propuesto 8: Pregunta cuál es la raíz cuadrada de 225 hasta que se acierte. 
Finalmente, muestra cuántos intentos se han hecho."""
salir = False
raiz_cuadrada=15
num_intentos = 0
while not salir:
    num= int(input("Cual es la raiz cuadrada de 225?  : "))
    
    if num==15:
        salir=True
        num_intentos=num_intentos+1
        print("Genial!! 15 es la raiz cuadrada de 225.Has acertado el numero en ", num_intentos,"intentos")
    if num != 15:
        num_intentos=num_intentos+1
