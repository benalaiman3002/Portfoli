/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author benal
 */
public class BusquedaBinaria {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros a introducir");
        int nums = in.nextInt();
        int[] numeros = new int[nums];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
            System.out.print(numeros[i] + " ");
        }
        ordenaSeleccio(numeros);
        System.out.println("Que numero quieres buscar:");
        int numeroBuscar = in.nextInt();
        if (busqueda(numeros, numeroBuscar) == 0) {
            System.out.println("No existe");
        } else {
            System.out.println("Existe");
        }
        busqueda(numeros, numeroBuscar);
    }

    public static int busqueda(int[] numeros, int numeroBuscar) {
        //buscar a la mitad de la longitud 
        int longitud = numeros.length - 1;
        int longitudMedio = longitud / 2;
        int longitudLeft = 0;
        while (longitudLeft <= longitud) {
            longitudMedio = longitudLeft + (longitud - longitudLeft) / 2;
            if (numeros[longitudMedio] == numeroBuscar) {
                return longitudMedio;
            }
            if (numeros[longitudMedio] > numeroBuscar) {
                longitud = longitudMedio - 1;
            } else if (numeros[longitudMedio] < numeroBuscar) {
                longitudLeft = longitudMedio + 1;
            }
        }

        return 0;
    }

    public static void ordenaSeleccio(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minimo]) {
                    minimo = j;
                }
            }
            int swap = numeros[i];
            numeros[i] = numeros[minimo];
            numeros[minimo] = swap;

        }
    }

    public static void secuencial(int[] numeros, int numeroBuscar) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscar) {
                System.out.println("Se encuentra en" + numeros[i]);
            }
            break;
        }
    }
}
