"""Ejercicio Propuesto 2 Hacer un algoritmo que, dado el radio, calcule el área del círculo,
   pero pidiendo repetidamente el radio hasta que el usuario nos de un radio positivo.
"""
radio = float(input("Dame el radio del circulo: "))

while radio < 0 :
    radio = float(input("Dame el radio del circulo: "))
    
area = (3.14159) * (radio**2)
print("La area del circulo es : " , area) 
    
    
  








































"""
if radio>=0:
    area= 3.14159 * (radio**2)
    print("La area del circulo es : " , area)
else:
    radio = int(input("Dame el radio del circulo: "))
    area= 3.14159 * (radio**2)
    print("La area del circulo es : " , area)
"""