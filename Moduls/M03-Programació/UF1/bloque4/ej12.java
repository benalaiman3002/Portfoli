/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloque4;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class ej12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int j = 10; j >= 6; j--) {
            for (int i = j; i >= 0; i--) {
                if (i == 0) {

                    System.out.printf("%d \n", i);
                }
                if (i != 0) {
                    System.out.printf("%d", i);
                }
            }

        }

    }
}
