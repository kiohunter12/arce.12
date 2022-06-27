package pe.edu.upeu.nam.Examen;

import java.util.Scanner;

public class Desarrollo {
    static Scanner lt = new Scanner(System.in);

    public void Pregunta02() {
        // Definir variables
        int cantidad = 0;
        double costV = 0, impUnit = 0, impTotal = 0, totalimpV = 0;
        // Datos de entrada y proceso y salida
        for (int i = 0; i < 3; i++) {
            System.out.println("Disponga la cantidad de vehiculos de categoria " + (i + 1) + ":");
            cantidad = lt.nextInt();
            System.out.println("Determine el precio de categoria " + (i + 1) + ":");
            costV = lt.nextDouble();
            if (i == 0) {
                impUnit = costV * 0.12;
            } else if (i == 1) {
                impUnit = costV * 0.08;
            } else {
                impUnit = costV * 0.05;
            }

            impTotal = impUnit * cantidad;
            System.out.println("Impuesto de categoria " + (i + 1) + "es:" + impUnit);
            System.out.println("Impuesto total de categoria " + (i + 1) + "es:" + impTotal);
            totalimpV = totalimpV + impTotal;
        }
        System.out.println("Impuesto total de los vehiculos es: " + totalimpV);
    }

    public void Pregunta03() {
        int h = 0;
        System.out.print("Determine la altura (considerando que sea impar y mayor o igual de 3): ");
        h = lt.nextInt();
        if (h % 2 == 1 && h>=3) {
            for (int fil = 1; fil <= h; fil++) {
                for (int col = 1; col <= h; col++) {
                    if ((fil == col) || (col == (h - fil) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR: Numero no cumple condicion");
        }
    }

    public void Pregunta04() {  int i, j, suma;
        for (i = 1; i >= 1; i++) {
            suma = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (i == suma) {
                System.out.println(i);
            }
        }
    }

    public static void imprimir() {
        int n;
        System.out.print("Indicar la cantidad de numeros perfectos: ");
        n = lt.nextInt();
        while (n > 0) {
            for (int i = 1; i >= 1; i++) {
                int suma = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        suma = suma + j;
                    }
                }
                if (i == suma) {
                    System.out.println(i);
                }
            }
            n--;
        }
     
    

    }

    public void Pregunta05_1() {
        int n;
        do {
            System.out.print("determine valor que sea mayor a 0 : ");
            n = lt.nextInt();
        } while (n < 0);
        System.out.print("Binario: ");
        ejer5_2(n);
    }

    public static void ejer5_2(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            ejer5_2(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
}    
