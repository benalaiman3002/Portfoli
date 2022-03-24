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
public class ejercicio1_2022 {

    public static void main(String[] args) {
        int num = 0, nuv, suma = 0, total = 0;
        Scanner in = new Scanner(System.in);
        int[][] inventari = new int[4][5];
        for (int i = 0; i < inventari[0].length; i++) {
            nuv = i;
            suma = 0;
            for (int j = 0; j < inventari.length; j++) {
                if (j == 0) {
                    System.out.print(i + " ");
                } else {
                    nuv *= 2;
                    System.out.print(nuv + " ");
                }
                suma += nuv;
            }
            System.out.println("");
            num++;
            System.out.println("El total de la fila " + i + " es igual a " + suma);
            total += suma;
        }
        System.out.println("La suma total de la celda es de " + total);

    }
}
