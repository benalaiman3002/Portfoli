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
public class ej13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, num, maxim = 0, nombre = 0;
        System.out.printf("Introdueix la xifra...");
        maxim = in.nextInt();

        for (i = 1; i < 10; i++) {
            System.out.printf("Introdueix la xifra...");
            num = in.nextInt();

            if (num == maxim) {
                nombre++;
            } else if (num > maxim) {
                maxim = num;
                nombre = 1;
            }
        }
        System.out.printf("el màxim és %d i es repeteix %d vegades", maxim, nombre);
                
            }
        }
