package Ejercicios;

public class Ejercicio10{
    public static void EjercicioNAM411() {
        //Definir Variables
        int cantidad;
        double tipo, total=0;
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Elige el tipo de billete o moneda: \nBilletes \n1.- 200 \n2.- 100 \n3.- 50 \n4.- 20 \n5.- 10 \nMonedas \n6.- 5 \n7.- 2 \n8.- 1 \n9.- 0.50 \n10.- 0.20 \n11.- 0.10");
            tipo=lt.nextDouble();
            System.out.println("Cuanto es la cantidad de ese tipo: ");
            cantidad=lt.nextInt();
            if (tipo==1) {
                total=total+(cantidad*200);
            } else if (tipo==2) {
                total=total+(cantidad*100);
            }else if (tipo==3) {
                total=total+(cantidad*50);
            }else if (tipo==4) {
                total=total+(cantidad*20);
            }else if (tipo==5) {
                total=total+(cantidad*10);
            }else if (tipo==6) {
                total=total+(cantidad*5);
            }else if (tipo==7) {
                total=total+(cantidad*2);
            }else if (tipo==8) {
                total=total+(cantidad*1);
            }else if (tipo==9) {
                total=total+(cantidad*0.5);
            }else if (tipo==10) {
                total=total+(cantidad*0.2);
            }else{
                total=total+(cantidad*0.1);
            }
            System.out.println("Tiene mas dinero?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        //Datos de salida
        System.out.println("El dinero total es: "+total);
   }
}

    