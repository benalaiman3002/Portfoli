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
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int resultado = 1;
        System.out.println("Introduce el valor");
        int valor = in.nextInt();

        for (int i = valor; i >= 1; i--) {
            resultado = resultado * i;
            
        }
        System.out.println("El valor es " + resultado);
        int i = valor;
        resultado = 1;
        while (i >= 1) {
            resultado = resultado * i;
            i--;
        }
        System.out.println("El valor es " + resultado);
        i = valor;
        resultado = 1;
        do {
            resultado = resultado * i;
            i--;
        } while (i >= 1);
        System.out.println("El valor es " + resultado);
    }
}
