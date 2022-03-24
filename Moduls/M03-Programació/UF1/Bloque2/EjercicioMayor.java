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
public class EjercicioMayor {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A;
        System.out.println("Añade valor:");
        A = in.nextInt();
        int B;
        System.out.println("Añade valor:");
        B = in.nextInt();
        int C;
        System.out.println("Añade valor:");
        C = in.nextInt();

        if (A > B) {
            if (A > C) {
                System.out.println("Mayor es = " + A);
            } else {
                System.out.println("Mayor es = " + C);
            }
        } else if (A < B) {
            if (B > C) {
                System.out.println("Mayor es = " + B);
            } else {
                System.out.println("Mayor es = " + C);
            }
        }
    }
}
