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
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int numero = 1, contador = 1, cuentaprimos = 0;
        boolean esPrimer;

        while (contador < 30) {

            esPrimer = true;
            contador = 2;

            while ((contador <= numero / 2) && (esPrimer)) {
                if (numero % contador == 0) {
                    esPrimer = false;
                }
                contador++;
            }
            if (esPrimer) {
                System.out.println(numero);
                cuentaprimos++;
            }
            numero++;
            esPrimer = true;

        }
        System.out.println(contador);
    }
}
