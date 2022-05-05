/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import static proyectopol.Ej4_practica1.busquedaBinaria;
import static proyectopol.Ej4_practica1.ordenaBombolla;

/**
 *
 * @author benal
 */
public class NomICognoms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomsComplets = {"Torres Hernández, Pere",
            "Majoral Gatell, Anna",
            "Pérez Gomis, Josep",
            "López López, Rosa",
            "Camps García, Ricard",
            "Sánchez Pasqual, Carles",
            "Mengual Sánchez, Gemma",
            "Puig Soler, Jordi"};
        String nom = in.nextLine();
        ordenaBombolla(nomsComplets);
        cercaBinaria(nomsComplets,nom,in);
    }

    public static void ordenaBombolla(String[] nomsComplets) {
        String aux;
        for (int i = 0; i < nomsComplets.length - 1; i++) {
            for (int j = 0; j < nomsComplets.length - i - 1; j++) {
                if (nomsComplets[j + 1].compareTo(nomsComplets[j]) < 0) {
                    aux = nomsComplets[j + 1];
                    nomsComplets[j + 1] = nomsComplets[j];
                    nomsComplets[j] = aux;
                }
            }
        }
        mostraNoms(nomsComplets);
    }

    public static void mostraNoms(String[] nomsComplets) {
        ArrayList<String> lista = new ArrayList<String>();
        for (int i = 0; i < nomsComplets.length; i++) {
            lista.add(nomsComplets[i]);

        }
        Collections.sort(lista);
        Iterator itr = lista.iterator();
        System.out.println("Llista dels noms: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static int cercaBinaria(String[] nomsComplets, String nom,Scanner in) {
        int low = 0, hight = nomsComplets.length - 1, cont = 0, mid = 0;
        boolean salir = false;
        nom = in.nextLine();
        while ((salir == false) && (low <= hight)) {

            mid = (low + hight) / 2;

            if (nomsComplets[mid].equals(nom)) {
                salir = true;

            } else if (nomsComplets[mid].compareTo(nom) > 0) {
                hight = mid - 1;

            } else {
                low = mid + 1;
            }
            cont++;
        }

        if (salir == true) {
            System.out.println("El nom " + nom  + " s'ha trobat a la posicio" +  mid);
        } else {
            System.out.println("El nom" + nom + "no s'ha trobat a la llista");
        }
        return mid;
    }

}
