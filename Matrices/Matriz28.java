import java.util.Scanner;

public class Matriz28 {
    static Scanner lt=new Scanner(System.in);
    public void M13() {
        System.out.println("Agregar dimension:");
        int dimension = lt.nextInt();
        System.out.println("Numero  inicial:");
        int valor = lt.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = (matriz.length - 1); f >= 0; f--) {
            if (f % 2 == 0) {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int c = (matriz.length - 1); c >= 0; c--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
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
        new Matriz28().M13();
    }
}
