package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner lt=new Scanner(System.in);
    public static void ejercicio41() {
        //Definir variables
        double total=1500;
        //Proceso
        for (int i = 0; i < 6; i++) {
            total=total+(total*0.10);
            System.out.println("Su salario el "+(i+1)+" año sera de:"+total);
        }
    }
}
