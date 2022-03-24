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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, par = 0, impar = 1;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                par += i;
            }
            if (i % 2 == 1) {
                impar *= i;
            }
        }
        System.out.println("Numeros par " + par);
        System.out.println("Numeros impar " + impar);
    }
}
