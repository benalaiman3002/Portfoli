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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma = 0;
        int[] inventari = new int[100];
        for (int i = 0; i < inventari.length; i++) {
            if (i % 3 == 0) {
                suma += i;
            }
        }
        System.out.println(suma + " es multiplo de 3");
    }
}
