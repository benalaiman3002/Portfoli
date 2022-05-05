/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author benal
 */
public class EjercicioLigaFutbol {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            String linea;
            FileReader fr = new FileReader("C:\\Users\\benal\\Downloads\\resultats.txt");
            BufferedReader entrada = new BufferedReader(fr);
            while ((linea = entrada.readLine()) != null) {
                lista.add(linea);
                System.out.println(linea);
                System.out.println(linea.split("-")[0].split(":")[0]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(EjercicioLigaFutbol.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void partidos() {

    }
}
