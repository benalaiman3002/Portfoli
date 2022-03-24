/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1.Bloque3;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota, excelente = 0, be = 0, notable = 0, aprovat = 0, suspes = 0, alumnoAVA = 0, suficient = 0;
        while (alumnoAVA < 10) {
            System.out.println("Introduce la nota: ");
            nota = in.nextInt();
            if (nota < 5) {
                System.out.println("Suspendido");
                suspes++;

            } else if ((nota >= 5) && (nota <= 10)) {
                System.out.println("Aprobado");
                aprovat++;
            }
            if ((nota == 5) && (nota >= 5.99)) {
                System.out.println("Suficiente");
                suficient++;

            } else if ((nota == 6) && (nota >= 6.99)) {
                System.out.println("Bien");
                be++;

            } else if ((nota <= 7) && (nota >= 8.99)) {
                System.out.println("Notable");
                notable++;
            } else if ((nota == 10) && (nota == 9)){
                System.out.println("Excelente");
                excelente++;
            }
            System.out.println("Hay " + aprovat + " alumnos aprovados y " + suspes + " alumnos suspendidos");
            System.out.println("\nDe cada aprovado hay " + suficient + " Suficientes, " + be + " Bien, " + notable + " Notables y finalmente " + excelente + " Excelentes.");
        }
    }
}
