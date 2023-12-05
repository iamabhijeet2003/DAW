"""Ejercicio Propuesto 10: Introduce 2 valores A y B (A < B).
Incrementa A de 2 en 2 y decrementa B de 3 en3hastaqueA>B."""
a=int(input("Dame un valor A: "))
b=int(input("Dame un valor B que sea mayor que A: "))


for i in range(a,b+3,2):
    print("El valor de A es ",i)
    
print("\n")

for i in range(b,a-3,-3):
    print("El valor de B es ",i)
    