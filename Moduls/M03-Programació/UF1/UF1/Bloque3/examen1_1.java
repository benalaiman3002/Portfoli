/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1.Bloque3;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class examen1_1 {

    public static final int fila = 8;
    public static final int columna = 8;
    public static final int intentos = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        int[][] tauler = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tauler[2][2] = 'x';
                tauler[3][4] = 'x';
                tauler[4][1] = 'x';
                tauler[1][3] = 'x';
                int intents = 0;
                do {
                    System.out.println("Esoge la nueva fila: ");
                    int novaposiciofila = inStr.nextInt();
                    System.out.println("Escoge la nueva columna");
                    int novaposiciocolumna = inStr.nextInt();
                    if (tauler[i].length == novaposiciofila) {
                        System.out.println("No es pot introduir en aquesta casella. Intenta de nou");
                        intents++;
                    } else if (novaposiciocolumna == tauler[j].length) {
                        System.out.println("No es pot introduir en aquesta casella. Intenta de nou");
                        intents++;
                    } else {
                        tauler[i][j] = novaposiciofila;
                        tauler[i][j] = novaposiciocolumna;
                    }
                } while (intentos <= 10);
            }
        }
    }
}
