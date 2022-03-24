/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Bloc5Proves {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
//creo el array
        classCotxe[] concessionari = new classCotxe[3];
//recorro el array y recogo los datos
        for (int i = 0; i < concessionari.length; i++) {
            System.out.println("Marca: ");
            String marca = in.nextLine();
            System.out.println("Model: ");
            String model = in.nextLine();
            System.out.println("Potencia: ");
            int potencia = in.nextInt();
            System.out.println("Electric: ");
            boolean electric = inNum.nextBoolean();
            //coge los objetos y lo  guarda en la posicion en la que me encuentro   
            concessionari[i] = new classCotxe(marca, model, potencia, electric);
        }
        imprimeix(concessionari);
        System.out.println("La potencia mitjana es " + potenciaMitjana(concessionari));
        System.out.println("Hi ha " + Electric(concessionari) + " vehicles no electrics");
        incrementPotencia(10, concessionari);
    }
//imprimir 

    public static void imprimeix(classCotxe[] taller) {
        for (int i = 0; i < taller.length; i++) {
            taller[i].imprimeix();
        }
    }
//calcular la mediana de la potencia

    public static double potenciaMitjana(classCotxe[] taller) {
        int suma = 0;
        for (int i = 0; i < taller.length; i++) {
            suma += taller[i].getPotencia();
        }
        double mitjana = (float) suma / taller.length;
        System.out.println("La potencia mitjana es " + mitjana);
        return mitjana;
    }

    public static int Electric(classCotxe[] taller) {
        int sumar = 0;
        for (int i = 0; i < taller.length; i++) {
            if (taller[i].isElectric() == false) {
                sumar++;
            }
        }
        return sumar;
    }

    public static void incrementPotencia(int increment, classCotxe[] taller) {
        for (int i = 0; i < taller.length; i++) {
            taller[i].augmentaPotencia(increment);
        }
        }
    }

