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
public class Primos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0, esPrimer = 0, num;
        num = in.nextInt();
        int primos[] = new int[num];
        while (esPrimer != num) {
            cont++;
            if (esNombrePrimer(cont)) {
                primos[esPrimer] = cont;
                esPrimer++;
            }
        }
        muestra(primos);
    }

    public static boolean esNombrePrimer(int nombre) {
        int div = 0;
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                div++;
            }
        }
        if (div == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static void muestra(int[] primos) {
        int cont = 0;
        for (int i = 0; i < primos.length; i++) {
            cont++;
            if (i == primos.length - 1) {
                System.out.print(primos[i] + ".");
            } else {
                System.out.print(primos[i] + ", ");
            }
            if (cont == 10) {
                System.out.println("");
                cont = 0;
            }

        }
    }

}
