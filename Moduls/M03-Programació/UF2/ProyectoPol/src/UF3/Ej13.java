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
public class Ej13 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        File ruta = new File("C:\\Users\\benal\\Downloads\\prueba\\hola.txt");
        File ficha = new File("C:\\Users\\benal\\Downloads\\prueba\\hola.dat");
        
        if(ruta.exists()) {
            ruta.renameTo(ficha);
        }
    }
}
