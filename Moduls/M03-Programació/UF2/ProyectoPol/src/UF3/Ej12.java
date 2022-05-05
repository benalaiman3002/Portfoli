/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF3;

import java.io.File;
import java.io.IOException;
import static java.lang.System.in;
import java.util.*;
import proyectopol.Ejercicio1;

/**
 *
 * @author benal
 */
public class Ej12 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        File ruta = new File("C:\\Users\\benal\\Downloads\\prueba");
        File ficha = new File("C:\\Users\\benal\\Downloads\\prueba\\hola.txt");
        File[] lista = ruta.listFiles();
        boolean salir = false;
        while (salir = false) {
            System.out.println("Que fichero quieres buscar:");
            String busqueda = in.nextLine();
            System.out.println("Que directorio quieres buscar:");
            if (Existe(ruta)) {
                if (Directorio(lista, busqueda, ruta)) {
                    if (nombreFichero(lista, busqueda, ficha)) {
                        salir = true;
                    } else {
                        salir = false;
                    }
                } else {
                    salir = false;
                }
            } else {
                salir = false;
            }
        }

    }

    public static boolean nombreFichero(File[] lista, String busqueda, File ficha) {
        for (int i = 0; i < lista.length; i++) {
            String fichero = lista[i].getName();
            if (busqueda.equals(fichero)) {
                System.out.println("El fichero que buscas se encuentra");
            } else {
                System.out.println("El fichero que buscas no se encuentra, prueba con otro nombre...");
            }
        }
        return false;

    }

    public static boolean Directorio(File[] lista, String busqueda, File ruta) {
        for (int i = 0; i < lista.length; i++) {
            String carpeta = lista[i].getParent();
            if (busqueda.equals(carpeta)) {
                System.out.println("El directorio que buscas si existe");
            } else {
                System.out.println("El directorio que buscas no existe, prueba con otro nombre...");
            }
        }
        return false;
    }

    public static boolean Existe(File ruta) {
        if (ruta.exists()) {
            System.out.println("Existe");
        }
        return false;
    }
}
