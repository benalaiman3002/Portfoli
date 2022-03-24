/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        classCine[] cine = new classCine[5];

        for (int i = 0; i < cine.length; i++) {
            System.out.println("Director: ");
            String director = in.nextLine();
            System.out.println("Tipo: ");
            String tipo = in.nextLine();
            System.out.println("Titulo: ");
            String titulo = in.nextLine();

            cine[i] = new classCine(director, tipo, titulo);
        }
        imprimeix(cine);
    }
    public static void imprimeix(classCine[] sala) {
        for (int i = 0; i < sala.length;i++) {
            sala[i].imprimeix();
        }
    }
}
