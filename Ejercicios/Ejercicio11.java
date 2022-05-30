package Ejercicios;

public class Ejercicio11 {
    import java.util.Scanner;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int billetes_de_10, billetes_de_20, billetes_de_50, billetes_de_100, billetes_de_200;
        int monedas_de_01, monedas_de_02, monedas_de_05, monedas_de_1, monedas_de_2, monedas_de_5;
        int monedas_de_, total;
        System.out.print("Ingresa el valor de billetes de 10: ");
        billetes_de_10 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 20: ");
        billetes_de_20 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 50: ");
        billetes_de_50 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 100: ");
        billetes_de_100 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 200: ");
        billetes_de_200 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 01: ");
        monedas_de_01 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 02: ");
        monedas_de_02 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 05: ");
        monedas_de_05 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 1: ");
        monedas_de_1 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 2: ");
        monedas_de_2 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 5: ");
        monedas_de_5 = in.nextInt();
        in.nextLine();
        total=billetes_de_10*10+billetes_de_20*20+billetes_de_50*50+billetes_de_100*100+billetes_de_200*200+monedas_de_01*01+monedas_de_02*02+monedas_de_05*05+monedas_de_1*1+monedas_de_2*2+monedas_de_5*5+monedas_de_1;
        System.out.println("Valor de total: " + total);
    }

}
    

