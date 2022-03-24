/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author benal
 */
public class EjercicioPracticoString {

    public static void main(String[] args) {
//STRING
        String str = "a;i;m;a;n";
        String[] cadenaStr = new String[4];
        cadenaStr = str.split(";");
        for (int i = 0; i < cadenaStr.length; i++) {
            System.out.println("Camp: " + cadenaStr[i]);
        }
//Arrays
        int [] prueba = new int[] {1,2,3,4,5,6,7,8,9};
        int [] pruebaP = Arrays.copyOf(prueba,prueba.length);
        
        for(int i = 0; i < pruebaP.length; i++) {
            System.out.println("" + pruebaP[i]);
        }
        char[] cadenaArr = new char[] {'a','i','m','a','n'};
        
    }
}
