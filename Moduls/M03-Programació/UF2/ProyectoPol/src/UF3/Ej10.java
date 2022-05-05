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
public class Ej10 {

    public static void main(String[] args) {
        File ruta = new File("C:\\Users\\benal\\Downloads\\prueba\\hola.txt");
        File ruta2 = new File("C:\\Users\\benal\\Downloads\\prueba\\hola2.txt");
        if (ruta2.exists()) {
            if (ruta2.renameTo(ruta)) {
                System.out.println("lo ha cambiado");
            } else {
                System.out.println("No ha cambiado");
            }

        } else {
            System.out.println("No existe");
        }
        if (ruta2.exists()) {
            ruta2.renameTo(ruta);
        }
    }
}
