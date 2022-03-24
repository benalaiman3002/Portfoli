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
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hora, min, seg;
        System.out.println("Introduce una hora:");
        hora = in.nextInt();
        System.out.println("Introduce unos minutos");
        min = in.nextInt();
        System.out.println("Introduce unos segundos");
        seg = in.nextInt();
        seg++;
        if (seg >= 60) {
            min++;
            seg = 0;
        }
        if (min >= 60) {
            hora++;
            min = 0;
        }

        System.out.println("Hay " + hora + " horas " + min + " minutos y " + seg + " segundos");
    }
}
