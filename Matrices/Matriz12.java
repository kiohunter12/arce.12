import java.util.Scanner;

public class Matriz12 {
    static Scanner lt=new Scanner(System.in);
    public void M5() {
        String[][] matriz;
        System.out.println("agregue dimension:");
        int dimension = lt.nextInt();
        System.out.println("numero inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = matriz[f].length-1; c >= f; c--) {
                matriz[f][c] = String.valueOf(valor); 
                valor++; 
        }
    }
    imprimirMatriz(matriz);
    }
    public void imprimirMatriz(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if (m[f][c] == null) {
                    System.out.print("\t");
                } else {
                    System.out.print(m[f][c] + "\t");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        new Matriz12().M5();
    }
}
