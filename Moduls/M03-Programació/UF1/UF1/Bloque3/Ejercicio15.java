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
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nom;
        String nom2;
        System.out.println("Introduce tu nombre");
        nom = in.nextLine();
        System.out.println("Hola " + nom);
        System.out.println("La longitud del nombre es de " + nom.length());
        System.out.println("La letra en la posicion 3 es " + nom.charAt(3));
        System.out.println("Introduce otro  nombre");
        nom2 = in.nextLine();
        if (nom.equals(nom2)) {
            System.out.println("Son iguals");
        } else {
            System.out.println("Son diferents");
        }
        System.out.println(nom.toUpperCase());
        System.out.println(nom.toLowerCase());
    }
}
