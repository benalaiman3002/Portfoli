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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int salari,contrato,aumento, opcion1,opcion2,opcion3;
        System.out.println("Cual es el  salario del empleado?");
        salari = in.nextInt();
        
        opcion1 = salari / 100*20;
        opcion2 = salari / 100*10;
        opcion3 = salari /100*5;
        if(salari <= 9000) {
            System.out.println("El empleado recibe " + opcion1 + "€");
        }else if (salari <= 15000) {
            System.out.println("El empleado recibe " + opcion2 + "€");
        }else if (salari <= 20000) {
            System.out.println("El empleado recibe " + opcion3 + "€");
        }else {
            System.out.println("No tiene  augmento");
        }
        
      
    }
}
