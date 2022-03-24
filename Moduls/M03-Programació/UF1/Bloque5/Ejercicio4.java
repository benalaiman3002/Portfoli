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
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota = 0;
        int[] inventari = new int[20];
        for (int i = 0; i < inventari.length; i++) {
            System.out.println("Introduce una nota:");
            inventari[i] = in.nextInt();
            nota = nota + inventari[i];
        }
        nota = nota / inventari.length;
        System.out.println(nota);
    }
}
