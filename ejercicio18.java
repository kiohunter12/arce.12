
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ejercicio18 {
        static Scanner lt=new Scanner(System.in); 
            public static void main(String[]arg){ 
            //DECLARAR VARIABLES  
            double bono,antiguedad,sueldo; 
            System.out.println("Ingrese el sueldo:"); 
            sueldo=lt.nextDouble(); 
            System.out.println("Ingrese la antiguedad:"); 
            antiguedad=lt.nextInt();
            //PROCESO
            if(antiguedad>4||sueldo<2000){ 
                bono=sueldo*0.25;
            }else{ 
                bono=sueldo*0.20; 
            } 
            //DATOS DE SALIDA 
            System.out.println("El bono que le corresponde es:"+bono); 
        } 
  }