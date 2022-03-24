/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1.Bloque3;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operacion = 1;
        int potencia;
        System.out.println("Introduce el numero a elevar");
        potencia = in.nextInt();
        System.out.println("Introduce el elevado:");
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            operacion = operacion * potencia;
            System.out.println("El resultado es " + operacion);
        }

    }
}
