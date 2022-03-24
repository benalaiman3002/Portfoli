/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque2;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        System.out.println("Añade valor:");
        valor = in.nextInt();
        int valor2;
        System.out.println("Añade valor:");
        valor2 = in.nextInt();

        if (valor < valor2) {
            System.out.println(valor + " es menor que " + valor2);
        } else if (valor > valor2) {
            System.out.println(valor + " es más grande que " + valor2);
        } else if (valor == valor2) {
            System.out.println("Son iguales");
        }
    }
}
