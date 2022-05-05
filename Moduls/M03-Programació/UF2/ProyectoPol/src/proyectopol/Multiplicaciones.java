/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Multiplicaciones {

    /**
     * @param args the command line arguments
     */
    public static final int COLUMNA = 4;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int taula = 0, n = 0;
        muntarLiniaTaulaMultiplicar(taula, n, in);
    }

    public static String muntarLiniaTaulaMultiplicar(int totaltaules, int n, Scanner in) {
        int cont = 0;
        System.out.println("Cuantas tablas de multiplicas quieres?");
        totaltaules = in.nextInt();
        int aux = 0;
        int end = 0;
        for (int k = 1; k <= totaltaules; k += COLUMNA) {
            System.out.println();
            end = Math.min(totaltaules, k + COLUMNA - 1);
            for (int j = 1; j <= 10; j++) {
                System.out.println("");
                for (int i = k; i <= end; i++) {
                    System.out.print(i + " x " + j + " = " + (i * j + "\t"));
                }
            }
        }

        return null;
    }

    public static String muntarLiniaPantalla(int taulaInicial, int taulaFinal, int n) {

        return null;
    }

    public static void mostrarBlocPantalla(int taulaInicial, int taulaFinal) {

    }
}
