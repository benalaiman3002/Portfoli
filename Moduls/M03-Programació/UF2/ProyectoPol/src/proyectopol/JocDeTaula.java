/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.*;

/**
 *
 * @author benal
 */
public class JocDeTaula {

    public static final int tauler = 8; //esto es la tabla

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variable intentos para que cuente los intentos que tengo
        int intentos = 0, fila, columna;
        int[][] tablero = new int[8][8];
        while (intentos <= 10) {
            intentos++;
            System.out.println("Intent " + intentos);
            System.out.println("Fila");
            fila = in.nextInt();
            System.out.println("Columna");
            columna = in.nextInt();
            creaTauler(in);
            if(existeixFitxa(fila, columna)){
                if(tocaVora(tablero, fila, columna)){
                    tablero[fila][columna] = 'N';
                }
            }
        }
    }

    public static int[][] creaTauler(Scanner in) {
        int fila = 0;
        int columna = 0;
        int intentos = 0, fitxaB = 0;
        int[][] tablero = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},};
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                int fitxaBR = (int) (Math.random() * 8);
                while (fitxaB < 20) {
                    if(tablero[i][j] == 0) {
                        tablero[i][j] = 1;
                        fitxaB++;
                    }
                }
            }
        }
        mostraTauler(tablero, fila, columna);
        return null;
    }

    public static boolean tocaVora(int[][] tablero, int fila, int columna) {
        if ((tablero[fila - 1][columna - 1] == 'N')
                || (tablero[fila - 1][columna] == 'N') || (tablero[fila - 1][columna + 1] == 'N')
                || (tablero[fila][columna - 1] == 'N') || (tablero[fila][columna + 1] == 'N')
                || (tablero[fila + 1][columna - 1] == 'N') || (tablero[fila + 1][columna] == 'N')
                || (tablero[fila + 1][columna + 1] == 'N')) {
            System.out.println("No és vàlida. Toca la vora!");
        } else {
            System.out.println("Perfecte! La posicio és valida");
        }
        mostraTauler(tablero, fila, columna);
        return true;
    }

    public static boolean existeixFitxa(int fila, int columna) {
        //Existe la fitxa dentro del tablero o no
       if (( fila == 0 ) || (fila == tauler-1) || (columna == 0) || (columna == tauler-1)){
            System.out.println("No és vàlida. Ja hi ha una fitxa!");
        } else {
            System.out.println("Perfecte! La posició és vàlida");
        }
        return true;
    }

    public static void mostraTauler(int[][] tablero, int fila, int columna) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length - 1; j++) {
                System.out.println(tablero[fila][columna] + " ");

            }
            System.out.println("");
        }

    }

}
