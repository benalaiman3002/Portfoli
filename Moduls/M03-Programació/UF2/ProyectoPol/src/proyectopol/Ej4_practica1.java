/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.*;

public class Ej4_practica1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numElements = in.nextInt();
        in.nextLine();
        //

        String[] paisos = generaPais(numElements, in);
        String buscar = in.nextLine();

        ordenaBombolla(paisos, numElements);
        busquedaBinaria(paisos, buscar, in, numElements);

    }

    public static String[] generaPais(int numElements, Scanner in) {
        String pais = "";
        String[] paisos = new String[numElements];

        for (int i = 0; i < numElements; i++) {
            pais = in.nextLine();
            paisos[i] = pais;
        }
        return paisos;
    }

    public static void mostraOrdenacion(String[] paisos, int numElements) {
        for (int i = 0; i < numElements; i++) {
            System.out.println(paisos[i]);
        }
        System.out.println("");
    }

//    public static void busquedaBinaria(String[] paisos, String buscar, Scanner in) {
//        int esquerra = 0, dreta = paisos.length - 1, cont = 0, IelementoM = 0;
//        boolean salir = false;
//        buscar = in.nextLine();
//        while ((salir == false) && (esquerra <= dreta)) {
//            IelementoM = (esquerra + dreta) / 2;
//            if (paisos[IelementoM].equals(buscar)) {
//                salir = true;
//            } else if (paisos[IelementoM].compareTo(buscar) > 0) {
//                dreta = IelementoM - 1;
//            } else {
//                esquerra = IelementoM + 1;
//            }
//            cont++;
//        }
//        System.out.println("Total passades: " + cont);
//        if (salir == true) {
//            System.out.println("Trobat a la posició: " + IelementoM);
//        } else {
//            System.out.println("No trobat");
//        }
//
//    }
    public static void busquedaBinaria(String[] Array, String buscar, Scanner in, int numElements) {
        int low = 0, hight = Array.length - 1, cont = 0, mid = 0;
        boolean salir = false;
        buscar = in.nextLine();
        while ((salir == false) && (low <= hight)) {
            
            mid = (low + hight) / 2;
                    
            if (Array[mid].equals(buscar)) {
                salir = true;
                
            } else if (Array[mid].compareTo(buscar) > 0) {
                hight = mid - 1;
                
            } else {
                low = mid + 1;
            }
            cont++;
        }
        System.out.println("Total passades: " + cont);
        
        if (salir == true) {
            System.out.println("Trobat a la posició: " + mid);    
        } else {
            System.out.println("No trobat");
        }

    }

    public static void ordenaBombolla(String[] paisos, int numElements) {
        String aux;
        for (int j = 0; j < numElements; j++) {
            for (int i = j + 1; i < numElements; i++) {
                if (paisos[j].compareTo(paisos[i]) > 0) {
                    aux = paisos[j];
                    paisos[j] = paisos[i];
                    paisos[i] = aux;
                }
            }
        }

    }

}
