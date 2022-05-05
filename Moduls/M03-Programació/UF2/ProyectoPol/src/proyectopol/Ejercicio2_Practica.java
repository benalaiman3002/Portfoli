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
public class Ejercicio2_Practica {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lados, radi, ladosL, base;
        String opcion;
        boolean sortir = false;
        while (sortir == false) {

            opcion = in.nextLine().toLowerCase();
            switch (opcion) {
                case "q":
                    quadrat(in);
                    break;
                case "r":
                    rectangle(in);
                    break;
                case "c":
                    cercle(in);
                    break;
                case "t":
                    triangle(in);
                    break;
                case "s":
                    sortir = true;
                    break;
                default:
                    break;
            }
        }

    }

    public static void quadrat(Scanner in) {
        double lados = in.nextDouble();
        double quadrado = lados * 4;
        double quadrado2 = lados * lados;
        System.out.println("==Quadrat==");
        System.out.printf("Perímetre : %.2f \n", quadrado);
        System.out.printf("Superfície: %.2f \n", quadrado2);
    }

    public static void triangle(Scanner in) {
        double trianguloLado = in.nextDouble();
        double trianguloBase = in.nextDouble();
        double peritriangulo = trianguloLado + trianguloLado + trianguloBase;
        double areatriangulo = (trianguloBase * Math.sqrt((Math.pow(trianguloLado, 2) - (Math.pow(trianguloBase, 2) / 4)))) / 2;
        System.out.println("==Triangle isòsceles==");
        System.out.printf("Perímetre : %.2f \n", peritriangulo);
        System.out.printf("Superfície: %.2f \n", areatriangulo);
    }

    public static void rectangle(Scanner in) {
        double ladoLarge = in.nextDouble();
        double ladoCort = in.nextDouble();
        double rectPerimetro = ladoLarge * 2 + ladoCort * 2;
        double areaRect = ladoLarge * ladoCort;
        System.out.println("==Rectangle==");
        System.out.printf("Perímetre : %.2f \n", rectPerimetro);
        System.out.printf("Superfície: %.2f \n", areaRect);
    }

    public static void cercle(Scanner in) {
        double radio = in.nextDouble();
        double periCirculo = 2 * Math.PI * radio;
        System.out.println("==Cercle==");
        System.out.printf("Perímetre : %.2f \n", periCirculo);
        double areaCirculo = Math.PI * (radio * radio);
        System.out.printf("Superfície: %.2f \n", areaCirculo);
    }
}
