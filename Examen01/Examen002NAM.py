def Examen002NAM():
    #Definir variables
    precio:float()
    igv:float()
    descuento:float()
    total:float()
    preFi:float()
    #Datos de entrada
    precio=float(input("Ingrese el monto del articulo: "))
    #Proceso
    if precio>=2000:
        descuento=precio*0.10
    elif precio>=1000 and precio<2000:
        descuento=precio*0.05
    elif precio>=500 and precio<1000:
        descuento=precio*0.02
    else:
        descuento=precio*0
    total=precio-descuento
    igv=total*0.18
    preFi=total+igv
    #Datos de salida
    print(f"El IGV a cobrar total es: {igv}")
    print(f"El descuento del articulo total es: {descuento}")
    print(f"El monto total a pagar es: {preFi}")
Examen002NAM()

