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
public class EjercicioPrecio {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valorinicial, diezporciento, cincoporciento;
        System.out.println("Añade valor:");
        valorinicial = in.nextInt();
        diezporciento = valorinicial / 100 * 10;
        cincoporciento = valorinicial / 100 * 5;
        if (valorinicial > 10000) {
            System.out.println(valorinicial - diezporciento);
        } else if (valorinicial <= 10000) {
            System.out.println(valorinicial - cincoporciento);
        }
    }
}
