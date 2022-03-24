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
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float horasT = 0, turnos, salario = 30, total = 0, porcentaje = 0, rep;
        boolean repetir = true;
        while (repetir = true) {
            System.out.println("Cuantas horas ha trabajado? ");
            total = in.nextFloat();
            total *= 30;
            System.out.println("En que turno trabaja: 1. Mañana/2. Tarde/3. Noche");
            turnos = in.nextFloat();
            if (turnos == 1) {
                System.out.println("Estas en el turno de Mañana");
                total = (total * 7);
                System.out.println(total);
            } else if (turnos == 2) {
                System.out.println("Estas en el turno de Tarde");
                total = (float) ((total * 7) * 1.2);
            } else if (turnos == 3) {
                System.out.println("Estas en el turno de Noche");
                total = (float) ((total * 7) * 1.5);
            }
            if (total < 700) {
                porcentaje = (total / 100) * 8;
                total -= porcentaje;
                System.out.println("La tasa es de " + total);
            } else if ((total >= 700) && (total <= 1100)) {
                porcentaje = (total / 100) * 10;
                System.out.println("La tasa es de " + total);
            } else if (total > 1100) {
                porcentaje = (total / 100) * 12;
                System.out.println("La tasa es de " + total);
            }
            System.out.println("Quieres añadir otro trabajador? 1. Si/ 2. No");
            rep = in.nextInt();
            if (rep == 1) {
                repetir = true;
            } else if (rep == 2) {
                repetir = false;
                break;
            }
        }
    }
}
