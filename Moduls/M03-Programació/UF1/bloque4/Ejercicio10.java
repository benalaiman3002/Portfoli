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
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, divisor = 0;
        System.out.println("Introduce un numero: ");
        num = in.nextInt();
        for (int i = 1; i < 20; i++) {
            if (num % i == 0) {
                System.out.println(i + " es divisor de " + num);
            }
        }
    }
}
