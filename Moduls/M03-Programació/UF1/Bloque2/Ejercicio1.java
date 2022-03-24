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
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca el valor:");
        int valor = in.nextInt();
        if (valor == 0) {
            System.out.println("El número es:" + valor);
        } else {
            System.out.println("...");
        }

    }
}

