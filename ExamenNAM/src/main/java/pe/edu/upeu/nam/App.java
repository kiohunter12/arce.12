package pe.edu.upeu.nam;
import java.util.Scanner;

import pe.edu.upeu.nam.Examen.Desarrollo;

/**
 * Hello world!
 *
 */
public class App { 
    public static void main( String[] args ){
        Scanner lt=new Scanner(System.in);
        int n;
        System.out.println("Indique el numero del algoritmo(2-5):");
        n=lt.nextInt();
        switch (n) {
            case 2: new Desarrollo().Pregunta02(); break;
            case 3: new Desarrollo().Pregunta03(); break;
            case 4: new Desarrollo().Pregunta04(); break;
            case 5: new Desarrollo().Pregunta05_1(); break;
            default: System.err.println("opcion invalida"); break;
            }
        }
    }


