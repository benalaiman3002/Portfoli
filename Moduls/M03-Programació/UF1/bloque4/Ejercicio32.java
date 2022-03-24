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
public class Ejercicio32 {

    public static final int venedors = 4;
    public static final int productes = 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] vendes = new int[venedors][productes];
        double[] preus = new double[productes];

        // Emplena i mostra vendes
        for (int i = 0; i < venedors; i++) {
            for (int j = 0; j < productes; j++) {
                vendes[i][j] = (int) (Math.random() * 10);
                System.out.print(vendes[i][j] + "  ");
            }
            System.out.println("");
        }

        // Emplena i mostra preus
        for (int j = 0; j < productes; j++) {
            preus[j] = Math.random() * 5;
            System.out.printf("%.2f ", preus[j]);
        }
        System.out.println("");

        // càlculs per files
        int maxVendedor = 0;
        double sum, maxVendes = 0;
        for (int i = 0; i < venedors; i++) {
            sum = 0;
            for (int j = 0; j < productes; j++) {
                sum = sum + vendes[i][j] * preus[j];
            }
            System.out.printf("Venedor %d: %.2f\n", i, sum);
            if (i == 0) {
                maxVendes = sum;
                maxVendedor = i;
            } else {
                if (sum > maxVendes) {
                    maxVendes = sum;
                    maxVendedor = i;
                }
            }
        }

        // Emplena i mostra preus
        int mesCar = 0;
        double preuMesCar = preus[0];
        for (int j = 1; j < productes; j++) {
            if (preus[j] > preuMesCar) {
                mesCar = j;
                preuMesCar = preus[j];
            }
        }

//        // Vendes per producte
        int producte;
        System.out.println("Indica producte: ");
        producte = in.nextInt();
        sum = 0;
        for (int i = 0; i < venedors; i++) {
            sum = sum + vendes[i][producte] * preus[producte];
        }
        System.out.println("Suma " + sum);
    }
}
