/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1.Bloque3;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class EjercicioAutoAvaluacion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena = " eva Evaristo Lucia Genoveva eva ";
        boolean eva = false;
        for (int i = 0; i < cadena.length(); i++) {
            if ((cadena.charAt(i) == 'e') && (cadena.charAt(i + 1) == 'v') && (cadena.charAt(i + 2) == 'a')) {
                if ((cadena.charAt(i - 1) == ' ') && (cadena.charAt(i + 3) == ' ')) {
                    eva = true;
                    if (i == 0) {
                        if ((cadena.charAt(i + 3) == ' ')) {
                            eva = true;
                        }
                    } else if ((i == cadena.length() - 3)) {
                        if ((cadena.charAt(i - 1) == ' ')) {
                            eva = true;
                        }
                    } else {
                        if ((cadena.charAt(i - 1) == ' ') && (cadena.charAt(i + 3) == ' ')) {
                            eva = true;
                        }
                    }
                }
                if (eva == true) {
                    cadena = cadena.substring(0, i) + "E" + cadena.substring(i + 1);
                    eva = false;
                }

            }
        }
        System.out.println(cadena);
    }
}

//La otra opcion
// System.out.println("Introduce la frase: ");
// String nombre = in.nextLine();
// String letra = nombre.substring(0, 1);
// String longitud = nombre.substring(1, nombre.length());
// letra = letra.toUpperCase();
// String concatena = letra + longitud;
//if(nombre == 'eva') {
//System.out.Println("Corrigo " + concatena )
//}else{
//System.outPrintln("No se puede corregir")
