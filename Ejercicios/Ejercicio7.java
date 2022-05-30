package Ejercicios;

public class Ejercicio7 {
    public static void ejercicio48() {
        //Definir variables
        int años;
        double saldo=0, interes=0, total=0, deposito=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de años ahorrados: ");
        años=lt.nextInt();
        //Proceso
        while (años>0) {
            for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese el deposito del mes "+(i+1)+":");
            deposito=lt.nextDouble();
            saldo=saldo+deposito;
        }
        interes=interes+(saldo*0.10);
        total=saldo+interes;
        años=años-1;
        }
        //Datos de salida
        System.out.println("Tu ahorro en el año es: "+saldo);
        System.out.println("El interes ganado es: "+interes);
        System.out.println("Tu ahorro ya con interes es: "+total);
        System.out.println("");
    }
    
}
