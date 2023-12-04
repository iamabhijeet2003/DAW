"""Ejercicio Propuesto 5 Programa que pida un valor inicial, un valor final y un incremento.
Habrá que mostrar los valores que hay entre el inicial y el final, teniendo en cuenta el incremento.
Hay que tener en cuenta que el valor inicial puede ser mayor que el final. Es decir:
• inicial=10,final=20,incremento=3→Mostrará:10,13,16,19 
• inicial=20,final=10,incremento=-3→Mostrará:20,17,14,11"""

valor_inicial = int(input("Dame el valor inicial: "))
valor_final = int(input("Dame el valor final: "))
incremento = int(input("Dame el valor de incremento: "))


    
if valor_inicial<valor_final:
    for i in range(valor_inicial,valor_final,incremento):
        print(i)
else:
    for i in range(valor_inicial,valor_final,-incremento):
        print(i)            

    