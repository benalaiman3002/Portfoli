/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque5;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio_examen2 {
//La introduccio de dades amb random i considerarem que tots els mesos tenen 31 dies.

    //Indica cual es la temperatura mitjana de tots els animals al final del mes.
    //Indica quin animal ha tingut la temperatura mitjana més alta.
    //Indica quin animal ha tingut la temperatura més alta i quin dia.
    //Indica la temperatura dels altres animals el dia que et surt a l'apartat anterior.
    public static final int animals = 5;
    public static final int meses = 31;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma = 0, maxTemp;
        int[][] ramaderia = new int[animals][meses];
        for (int i = 0; i < animals; i++) {
            suma = 0;
            for (int j = 0; j < meses; j++) {
                ramaderia[i][j] = ((int) (Math.random() * 50));
                suma += ramaderia[i][j];
                System.out.print(ramaderia[i][j] + " ");
            }
            System.out.println("");
            System.out.println("La mitjana de la temperatura es de " + suma * 100 / meses);
        }

    }
}
