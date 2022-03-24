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
public class Ejercicio15 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float notas = 0;
        System.out.println("Añade nota:");
        notas = in.nextFloat();

        if (notas < 4.99) {
            System.out.println("Suspenso");
        } else if ((notas >= 5) && (notas <= 5.99)) {
            System.out.println("Aprobado");
        } else if ((notas >= 6) && (notas <= 6.99)) {
            System.out.println("Bien");
        } else if ((notas >= 7) && (notas < 8.50)) {
            System.out.println("Notable");
        } else if ((notas >= 8.50) && (notas <= 10)) {
            System.out.println("Excelente");
        }
    }
}
