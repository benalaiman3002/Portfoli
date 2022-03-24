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
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        int contador = 0;
        System.out.println("Escribe una frase:");
        frase = in.nextLine();
        for (int i = frase.length() - 1; i >= 0; i--) {
            if (frase.charAt(i) == 'a') {
                contador++;
            }
        }
        System.out.println(contador);
    }
}