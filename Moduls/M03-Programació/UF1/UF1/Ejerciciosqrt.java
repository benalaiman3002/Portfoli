/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejerciciosqrt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num, resultat;
        System.out.println("Valor");
        num = in.nextFloat();

        resultat = Math.sqrt(num);

        System.out.printf("Resultat %.3f", resultat);
    }
}
