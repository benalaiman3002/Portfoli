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
public class Ej11 {

    public static void main(String[] args) throws IOException {
        File ruta = new File("C:\\Users\\benal\\Downloads\\prueba");
        File[] lista = ruta.listFiles();
        
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].isFile()){
                System.out.println(lista[i] + " Es un fichero");
            } else if(lista[i].isDirectory()) {
                System.out.println(lista[i] + "Es un Directorio");
            }
        }
    }
}
