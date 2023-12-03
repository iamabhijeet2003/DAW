

def contadorDias (arrCorredor, arrTramo):
    acumDistancia=0
    acumAltura=0
    dias=1
    finTramos = False
    while not finTramos:
        for i in range(o,len(arrTramo),2):
            if int(arrTramo[i])==0 and int(arrTramo[i+1])==0:
                finTramos = True
                break
            
            acumDistancia+= int(arrTramo[i])
            acumAltura+= int(arrTramo[i+1])
            if int(arrCorredor[0])<=acumDistancia and int(arrCorredor[1]) <=acumAltura:
                 continue
            else:
                acumDistancia=0
                acumAltura=0
                if int(arrCorredor[0])<=acumDistancia and int(arrCorredor[1]) <=acumAltura:
                    dias +=1
                    acumDistancia+= int(arrTramo[i])
                    acumAltura+= int(arrTramo[i+1])
                else:
                    dias=0
    return dias
                    

def main():
    fich_ent = open('corredores.txt','r') #apertura de fichero
    cont_linea= 0
    arrayCorredor=[]
    arrayTramos=[]
    dias=0
    for linea in fich_ent:
        if cont_linea % 2 == 0:
            arrayCorredor=linea.split()
            #print(arrayCorredor)
        else :
            arrayTramos=linea.split()
            #print(arrayCorredor)
        cont_linea+=1
        if dias == 0:
            print("El corredor no puede realizar el entrenamiento")
        else:
            print("El corredor necesita : " + str(dias))
        
    
main()