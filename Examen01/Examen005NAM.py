#Examen005NAM
#Definir variables
    num=float()
    #Datos de entrada
    num=float(input("Ingrese el numero del ejercicio(1-4): "))
    #Proceso
    if num>=5:
        print("Ese ejercicio no existe ingrese otro")
    elif num==4:
        Examen004NAM()
    elif num==3:
        Examen003NAM()
    elif num==2:
        Examen002NAM()
    else:
        Examen001NAM()

