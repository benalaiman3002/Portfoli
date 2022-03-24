/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1.Bloque3;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = 0, i, numeropar = 0;
        System.out.println("Introduce el valor:");
        valor = in.nextInt();
        while (valor != 0) {
            if (valor % 2 == 0) {
                numeropar++;
            } else {
            }
            System.out.println("Introduce el valor:");
            valor = in.nextInt();

        }
        System.out.println("Hay" + numeropar + "numeros pares");

    }
}
