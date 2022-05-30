package Ejercicios;

public class Ejercicio5 {
    public static void ejercicio45() {
        //Definir variables
        int n;
        //Datos de entrada
        System.out.println("Ingrese el proceso deseado \n1.-While \n2.-For");
        n=lt.nextInt();
        switch (n) {
            case 1://Definir variables
                    int v=0;
                    double salario=1500;
                    while (v<6) {
                    salario=salario+(salario*0.10);
                    System.out.println("Su salario el "+(v+1)+" año sera de:"+salario);
                    v++;
                    }; break;
            case 2://Definir variables
                double total=1500;
                for (int i = 0; i < 6; i++) {
                total=total+(total*0.10);
                System.out.println("Su salario el "+(i+1)+" año sera de:"+total);
                }break;
            default:
                break;
        }
    }
    
}
