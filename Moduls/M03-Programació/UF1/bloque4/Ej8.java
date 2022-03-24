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
public class Ej8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int perf, sum = 0;
        System.out.println("Introduce un numero: ");
        perf = in.nextInt();

        for (int i = 1; i < perf; i++) {
            if (perf % i == 0) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
        if (perf == sum ) {
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }
}
