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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota = 0, notable = 0;
        int[] inventari = new int[10];
        for (int i = 0; i < inventari.length; i++) {
            System.out.println("Añade las notas: ");
            inventari[i] = in.nextInt();
            nota += inventari[i];

            if ((inventari[i] >= 7) && (inventari[i] < 9)) {
                System.out.println("Notable");
                notable++;
            }
        }
        nota = nota / inventari.length;
        System.out.println("La nota mitjana es de : " + nota);
        System.out.println("Han habido un total de " + notable + " notables");
    }
}
