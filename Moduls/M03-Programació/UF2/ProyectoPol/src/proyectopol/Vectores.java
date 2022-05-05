/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

/**
 *
 * @author benal
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ELEMENTS = 10;
        // A[]
        int[] a = new int[ELEMENTS];
        for (int i = 0; i < ELEMENTS; i++) {
            a[i] = (int) (Math.random() * 10);
        }

        // B[]
        int[] b = new int[ELEMENTS];
        for (int i = 0; i < ELEMENTS; i++) {
            b[i] = (int) ((Math.random() * 899) + 100);  // completar
        }

        // C[]
        int[] c = new int[2 * ELEMENTS];
        for (int i = 0; i < 2 * ELEMENTS; i++) {
            if (i % 2 == 0) {
                c[i] = a[i / 2];
            } else {
                c[i] = b[i / 2];
            }
        }

        // Mostrar resultats A[], B[] i C[]
        System.out.print("A[] = ");
        for (int i = 0; i < ELEMENTS; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("B[] = ");
        for (int i = 0; i < ELEMENTS; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.print("C[] = ");
        for (int i = 0; i < 2 * ELEMENTS; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
