/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1;

import java.util.Scanner;
import static javax.management.Query.div;

/**
 *
 * @author benal
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, suma;

        System.out.println("Intro Primer Numero");
        n1 = in.nextFloat();
        System.out.println("Intro Segon Numero");
        n2 = in.nextFloat();

        suma = n1 / n2;
        System.out.println("La division es " + suma);

    }
}
