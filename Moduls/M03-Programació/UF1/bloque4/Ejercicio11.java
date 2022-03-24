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
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero: ");
        num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            double raiz = Math.sqrt(i);
            System.out.printf("La raiz quadrada de %d es : %.2f \n", i, raiz);
        }
        
    }
}
