/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

/**
 *
 * @author benal
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static final int fila = 5;
    public static final int columna = 5;

    public static void main(String[] args) {
        int[][] matriz = new int[fila][columna];
        int[][] fichanegra = {{' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' '}};
    }

    public int[][] comptaMines(int[][] campo) {
        boolean valido = true;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                campo[i][j] = (int) (Math.random() * -1);
                if (campo[i][j] == 0) {//i = -1  i =1
                    for (int k = -1; k < i+1 && valido; k++) {
                        for (int z = -1; z < j+1 && valido; z++) {
                            if ((z == 0) || (z == 5) || (k == 0) || (k == 5)) {
                                valido = false;
                            } else if ((campo[z-1][k-1] == -1 && campo[i][j] == -1 && campo[z+1][k+1] == -1 && campo[z-1][k+1] == -1 && campo[z+1][k-1] == -1)) {
                                campo[i][j]++;
                            }
                            if (valido) {
                                System.out.println("Valido");
                            } else {
                                System.out.println("No valido");
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

}
