"""Ejercicio Propuesto 11: Dado un número N, muestra por pantalla las siguientes líneas:"""
n=int(input("Dame un numero: ")) 
for row in range(1,n+1): 
  c_sum=0     
  for i in range(1,row+1): 
    c_sum=c_sum+i 
    if i<row: 
      print(i,'+', sep='', end='') 
    else: 
      print(i, sep='',end='') 
  print('=',c_sum,sep='') 
