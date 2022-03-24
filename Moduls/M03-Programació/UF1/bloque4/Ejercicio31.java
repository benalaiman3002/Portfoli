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
public class Ejercicio31 {

    public static final int venedors = 4;
    public static final int productes = 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] prova2D = new int[venedors][productes];
        for (int i = 0; i < venedors; i++) {
            for (int j = 0; j < productes; j++) {
                prova2D[i][j] = (int) (Math.random() * 50);
                System.out.print(prova2D[i][j] + " ");
            }
            System.out.println("");
        }
        int sum = 0, maxVendes = 0, maxVendesProductes = 0;
        for (int i = 0; i < venedors; i++) {
            sum = 0;
            for (int j = 0; j < productes; j++) {
                sum = sum + prova2D[i][j];
            }
            System.out.println("Vendedor " + i + ": " + sum);
            if (i == 0) {
                maxVendes = i;
                maxVendesProductes = sum;
            } else {
                if (sum > maxVendesProductes) {
                    maxVendes = i;
                    maxVendesProductes = sum;
                }

            }
        }
        System.out.println("El vendedor que ha tenido mas exito ha sido " + maxVendes);
        System.out.println("Quien ha vendido mas productos ha sido " + maxVendesProductes);
    }
}
