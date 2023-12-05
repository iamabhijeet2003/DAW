"""Ejercicio Propuesto 9: Muestra los números naturales que hay entre 2 números introducidos por teclado y calcula la suma 
de los pares y la de los impares.
Por último, muestra los 2 totales.
"""
num1= int(input("Dame el primer numero: "))
num2=int(input("Dame el segundo numero: "))
pares=0
impares=0


if num1>num2:
    aux=num1
    num1=num2
    num2=aux
if num1<num2:
    for i in range(num1,num2+1):
        print(i)
        if i%2==0:
            pares+=i
        else :
            impares+=i
    print("La suma de los pares es : ", pares)
    print("La suma de los impares es : ",impares)
    suma=pares+impares
    print("La suma de los impares y pares es :", suma)

  
  
  
  
  
  
  
  
  
  
  
  
  
