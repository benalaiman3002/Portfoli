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
public class Ejercicio4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        System.out.println("Añade valor:");
        valor = in.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Es par");
        } else if (valor % 2 == 1) {
            System.out.println("Es impar");
        }
    }
}
