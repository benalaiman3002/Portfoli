/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF3;

import java.io.File;
import java.io.IOException;
import java.util.*;
import proyectopol.Ejercicio1;

/**
 *
 * @author benal
 */
public class Ej9 {

    public static void main(String[] args) throws IOException {
        File ruta = new File("C:\\Users\\benal\\Downloads\\prueba");
        File fichero = new File("C:\\Users\\benal\\Downloads\\prueba\\hola.txt");
        if (ruta.exists()) {
            ruta.delete();
        } else if (!ruta.exists())
            ruta.mkdir();
            fichero.createNewFile();
        if(!ruta.exists()) {
           
        }
    }
}
