import random

MIN = 1
MAX = 100
intentos=0
partidasJugadas=0
partidasGanadas=0
mediaIntentos=0
minIntentos=0
maxIntento=0
arrayIntentosGanados= []

def aleatorio(MIN,MAX):
    return random.randint(MIN,MAX)
    
#def incrementaIntentos():
    
#def recuperaIntervalo():
    

def main():
    global partidasJugadas
    global partidasGanadas
    intentos = int(input("Introduce el numero de intentos maximo: "))
    seguirJugando = True
    acertado=False
    intentosUsuario = 0
    while seguirJugando:
        minUsuario = MIN
        maxUsuario = MAX
        numExacto = aleatorio(MIN,MAX)
        while not acertado and intentosUsuario<intentos:
            num=int(input("Introduce un numero entre  "+ str(minUsuario) + " y " + str(maxUsuario) + " : "))
            intentosUsuario+=1
            
            if num == numExacto:
                acertado = True
                partidasJugadas+=1
                #global partidasJugadas
                partidasGanadas+=1
                arrayIntentosGanados.append(intentosUsuario)
                print("Has acertado el numero en "+  str(intentosUsuario) + " intentos. ")
                
            if intentosUsuario==intentos:
                print("Has alcanzado el numero maximo de intentos," + str(intentos) )
                break
            elif num<numExacto:
                minUsuario= num+1
                print("No has acertado el numero. Prueba entre " + str(num+1) + " y " + str(maxUsuario))
            elif num>numExacto:
                maxUsuario=num-1
                print("No has acertado el numero. Prueba entre" + str(minUsuario) +  " y " + str(num-1))
            if intentosUsuario==intentos:
                print("Has alcanzado el numero maximo de intentos," ,intentos)
                
            
        



main()