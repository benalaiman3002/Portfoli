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
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int par = 0, impar = 0;
        int[] inventari = new int[20];
        for (int i = 0; i < inventari.length; i++) {
            System.out.println("Pon un numero: ");
            inventari[i] = in.nextInt();
            if (inventari[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Hay " + par + " numeros pares");
        System.out.println("Hay " + impar + " numeros impares");
    }
}
