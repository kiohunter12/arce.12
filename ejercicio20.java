import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ejercicio20 {
    public static void main(String[] args) {
        //declarar variables
        int talla;
        double cantTela, costoTela, cantPant, pbase=0, utilUni, pf, utilTotal, cantTP;
        String modelo;
        //Datos de Entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el modelo:");
        modelo=lt.next();
        System.out.println("ingrese talla a confeccionar:");
        talla=lt.nextInt();
        System.out.println("cantidad tela:");
        cantTela=lt.nextDouble();
        System.out.println("costo tela x Mt:");
        costoTela=lt.nextDouble();
        System.out.println("mt Tela x Pantalon:");
        cantTP=lt.nextDouble();
        //Proceso
        cantPant=Math.round(cantTela/cantTP);
        if (modelo.equals("A")) {
            if(talla==32||talla==36){
                pbase=costoTela+costoTela*0.80+costoTela*0.04;
            }else{
                pbase=costoTela+costoTela*0.80;
            }
            
        } else {
            if(talla==32||talla==36){
                pbase=costoTela+costoTela*0.95+costoTela*0.04;
            }else{
                pbase=costoTela+costoTela*0.95;
            }
        }

        utilUni=pbase*0.30;
        pf=utilUni+pbase;
        utilTotal=utilUni*cantPant;
        //Datos de salida
        System.out.println("Precio de cada pantalon:"+pf);
        System.out.println("utilidad total"+utilTotal);
   }
 }     