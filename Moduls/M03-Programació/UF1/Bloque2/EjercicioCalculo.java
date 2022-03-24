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
public class EjercicioCalculo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int division, suma, modulo, resta, eleccion, eleccion2, opciones;
        System.out.println("Añade un numero:");
        eleccion = in.nextInt();
        System.out.println("Añade un numero:");
        eleccion2 = in.nextInt();

        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Modulo");
        System.out.println("4.division");

        System.out.println("Que operación deseas hacer?");
        opciones = in.nextInt();

        division = eleccion / eleccion2;
        modulo = eleccion % eleccion2;
        suma = eleccion + eleccion2;
        resta = eleccion - eleccion2;

        if (opciones == 1) {
            System.out.printf("El resultado será %d ", suma);
        } else if (opciones == 2) {
            System.out.printf("El resultado será %d ", resta);
        } else if (opciones == 3) {
            System.out.printf("El resultado será %d ", modulo);
        } else if (opciones == 4) {
            System.out.printf("El resultado será %d ", division);
        }else {
            System.out.println("Error 404");
        }
    }
}
