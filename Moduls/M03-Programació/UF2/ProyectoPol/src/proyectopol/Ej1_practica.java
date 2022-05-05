/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ej1_practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numElements = in.nextInt();
        String[] paisos = new String[numElements];
        paisos = generaPais(numElements, in);
        ordenaBombolla(paisos);
        mostraOrdenacion(paisos);
    }

    public static String[] generaPais(int numElements, Scanner in) {
        String pais = "";
        String[] paisos = new String[numElements];
        in.nextLine();
        for (int i = 0; i < paisos.length; i++) {
            pais = in.nextLine();
            paisos[i] = pais;
        }
        return paisos;
    }

    public static void mostraOrdenacion(String[] paisos) {
        System.out.println("Països ordenats:");
        for (int i = 0; i < paisos.length; i++) {
            System.out.println(paisos[i]);
        }
        System.out.println("");
    }

    public static void ordenaBombolla(String[] paisos) {
        String aux;
        for (int i = 0; i < paisos.length - 1; i++) {
            for (int j = 0; j < paisos.length - i - 1; j++) {
                if (paisos[j].compareTo(paisos[j + 1]) > 0) {
                    aux = paisos[j + 1];
                    paisos[j + 1] = paisos[j];
                    paisos[j] = aux;
                }
            }
        }

    }

}
