/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF3;

import java.io.File;
import java.util.*;

/**
 *
 * @author benal
 */
public class Ej8 {

    public static void main(String[] args) {
        File ruta = new File("C:\\Users\\benal\\Downloads\\prueba\\hola.txt");
        if (ruta.exists()) {
            System.out.println(ruta.getAbsolutePath());
            System.out.println(ruta.lastModified());
            System.out.println(ruta.length());
        }
    }
}
