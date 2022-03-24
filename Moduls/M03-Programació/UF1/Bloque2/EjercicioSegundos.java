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
public class EjercicioSegundos {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int segundos, año = 0, min = 0, hora = 0, dia = 0, segonsS, minsS, horasS, diasS;
        System.out.println("Añade unos segundos:");
        segundos = in.nextInt();

        min = segundos / 60;
        segonsS = segundos % 60;

        hora = min / 60;
        minsS = min % 60;

        dia = hora / 24;
        horasS = hora % 24;

        año = dia / 365;
        diasS = dia % 365;

        System.out.println("Son " + segonsS + " segundos y " + minsS + " minutos. En cuanto a horas y dias son " + horasS + " horas i " + diasS + " dias, finalmente los años son " + año + " años");
    }
}
