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
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce de la frase: ");
        String cadena = in.nextLine();
        System.out.println(cadena.replace(' ', '\n'));
    }

}
