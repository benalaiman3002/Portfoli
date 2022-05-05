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
public class VectoresOrdenacion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantos elementos?");
        int numElements = in.nextInt();
        int[] primers = new int[numElements];
        generaVector(numElements, in);
        ordenaSeleccio(primers);
        ordenaBombolla(primers);
    }

    public static void generaVector(int numElements, Scanner in) {
        int[] primers = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            System.out.println("numero?");
            primers[i] = in.nextInt();
        }
    }

    public static void mostraVector(int[] primers) {
        for (int i = 0; i < primers.length; i++) {
            System.out.print(primers[i] + ", ");
        }
        System.out.println("");
    }

    public static void ordenaSeleccio(int[] primers) {
        for (int i = 0; i < primers.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < primers.length; j++) {
                if (primers[j] < primers[minimo]) {
                    minimo = j;
                }
            }
            int swap = primers[i];
            primers[i] = primers[minimo];
            primers[minimo] = swap;

        }
        mostraVector(primers);
    }

    public static void ordenaBombolla(int[] primers) {
        int aux;
        for (int i = 0; i < primers.length - 1; i++) {
            for (int j = 0; j < primers.length - i - 1; j++) {
                if (primers[j + 1] < primers[j]) {
                    aux = primers[j + 1];
                    primers[j + 1] = primers[j];
                    primers[j] = aux;
                }
            }
        }
        mostraVector(primers);
    }

}
