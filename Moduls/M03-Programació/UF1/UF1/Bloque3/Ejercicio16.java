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
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase1 = "Hola que tal estas";
        for (int i = frase1.length() - 1; i >= 0; i--) {
            System.out.print(frase1.charAt(i));
        }
        System.out.println("");
    }
}
