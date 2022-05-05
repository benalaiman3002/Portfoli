// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoPol;

import java.util.Scanner;

public class colgado
{
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        String palabra = " ";
        String cadenaNueva = " ";
        final int intentos = 5;
        int fallos = 0;
        int vidas = 7;
        boolean fin = false;
        System.out.println("\n Empieza el juego ");
        System.out.println("Introduce la palabra a endivinar");
        palabra = in.nextLine();
        final int longitud = palabra.length();
        palabra = palabra.toLowerCase();
        System.out.println(palabra);
        System.out.println("esta palabra tiene " + longitud + " letras\n");
        for (int x = 0; x <= longitud - 1; ++x) {
            final String cadenaRemplaz = "-";
            cadenaNueva = palabra.replace(palabra, cadenaRemplaz);
            System.out.print(cadenaNueva);
        }
        fin = false;
        while (vidas <= 7) {
            final int longitudCadenaNueva = palabra.length();
            System.out.println(" \n de A a Z elige una letra ...");
            char letra = in.next().charAt(0);
            System.out.println(letra);
            boolean letraSi = false;
            for (int i = 0; i < longitud; ++i) {
                if (letra == palabra.charAt(i)) {
                    letraSi = true;
                }
            }
            if (letraSi) {
                for (int i = 0; i < longitudCadenaNueva; ++i) {
                    if (letra == palabra.charAt(i)) {
                        letra = palabra.charAt(i);
                        System.out.println(letra + " letra");
                        System.out.println(i + " i");
                        cadenaNueva = cadenaNueva.substring(0, i) + letra + cadenaNueva.substring(i + 1, longitudCadenaNueva);
                        System.out.print(cadenaNueva);
                    }
                }
                boolean letraNo = false;
                for (int i = 0; i < longitudCadenaNueva; ++i) {
                    if (letra != palabra.charAt(i)) {
                        letraNo = true;
                    }
                    System.out.println(cadenaNueva);
                }
            }
            else {
                --vidas;
                ++fallos;
                System.out.printf("\n No es correcto....tienes %d fallos, y te quedan %d vidas", fallos, vidas);
            }
        }
        if (vidas == 7) {
            System.out.println("Fin");
            System.out.println(" Vuelves a jugar? ");
        }
        else {
            System.out.println(" Enhorabuena has ganado...");
            System.out.println(" Vuelves a jugar? ");
        }
    }
    public static void dibujo() {
        System.out.println("");
    }
}
