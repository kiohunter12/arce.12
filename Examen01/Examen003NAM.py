def Examen003NAM():
    #Definir variables
    num1:float()
    num2:float()
    signo:str()
    total:float()
    #Datos de entrada
    num1=float(input("Ingrese el 1° numero: "))
    num2=float(input("Ingrese el 2° numero: "))
    print("+ = suma")
    print("- = resta")
    print("/ = divicion")
    print("* = multiplicacion")
    print("^ = potencia")
    print("R = raiz")
    print("% = modulo de 2")
    signo=str(input("Ingrese el signo: "))
    #Proceso
    if signo=="+":
        total=num1+num2
    elif signo=="-":
        total=num1-num2
    elif signo=="/":
        total=num1/num2
    elif signo=="*":
        total=num1*num2
    elif signo=="^":
        total=num1**num2
    elif signo=="R":
        total=num1**(num2**-1)
    elif signo=="%":
        total=num1-num1
    #Datos de salida
    print(f"El resultado de su operacion es: {total}")
Examen003NAM()
