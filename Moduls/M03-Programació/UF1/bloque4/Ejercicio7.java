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
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cinco = 0, dos = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                dos++;
            }
            if (i % 5 == 0) {
                cinco++;
            }
        }
        System.out.println("Hay " + dos + " multiplos de 2");
        System.out.println("Hay " + cinco + " multiplos de 5");
    }
}
