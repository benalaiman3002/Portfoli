/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author benal
 */
public class Ej3_practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numElements = in.nextInt();
        String[] paisos = new String[numElements];
        for (int i = 0; i < numElements; i++) {
            paisos[i] = in.nextLine();

        }
        generaPais(paisos, in);
    }

    public static void generaPais(String[] paisos, Scanner in) {
        ArrayList<String> lista = new ArrayList<String>();
        for (int i = 0; i < paisos.length; i++) {
            lista.add(paisos[i]);

        }
        Collections.sort(lista);
        Iterator itr = lista.iterator();
        System.out.println("Països ordenats:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
