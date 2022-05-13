def Examen004NAM():
    #Definir variables
    años:float()
    genero:str()
    total:float()
    mensaje:str()
    #Datos de entrada
    años=float(input("Ingrese la cantidad de años: "))
    genero=str(input("Ingrese el genero (masculino o femenino): "))
    #Proceso
    if años>=70:
        mensaje=("Su vacuna es de tipo C")
    elif años>=16 and años<70 and genero=="masculino":
        mensaje=("Su vacuna es de tipo A")
    elif años>=16 and años<70 and genero=="femenino":
        mensaje=("Su vacuna es de tipo B")
    else:
        mensaje=("Su vacuna es de tipo A")
    #Datos de salida
    print(mensaje)
Examen004NAM()

