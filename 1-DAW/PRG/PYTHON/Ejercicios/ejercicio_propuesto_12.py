"""Ejercicio Propuesto 12: Dados 2 números (base y exp) calcula la potencia (baseˆexp).
Se supone que la potencia no es un operador ni ninguna función predefinida
(En python se calcula como base***exp, pero ahora no lo haremos)."""
base = int(input("Dame la base: "))
exp =  int(input("Dame el exponente: ")) 

potencia=base**exp

print(potencia)