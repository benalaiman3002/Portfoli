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
public class EjercicioTriangulo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int piedras = 0, lados = 0, piedrasM;

        System.out.println("Introduce el numero de piedras:");
        piedrasM = in.nextInt();

        while (piedras <= piedrasM) {
            lados++;
            piedras = piedras + lados;
        }

        System.out.println("El triangulo es de " + (lados - 1));
        System.out.println("Nos sobran " + (piedrasM - (piedras - lados)));
    }
}
