package Ejercicios;

public class Ejercicio6 {
    public static void ejercicio46() {
        //Definir variables
        int v;
        //Datos de entrada
        System.out.println("Ingrese el proceso deseado \n1.-While \n2.-For");
        v=lt.nextInt();
        switch (v) {
            case 1:ejercicio42(); break;
            case 2://Definir variables
                int i=0,n,tarjeta,hamburguesa;
                double total=0;
                //Datos de entrada
                System.out.println("Sencillo(1) \nDoble(2) \nTriple(3)");
                while (i<3) {
                hamburguesa=i+1;
                System.out.println("Ingrese la cantidad de hamburguesas del tipo "+(i+1)+":");
                n=lt.nextInt();
                switch (hamburguesa) {
                    case 1:total=total+10*n; break;
                    case 2:total=total+12*n; break;
                    case 3:total=total+14*n; break;
                    default: break;
                }
                i++;
                }
                System.out.println("Elige el tipo de pago: \n1.- Efectivo \n2.-Trajeta de credito");
                tarjeta=lt.nextInt();
                switch (tarjeta) {
                    case 1:System.out.println("El total a pagar es de: "+total+" pesos"); break;
                    case 2:total=total+(total*0.05); System.out.println("El total a pagar es de: "+total+" pesos"); break;
                    default: break;
                }
            default:break;
        }
    }
    
    
}
