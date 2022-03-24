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
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tabla = 0, numero = 0, answer;
        for (numero = 2; numero <= 10; numero++) {
            if (numero % 2 == 0) {
                for (tabla = 0; tabla <= 10; tabla++) {
                    answer = tabla * numero;
                    System.out.println("La multiplicacion entre " + numero + " y " + tabla + " es igual a " + answer);
                }
            }
        }

    }
}
