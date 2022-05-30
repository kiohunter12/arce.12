package Ejercicios;

public class Ejercicio3 {
    public static void ejercicio43() {
        //Definir variables
        int conta0=0,contaMas=0,contaMenos=0, n,num;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
        n=lt.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Dame un numero: ");
            num=lt.nextInt();
            if (num<0) {
                contaMas=contaMas+1;
            } else if (num==0) {
                conta0=conta0+1;
            } else {
                contaMenos=contaMenos+1;
            }
        }
        System.out.println("La cantidad de numeros igual a 0 es: "+conta0);
        System.out.println("La cantidad de numeros mayor a 0 es: "+contaMas);
        System.out.println("La cantidad de numeros menor a 0 es: "+contaMenos);
    }
   
}
