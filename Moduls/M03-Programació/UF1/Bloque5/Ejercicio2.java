/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque5;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma = 0, sumaimp = 0;
        int[] inventari = new int[10];

        for (int i = 0; i < inventari.length; i++) {
            System.out.println("Introduce una nota:");
            inventari[i] = in.nextInt();
            if (i % 2 == 0) {
                suma += inventari[i];
            } else {
                sumaimp += inventari[i];
            }
        }
        System.out.println("La suma total es de " + suma);
        System.out.println("La suma total de los impares es de " + sumaimp);
    }
}
