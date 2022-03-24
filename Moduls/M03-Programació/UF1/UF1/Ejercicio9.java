/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1;

import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.sqrt;

/**
 *
 * @author benal
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c1, c2, hp;

        System.out.println("Intro Primer Numero");
        c1 = in.nextFloat();
        System.out.println("Intro Segon Numero");
        c2 = in.nextFloat();

        hp = sqrt(c1 * c1 + c2 * c2);
        System.out.printf("La division es %.2f", hp);

    }
}
