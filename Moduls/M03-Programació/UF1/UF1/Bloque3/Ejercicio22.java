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
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el correo electronico: ");
        String cadena = in.nextLine();
        boolean arroba = false;
        int i = 0;
        int longitud = cadena.length();
        while ((i < longitud) && (arroba == false)) {
            if (cadena.charAt(i) == '@') {
                arroba = true;
            }
            i++;
        }
        if (arroba == true) {
            System.out.println("Hay arroba");
        } else {
            System.out.println("No hay arroba, inaceptable.");
        }
    }
}
