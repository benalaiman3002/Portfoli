/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloque4;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio_bidimensional {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        int[][] prova2D = new int[3][3];
        for (int i = 0; i < prova2D.length; i++) {
            for (int j = 0; j < prova2D[i].length; j++) {
                prova2D[i][j] = num;
                num = num * 2;
            }
        }
        for (int i = 0; i < prova2D.length; i++) {
            for (int j = 0; j < prova2D[i].length; j++) {
                System.out.print(prova2D[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
