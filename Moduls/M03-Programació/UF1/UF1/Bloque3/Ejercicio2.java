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
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int horasP = 0,trabajador = 0,HorasExtra = 0,cantidadF;
        int opciones = 1;
        
        while (opciones == 1) {     
        System.out.println("Cantidad de trabajadores que hay");
        trabajador = in.nextInt();
        System.out.println("Horas que trabaja");
        horasP = in.nextInt();
            int horas = 0;
        
        HorasExtra = horas - 40;
        if(horas > 40) {
                cantidadF = (int) ((int) (40 * horasP) + (HorasExtra * horasP * 1.5));
            }else {
            cantidadF = horas * horasP;
        }
            System.out.println("Sueldo es " + cantidadF);
            System.out.println("Hay mas trabajadores? ( 1-Si, 2-No)" );
            if (opciones != 1) {
            boolean seguim = false;
            }
        }
        

    }
}
