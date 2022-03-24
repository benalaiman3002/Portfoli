/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque2;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class EjercicioEdad {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int añoactual, año;
        System.out.println("Añade año actual:");
        añoactual = in.nextInt();

        int mesactual;
        System.out.println("Añade mes actual:");
        mesactual = in.nextInt();

        int diaactual;
        System.out.println("Añade tu dia actual:");
        diaactual = in.nextInt();

        int añonacimiento;
        System.out.println("Año de mi nacimiento");
        añonacimiento = in.nextInt();

        int mesnacimiento;
        System.out.println("Mes de mi nacimiento");
        mesnacimiento = in.nextInt();

        int dianacimiento;
        System.out.println("Dia de mi nacimiento");
        dianacimiento = in.nextInt();

        año = añoactual - añonacimiento;

        if (mesactual < mesnacimiento) {
            año = año - 1;
        } else if ((mesactual == mesnacimiento) && (diaactual < dianacimiento)) {
            año = año - 1;
        } else if ((mesactual == mesnacimiento) && (diaactual == dianacimiento)) {
            System.out.println("Felicidades ");
        }
        System.out.println("Tienes " + año);

    }
}
