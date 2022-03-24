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
public class EjercicioAñobisiesto {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int año = 0;
        System.out.println("Añade el año: ");
        año = in.nextInt();

        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    System.out.println("Es bisiesto");
                } else {
                    System.out.println("No es año bisiesto");
                }
            } else {
                System.out.println("Es un año bisiesto");
            }
        } else {
            System.out.println("No es un año bisiesto");
        }
    }
}
