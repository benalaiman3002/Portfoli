/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloque4;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio1_Examen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ina = new Scanner(System.in);
        Scanner inb = new Scanner(System.in);
        Scanner inc = new Scanner(System.in);
        int homes = 0, dones = 0, abuelo = 0, jovenes = 0, adulto = 0, mayor = 0, mitjanaM = 0, mitjanaD = 0, sumaD = 0, homeM = 0, contadorT = 0;
        boolean salir = false;
        while (salir == false) {
            System.out.println("Introduce el nombre: ");
            String nom = ina.nextLine();
            if (nom.equals("final")) {
                salir = true;
                break;
            }
            System.out.println("Cual es su género? Home/Dona ");
            String sexe = inb.nextLine();
            System.out.println("Introduce su edad:");
            int edat = inc.nextInt();
            //Controlar el torn
            System.out.println(nom + edat);
            //que vaya pidiendo nombres mientras el campo nom no sea igual a final
            //sexo de las personas
            if (sexe.equals("Home")) {
                homes++;
                homeM += edat;
                mitjanaM = homeM / homes;
            } else if (sexe.equals("Dona")) {
                dones++;
                sumaD += edat;
                mitjanaD = sumaD / dones;
            }
            //edad de las personas
            if ((edat >= 20) && (edat <= 40)) {
                jovenes++;
            } else if ((edat >= 41) && (edat <= 60)) {
                adulto++;
                mayor++;
            } else if ((edat >= 81)) {
                abuelo++;
            }
            contadorT++;
        }
        System.out.println((homes / contadorT)*100 + "% de homes");
        System.out.println((dones / contadorT)*100 + "% de dones");
        System.out.println("Hay un total de " + jovenes + " entre 20 y 40 años, " + adulto + " entre 41 y 60 años, " + mayor + " entre 61 y 80  y " + abuelo + " de mas de 80 años");
        System.out.println("Mitjana del homes es de " + mitjanaM + " y la mitjana de les dones es de " + mitjanaD);
    }
}
