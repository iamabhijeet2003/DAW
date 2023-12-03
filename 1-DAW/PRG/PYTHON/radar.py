import random
import time

def matricula ():
    stringNum='0123456789'
    stringChar='BCDFGHJKLMNPQRSTVWXYZ'
    
    varMatricula=''
    
    for i in range(0,4):
        varMatricula += stringNum[random.randint(0,len(stringNum)-1)]
        
    
    for i in range(0,3):
        varMatricula += stringChar[random.randint(0,len(stringChar)-1)]
    
    return varMatricula


def carMatriculas():
    
    radarOn = True
    contadorMatriculas= 0
    maxMatriculas = 10
    arrayMatriculas = []

    while radarOn:
        varTiempoMatricula = random.randint(0,3)
        time.sleep(varTiempoMatricula)
        
        
        varDistancia= random.randint(9000,13000)
        vartiempo= random.randint(250,500)
        varVelocidadMax = random.randrange(100,130,10)
        
        #print(matricula(), varDistancia, vartiempo, varVelocidadMax)
        
        arrayMatriculas.append(matricula())
        arrayMatriculas.append(varDistancia)
        arrayMatriculas.append(varVelocidadMax)
        arrayMatriculas.append(vartiempo)

        
        contadorMatriculas+=1
        if contadorMatriculas == maxMatriculas:
            radarOn=False
    return arrayMatriculas


        
        
arrayMatriculas=carMatriculas()


for i in range(0,len(arrayMatriculas),4):
    varVelocidadCoche = round((arrayMatriculas[i+1]/1000)/(arrayMatriculas[i+3]/3600), 2)
    if varVelocidadCoche<=arrayMatriculas[i+2]:
        print(arrayMatriculas[i], varVelocidadCoche, arrayMatriculas[i+2], "Ok")
    if varVelocidadCoche>arrayMatriculas[i+2]:
        print(arrayMatriculas[i], varVelocidadCoche, arrayMatriculas[i+2], "Puntos")
    else:
        if varVelocidadCoche>arrayMatriculas[i+2]:
            print(arrayMatriculas[i], varVelocidadCoche, arrayMatriculas[i+2], "Multa")
        
    





        



        