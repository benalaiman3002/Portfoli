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
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        System.out.println("Introduce la frase que deseas:");
        frase = in.nextLine();
        for (int j = frase.length() - 1; j >= 0; j--) {
            char num1 = frase.charAt(j);
            switch (num1) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("En la frase se encuentra " + a + " 'a', " + e + " 'e' " + i + ", 'i' " + o + ", 'o' y finalmente " + u + " 'u'");

    }
}
