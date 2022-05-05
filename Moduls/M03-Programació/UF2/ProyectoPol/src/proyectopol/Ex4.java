/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.*;
import java.util.Scanner;

public class Ex4 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numElements = in.nextInt();
        in.nextLine();
        String Array[] = generaVector(numElements, in);
        cercaBinaria(Array, numElements, in);
    }

    public static String[] generaVector(int numElements, Scanner in) {
        String paises = "";
        String[] Array = new String[numElements];
        for (int i = 0; i < Array.length; i++) {
            paises = in.nextLine();
            Array[i] = paises;

        }
        return Array;
    }

    public static void mostraVector(String[] Array) {
        System.out.print("Països ordenats:");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("");
    }

    static void cercaBinaria(String[] array, int tamanyoArry, Scanner in) {
        Arrays.sort(array);
        int i = 0;
        int low = 0;
        int mid = 0;
        int hight = array.length - 1;
        boolean numeroencontrado = false;

        String x = in.nextLine();

        while ((low <= hight)&&(numeroencontrado == false)) {

            mid = (low + hight) / 2;

            if (array[mid].equals(x)) {
                numeroencontrado = true;

            } else if (array[mid].compareTo(x) > 0) {
                hight = mid - 1;

            } else {
                low = mid + 1;

            }
            i++;
        }
        System.out.println("Total passades: " + i);
        if (numeroencontrado) {
            System.out.println("Trobat a la posició: " + mid);
        } else {
            System.out.println("No trobat");
        }
    }
}
