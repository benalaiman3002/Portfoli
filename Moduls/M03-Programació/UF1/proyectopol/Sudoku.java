/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.Scanner;

public class Sudoku {

    /**
     * @param args the command line arguments
     */
    public static final int filas = 9;
    public static final int columnes = 9;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] sudoku = new int[filas][columnes];
        System.out.println("Cuantas veces quieres repetir?");
        int cont = in.nextInt();
        for (int i = 0; i < cont; i++) {
            sudoku = llegirSudoku(in);
            if (esFilaValida(sudoku) && esColumnaValida(sudoku) && esRegioValida(sudoku)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static int[][] llegirSudoku(Scanner in) {
        int sud[][] = new int[filas][columnes];
        for (int i = 0; i < sud.length; i++) {
            for (int j = 0; j < sud[0].length; j++) {
                sud[i][j] = in.nextInt();
            }
            System.out.println("");
        }

        return sud;
    }

    public static boolean esFilaValida(int[][] sudoku) {
        int num = 0;
        for (int i = 0; i < columnes; i++) {
            for (int valor = 1; valor <= columnes; valor++) {
                num = 0;
                for (int j = 0; j < filas; j++) {
                    if (sudoku[i][j] == valor) {
                    }
                    if (num >= 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean esColumnaValida(int[][] sudoku) {
        int num = 0;
        for (int i = 0; i < filas; i++) {
            for (int valor = 1; valor <= columnes; valor++) {
                num = 0;
                for (int j = 0; j < columnes; j++) {
                    if (sudoku[i][j] == valor) {
                    }
                    if (num >= 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean esRegioValida(int[][] sudoku) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int k = 0; k < 8; k++) {
                    for (int t = k + 1; t < 9; t++) {
                        if (sudoku[i + k % 3][j + k / 3] == sudoku[i + t % 3][j + t / 3]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
