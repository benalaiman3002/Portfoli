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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculo(in);
    }

    public static void calculo(Scanner in) {
        int valor;
        System.out.println("Introduce un valor: ");
        valor = in.nextInt();
        if (valor > 0) {
            System.out.println("El valor " + valor + " es major que 0");
        } else if(valor < 0) {
            System.out.println("El valor " + valor + " es menor que 0");
        }
    }

}
