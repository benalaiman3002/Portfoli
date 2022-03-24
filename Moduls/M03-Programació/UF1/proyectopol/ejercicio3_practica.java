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
public class ejercicio3_practica {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opcion;
        boolean sortir = false;
        while (sortir == false) {
            opcion = in.nextLine().toLowerCase();
            switch (opcion) {
                case "c":
                    cilindre(in);
                    break;
                case "h":
                    hexaedre(in);
                    break;
                case "t":
                    tetraedre(in);
                    break;
                case "e":
                    esfera(in);
                    break;
                case "s":
                    sortir = true;
                    break;
                default:
                    break;
            }
        }

    }

    public static void cilindre(Scanner in) {
        double radio = in.nextInt();
        double altura = in.nextInt();
        double superficiecilindro = 2 * Math.PI * (radio * altura);
        double volumencilindro = 2 * Math.PI * radio;
        System.out.println("==Cilindre==");
        System.out.printf("Superfície: %.2f \n", superficiecilindro);
        System.out.printf("Volum: %.2f \n", volumencilindro);
    }

    public static void hexaedre(Scanner in) {
        int cateto = in.nextInt();
        double hexarea = 6 * Math.pow(cateto, 2);
        double hexavolumen = Math.pow(cateto, 3);
        System.out.println("==Hexaedre==");
        System.out.printf("Superfície: %.2f \n", hexarea);
        System.out.printf("Volum: %.2f \n", hexavolumen);
    }

    public static void tetraedre(Scanner in) {
        int altura;
        double areatetra, volumentetra;
        altura = in.nextInt();
        areatetra = Math.sqrt(3) * Math.pow(altura, 2);
        volumentetra = Math.sqrt(2) / 12 * altura;
        System.out.println("==Tetraedre==");
        System.out.printf("Superfície: %.2f \n", areatetra);
        System.out.printf("Volum: %.2f \n", volumentetra);
    }

    public static void esfera(Scanner in) {
        int radioE = in.nextInt();

        double esferarea = 4 * Math.PI * Math.pow(radioE,2);
        double esfevolumen = (4 * Math.PI * Math.pow(radioE,3)) / 3;
        System.out.println("==Esfera==");
        System.out.printf("Superfície: %.2f \n", esferarea);
        System.out.printf("Volum: %.2f \n", esfevolumen);
    }
}
