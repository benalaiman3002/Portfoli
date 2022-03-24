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
public class EjercicioSiendoPillo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroF, calculoF = 1,guardaV;
        System.out.println("Introduce un valor: ");
        numeroF = in.nextInt();
        for (int i = 1; i <= numeroF; i++) {
            calculoF = calculoF * i;
            
        }
        System.out.println("El numero factorial de " + numeroF + " es " + calculoF);
        System.out.println("La ultima cifra es " + calculoF % 10);
    }
}
