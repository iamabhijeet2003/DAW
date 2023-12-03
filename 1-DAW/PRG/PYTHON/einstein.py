import random

MIN=0
MAX=15

def aleatorio(minimo,maximo):
    return random.randint(minimo,maximo)

def einsteinEspavilat(arrayAvg):
    arrayPatDay=[]
    arrayPatDay.append(arrayAvg[1])
    for i in range(2,len(arrayAvg)):
        for j in range(0,len(arrayPatDay)):
            acum += arrayPatDay[j]
        arrayPatDay.append((arrayAvg[i]*1)-acum)
        acum=0
    
    return arrayPatDay
    
    
    
    
def main():
    workDays=int(input("Introduce los dias trabajados: "))
    arrayAvg=[3,3,4,5]
    arrayAvg.append(workDays)
    for i in range(1,workDays+1):
        arrayAvg.append(aleatorio(MIN,MAX))
    print(arrayAvg)
    print(einsteinEspavilat(arrayAvg))

main() 