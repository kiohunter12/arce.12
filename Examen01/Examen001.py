def Examen001():
    #Definir variables
    exCon:float()
    e:float()
    p:float()
    t:float()
    enPer:float()
    test:float()
    total:float()
    mensaje:str()
    #Datos de entrada
    exCon=float(input("Ingrese la nota de su examen(0-20): "))
    enPer=float(input("Ingrese la nota de entrevista personal(0-20): "))
    test=float(input("Ingrese la nota del test psicologico(0-20): "))
    #Proceso
    e=exCon*0.4
    t=test*0.25
    p=enPer*0.35
    total=e+p+t
    if total>20:
        mensaje=("Introdusca de nuevo los datos")
    elif total>=17:
        mensaje=("Su nivel es 4")
    elif total>=14 and total<17:
        mensaje=("Su nivel es 3")
    elif total>=11 and total<14:
        mensaje=("Su nivel es 2")
    else:
        mensaje=("Su nivel es 1, por ende no obtiene vacante")
    #Datos de salida
    print(mensaje)