/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Practica_ej1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        boolean salir = true;
        while (salir) {
            if (in.hasNextInt()) {
                a = in.nextInt();
                b = in.nextInt();
                in.nextLine();
                String opcion = in.nextLine();
                opciones(a, b, opcion, in);
            } else if (in.nextLine().equals("S")) {
                salir = false;
            }
        }
    }

    public static void opciones(int a, int b, String opcion, Scanner in) {
        switch (opcion) {
            case "+":
                sumar(a, b, in);
                break;
            case "-":
                restar(a, b, in);
                break;
            case "x":
                multiplicar(a, b, in);
                break;
            case "/":
                dividir(a, b, in);
        }
    }

    public static void sumar(int a, int b, Scanner in) {
        int resultado = 0;
        resultado = a + b;
        System.out.println(a + " + " + b + " = " + resultado);
    }

    public static void restar(int a, int b, Scanner in) {
        int resultado = 0;
        resultado = a - b;
        System.out.println(a + " - " + b + " = " + resultado);
    }

    public static void multiplicar(int a, int b, Scanner in) {
        int resultado = 0;
        resultado = a * b;
        System.out.println(a + " x " + b + " = " + resultado);
    }

    public static void dividir(int a, int b, Scanner in) {
        int resultado = 0;
        if (a == 0 || b == 0) {
            System.out.println("No es pot dividir per 0.");
        } else {
            resultado = a / b;
            System.out.println(a + " / " + b + " = " + resultado);

        }

    }

}
