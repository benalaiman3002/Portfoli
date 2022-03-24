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
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce de la frase: ");
        String cadena = in.nextLine();
        cadena = cadena.toLowerCase();
        boolean palindrom = true;
        int i = 0, z;
        int longitud = cadena.length();
        z = longitud - 1;
        while ((i < z) && (palindrom == true)) {
            if (cadena.charAt(i) == ' ') {
                i++;
            }
            if (cadena.charAt(z) == ' ') {
                z--;
            }
            if (cadena.charAt(i) != cadena.charAt(z)) {
                palindrom = false;
            }
         i++;
         z--;
        }
        if (palindrom == true) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}
