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
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] inventari = new float[20];
        for (int i = 0; i < inventari.length; i++) {
            inventari[i] = (int) (Math.random() * 10 - 5);
            if (inventari[i] > 0) {
                int positivos = 0;
                positivos++;
            }else if(inventari[i] < 0) {
                int negativos = 0;
                negativos++;
            }else {
                int zero = 0;
                zero++;
            }

        }
    }
}
