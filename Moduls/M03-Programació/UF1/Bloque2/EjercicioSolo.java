/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque2;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class EjercicioSolo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float distancia, velocidad, segundos, tiempo = 0, velocidadM, resultado, velocidadMax = 0;

        System.out.println("Distancia máxima: ");
        distancia = in.nextFloat();

        System.out.println("Velocidad máxima: ");
        velocidad = in.nextFloat();

        System.out.println("Segundos que ha tardado: ");
        segundos = in.nextFloat();
        
        tiempo = tiempo / 3600;
        distancia = distancia / 1000;
        velocidadM = distancia / tiempo;
        resultado = velocidad / 100 * 120;
        
        if ((distancia <= 0) || (velocidadM <= 0) || (tiempo <= 0)) {
            if (velocidadM > velocidadMax * resultado) {
                System.out.println("Puntos");
            }else if (velocidadM > velocidad){
                System.out.println("MULTA");
            } else {
                System.out.println("OK");
            }
        }
    }
}
