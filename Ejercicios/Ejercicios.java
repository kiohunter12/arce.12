package Ejercicios;

import java.util.Scanner;

import EstRepetitiva.Ejervarios;

public class NAejercicio {
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
    public static void NAejercicio() {
        //Definir variables
        int n,tarjeta,hamburguesa;
        double total=0;
        //Datos de entrada
        System.out.println("Sencillo(1) \nDoble(2) \nTriple(3)");
        for (int i = 0; i < 3; i++) {
            hamburguesa=i+1;
            System.out.println("Cantidad de hamburguesas "+(i+1)+":");
            n=lt.nextInt();
            switch (hamburguesa) {
                case 1:total=total+10*n; break;
                case 2:total=total+12*n; break;
                case 3:total=total+14*n; break;
                default: break;
            }
        }
        System.out.println("forma de pago: \n1.- Efectivo \n2.-Trajeta de credito");
        tarjeta=lt.nextInt();
        switch (tarjeta) {
            case 1:System.out.println("pago completo es: "+total+" pesos"); break;
		    case 2:total=total+(total*0.05); System.out.println("El total a pagar es de: "+total+" pesos"); break;
            default: break;
        }
    }
    public static void NAejercicio() {
        //Definir variables
        int conta0=0,contaMas=0,contaMenos=0, n,num;
        //Datos de entrada
        System.out.println("cantidad total de numeros a ingresar: ");
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
    public static void NAejercicio() {
        //Definir Variables
        int cantfocoV=0, cantfocoB=0, cantfocoR=0;
        String colorF="";
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingrese el color de Foco:\nV=Verde\nB=Blanco\nR-Rojo");
            colorF=lt.next().toUpperCase();
            if (colorF.charAt(0)=='V') {
                cantfocoV++;
            }else if (colorF.charAt(0)=='B') {
                cantfocoB++;
            } else if (colorF.charAt(0)=='R') {
                cantfocoR++;
            }else{
                System.err.println("No es correcto el color de foco");
            }
            System.out.println("Tiene mas focos a evaluar?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        //Datos de salida
        System.out.println("Numero de focos de color Verde es: "+cantfocoV);
        System.out.println("Numero de focos de color Blanco es:" +cantfocoB);
        System.out.println("Numero d de focos de color Rojo es: "+cantfocoR);
        System.out.println("Numero  Total de focos son: "+(cantfocoV+cantfocoB+cantfocoR));
    }
    public static void NAejercicio() {
        //Definir variables
        int n;
        //Datos de entrada
        System.out.println("Proceso a que desea realizar \n1.-While \n2.-For");
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
    public static void NAejercicio() {
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
    public static void NAejercicio() {
        //Definir Variables
        int cantNumMayorcero=0, cantNumMenorIgualCero=0;
        double numN=0;
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingrese un numero:");
            numN=lt.nextDouble();
            if (numN<=0) {
                cantNumMenorIgualCero++;
            }else{
                cantNumMayorcero++;
            }
            System.out.println("Desea ingresar mas numeros?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }  
        //Datos de salida
        System.out.println("Cantidad de numeros Mayores de cero: "+cantNumMayorcero);
        System.out.println("Cantidad de numeros menores e iguales a cero: "+cantNumMenorIgualCero);
        System.out.println("Total de numeros introducidos: "+(cantNumMayorcero+cantNumMenorIgualCero));
    }
    public static void NAejercicio() {
        //Definir variables
        int años;
        double saldo=0, interes=0, total=0, deposito=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de años ahorrados: ");
        años=lt.nextInt();
        //Proceso
        while (años>0) {
            for (int i = 0; i < 12; i++) {
            System.out.println("Cantidad por mes "+(i+1)+":");
            deposito=lt.nextDouble();
            saldo=saldo+deposito;
        }
        interes=interes+(saldo*0.10);
        total=saldo+interes;
        años=años-1;
        }
        //Datos de salida
        System.out.println("Ahorro anual es: "+saldo);
        System.out.println("El interes generado es: "+interes);
        System.out.println("Ahorro mas interes es: "+total);
        System.out.println("");
    }
    public static void NAejercicio() {
        //Definir datos
        int n,salones,edad,suma=0,total=0,alumnos=0;
        //Datos de entrada
        System.out.println("Numero de salones: ");
        salones=lt.nextInt();
        while (salones>0) {
            System.out.println("Ingrese la cantidad de alumnos: ");
            n=lt.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese la edad del alumno: "+(i+1));
                edad=lt.nextInt(); 
                suma=suma+edad;
            }
            System.out.println("el promedio del salon es "+salones+" es: "+(suma/n)+" años");
            alumnos = alumnos + n;
            total = total + suma;
	        salones = salones - 1;
            suma=suma*0;
        }
        System.out.println("al promediar el colegio se obtiene: "+(total/alumnos)+" años");
    }
  
    }
    public static void NAejercicio() {
         //Definir Variables
         int cantidad;
         double tipo, total=0;
         String continuar="S";
         //Datos de entrada y proceso
         while (continuar.equals("S")) {
             System.out.println("tipo de cheque o moneda: \nBilletes \n1.- 200 \n2.- 100 \n3.- 50 \n4.- 20 \n5.- 10 \nMonedas \n6.- 5 \n7.- 2 \n8.- 1 \n9.- 0.50 \n10.- 0.20 \n11.- 0.10");
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
    public static void NAejercicio() {
        //Definir variables
        int n,venta;
        double a=0,b=0,c=0,total=0,total1=0,total2=0,total3=0;
        //datos de entrada
        System.out.println("Ingresa el numero de ventas: ");
        n=lt.nextInt();
        while (n>0) {
            System.out.println("Ingresa el monto de la venta "+n);
            venta=lt.nextInt();
            if (venta>=20000){
			    a = a + 1;
			    total1 = total1+venta;
            }else if (venta>=10000 && venta<20000){
				b = b + 1;
				total2 = total2 + venta;
            }else{
				c = c + 1;
				total3 = total3 + venta;
            }
			total = total + venta;
		    n = n - 1;
       }
        System.out.println("El numero de ventas mayores a $20,000 es: "+a);
        System.out.println("El total de las ventas mayores a $20,000 es: "+total1);
	    System.out.println("El numero de ventas mayores a $10,000 y menores a $20,000 es: "+b);
	    System.out.println("El total de las ventas mayores a $10,000 y menores a $20,000 es: "+total2);
	    System.out.println("El numero de ventas menores a $10,000 es: "+c);
	    System.out.println("El total de las ventas menores a $10,000: "+total3);
	    System.out.println("El monto total de la ventas es: $"+total);
    }
 


