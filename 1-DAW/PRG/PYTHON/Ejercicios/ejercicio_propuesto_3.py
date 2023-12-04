"""Ejercicio Propuesto 3 Pide año de nacimiento y de muerte de una persona.
Habrá que pedirlo repeti- damente hasta que sean datos coherentes.
Es decir: la fecha de defunción no puede ser anterior a la de nacimiento."""


año_de_nacimiento= int(input("Dame el año de nacimiento:"))
año_de_muerte= int(input("Dame el año de la muerte:"))

while año_de_nacimiento>año_de_muerte:
    año_de_nacimiento= int(input("Dame el año de nacimiento:"))
    año_de_muerte= int(input("Dame el año de la muerte:"))
    
edad= año_de_muerte - año_de_nacimiento
print("La edad es "+ str(edad) + " años")