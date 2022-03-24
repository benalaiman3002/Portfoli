/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque5;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio7_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] lletres = new char[5];

        System.out.println("intro paraula");
        String paraula = in.nextLine();
        intro(lletres);
        esbrina(lletres, paraula);
    }

    public static void esbrina(char[] cadena, String paraula) {

        boolean esPot, trobada;
        char lletra;

        esPot = true;
        for (int i = 0; i < paraula.length(); i++) {
            lletra = paraula.charAt(i);
            trobada = false;
            for (int j = 0; j < cadena.length; j++) {
                if (lletra == cadena[j]) {
                    trobada = true;
                }
            }
            if (trobada == false) {
                esPot = false;
            }

        }
        if (esPot == false) {
            System.out.println("No es pot");
        } else {
            System.out.println("Si que es pot");
        }
    }

    public static void intro(char[] lletres) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < lletres.length; i++) {
            lletres[i] = in.nextLine().charAt(0);
        }
    }
}
