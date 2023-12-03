#pruebas

import random


# importing random module
import random
# resultant random numbers list
carton=[]
# traversing the loop 15 times
for i in range(28):
   r=random.randint(1,100)
   if r not in carton:
      carton.append(r)
print(carton)


for i in range(1,11):
	print(i,end=",")
	if i==10:
		print("")