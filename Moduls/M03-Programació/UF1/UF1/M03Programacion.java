/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class M03Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, suma;

        System.out.println("Intro Primer Numero");
        n1 = in.nextInt();
        System.out.println("Intro Segon Numero");
        n2 = in.nextInt();

        suma = n1 + n2;
        System.out.println("La suma es " + suma);
    }

}
