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
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        String letra;
        int cont = 0;
        System.out.println("Introduce la frase que deseas:");
        frase = in.nextLine();
        System.out.println("Introduce la letra que quieras buscar en la frase:");
        letra = in.nextLine();
        for (int i = frase.length() - 1; i >= 0; i--) {
            char num1 = frase.charAt(i);
            char num2 = letra.charAt(0);
            if (num1 == num2) {
                cont++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + cont);
    }
}
