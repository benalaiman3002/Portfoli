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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cant, num = 0, max = 0, min = 0, suma = 0;
        System.out.println("Introduce la cantidad");
        cant = in.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce un numero ");
            num = in.nextInt();
            if (i == 0) {
                min = num;
                i = num;
            }
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
                   suma +=num;
        }
        System.out.println("El minimo es " + min);
        System.out.println("El maximo es " + max);
        System.out.println("La media es de " + suma / cant);
    }
}
