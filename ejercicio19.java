import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ejercicio19 { 
    static Scanner lt=new Scanner(System.in); 
    public static void main(String[]args){ 
        //DECLARAR VARIABLES 
        int edad; 
        String genero; 
        String corresponde;
        //DATOS DE ENTRADA
        System.out.print("INGRESE LA EDAD:"); 
        edad=lt.nextInt(); 
        System.out.println("INGRESE EL GENERO:(F=femenino y M=masculino)"); 
        genero=lt.next(); 
        //PROCESO
        if(genero=="M"){ 
            System.out.println("ERES VARON"); 
        }else if(genero=="F"){ 
            System.out.println("ERES MUJER");
        } 
        if(edad>70){ 
            corresponde="Le corresponde la vacuna tipo C";
        }else if(edad>16 && edad<70){ 
            corresponde="Le corresponde la vacuna tipo B"; 
        }else if(edad>16 && edad<70){ 
            corresponde="Le corresponde la vacuna tipo C";
        }else { 
            corresponde="Le corresponde la vacuna tipo A";
        }
        //DATOS DE SALIDA
        System.out.println(corresponde); 
    } 
} 