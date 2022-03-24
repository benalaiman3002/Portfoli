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
public class Ejercicio2_examen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Variables
        int identificacion = 0, calcular;
        String num = "";
        calcular = identificacion % 23;
        System.out.println("Introduce el DNI: ");
        identificacion = in.nextInt();
        //crear un switch case con la operacion calcular
        switch (calcular) {
            case 0:
                num = "T";
                break;
            case 1:
                num = "R";
                break;
            case 2:
                num = "W";
                break;
            case 3:
                num = "A";
                break;
            case 4:
                num = "G";
                break;
            case 5:
                num = "M";
                break;
            case 6:
                num = "Y";
                break;
            case 7:
                num = "F";
                break;
            case 8:
                num = "P";
                break;
            case 9:
                num = "D";
                break;
            case 10:
                num = "X";
                break;
            case 11:
                num = "B";
                break;
            case 12:
                num = "N";
                break;
            case 13:
                num = "J";
                break;
            case 14:
                num = "Z";
                break;
            case 15:
                num = "S";
                break;
            case 16:
                num = "Q";
                break;
            case 17:
                num = "V";
                break;
            case 18:
                num = "H";
                break;
            case 19:
                num = "L";
                break;
            case 20:
                num = "C";
                break;
            case 21:
                num = "K";
                break;
            case 22:
                num = "E";
                break;
        }
        //Mostrar el resultado por pantalla
        System.out.println("El dni es " + identificacion + num);
    }
}
