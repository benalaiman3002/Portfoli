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
public class Ej2_practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numElements = in.nextInt();
        double[] nums = generaPais(numElements, in);
        ordenaBombolla(nums);
    }

    public static double[] generaPais(int numElements, Scanner in) {
        double temperatura = 0;
        double[] nums = new double[numElements];
        for (int i = 0; i < nums.length; i++) {
            temperatura = in.nextDouble();
            nums[i] = temperatura;
        }
        return nums;
    }

    public static void mostraOrdenacion(double[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
    }

    public static void ordenaBombolla(double[] nums) {
        double aux;
        int contador = 0;
        for (int i = 0; i < nums.length; i++) {
            int menor = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[menor]) {
                    menor = j;
                }
                contador++;
            }
            aux = nums[i];
            nums[i] = nums[menor];
            nums[menor] = aux;
        }
        mostraOrdenacion(nums);
        System.out.println("Total passades: " + contador);

    }

}
