/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloque4;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ina = new Scanner(System.in);
        boolean repetir = true;
        String nombres;
        int añosT, rep, contador = 0;
        while (repetir == true) {
            System.out.println("Introduce el nombre del trabajador:");
            nombres = ina.nextLine();
            System.out.println("Cuanto tiempo ha estado en la compañia");
            añosT = in.nextInt();
            if ((añosT >= 3) && (añosT < 10)) {
                System.out.println("Tienes el bonus de 300€");
            } else if ((añosT >= 10) && (añosT < 15)) {
                System.out.println("Tiene un bonus de 400€");
            } else if (añosT >= 15) {
                System.out.println("Tienes un bonus de 700€");
            }
            contador++;
            System.out.println("Quieres añadir otro trabajador? 1. Si/ 2. No");
            rep = in.nextInt();
            if (rep == 1) {
                repetir = true;
            } else if (rep == 2) {
                repetir = false;
                break;
            }
        }
        System.out.println("Se han hecho un total de " + contador + " bonus");

    }
}
