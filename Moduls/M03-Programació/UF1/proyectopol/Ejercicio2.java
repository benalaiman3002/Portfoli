/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculo(in);
    }

    public static void calculo(Scanner in) {
        System.out.println("Introduce el primer valor:");
        int primervalor = in.nextInt();
        System.out.println("Introduce el segundo valor");
        int segonvalor = in.nextInt();
        int resultado = primervalor + segonvalor;
        System.out.println("La suma de " + primervalor + " + " + segonvalor + " es de " + resultado);
    }

}
