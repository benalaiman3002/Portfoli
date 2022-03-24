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
public class Ejercicio3 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        System.out.println("Añade valor:");
        valor = in.nextInt();

        if (valor == 0) {
            System.out.println(valor + "el numero es" + valor);
        } else if (valor < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Positivo");
        }
    }
}
