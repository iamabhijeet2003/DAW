""" Indica cuántos divisores (no qué) tiene un número dado."""


numero=int(input("Dame un numero para saber sus divisores: "))
a=1

for i in range(1,numero):
    if numero % i == 0:
        a = a+1
else:
    print("El numero ", numero, "tiene ",a," divisores.")


