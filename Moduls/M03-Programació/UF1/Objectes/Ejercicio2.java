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
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
        classLibreria[] libros = new classLibreria[2];

        for (int i = 0; i < libros.length; i++) {
            System.out.println("ISBN: ");
            String isbn = in.nextLine();
            System.out.println("Titulo del libro: ");
            String title = in.nextLine();
            System.out.println("Autor  del libro: ");
            String autor = in.nextLine();
            System.out.println("Editorial: ");
            String editorial = in.nextLine();
            System.out.println("Numero de libros en tienda: ");
            int num = inNum.nextInt();
            System.out.println("Precio del libro: ");
            double precio = inNum.nextDouble();

            libros[i] = new classLibreria(isbn, title, autor, editorial, num, precio);
        }
        imprimeix(libros);
        System.out.println("La suma del inventario es la siguiente: " + inventari(libros));
        autor(libros);
    }

    public static void imprimeix(classLibreria[] libreria) {
        for (int i = 0; i < libreria.length; i++) {
            libreria[i].imprimeix();
        }
    }

    public static double inventari(classLibreria[] libreria) {
        double suma = 0;
        for (int i = 0; i < libreria.length; i++) {
            suma = suma + (libreria[i].getPrecio() * libreria[i].getNumberBooks());
        }
        return suma;
    }

    public static void autor(classLibreria[] libreria) {
        Scanner in = new Scanner(System.in);
        String autor = in.nextLine();
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i].getAutor().equals(autor)) {
                libreria[i].imprimeix();
            }
        }
    }
}
