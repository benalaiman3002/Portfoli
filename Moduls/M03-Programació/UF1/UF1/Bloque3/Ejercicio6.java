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
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, sumavalor = 0;
        while (i <= 100) {
            sumavalor = sumavalor + i;
            i++;
        }
        System.out.print("el resultado es " + sumavalor);
    }
}
