/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopol;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author benal
 */
public class Ejercicio4 {

    public static final int fila = 5;
    public static final int columna = 5;

    public static void main(String[] args) {
        int[][] arrayMulti = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                arrayMulti[fila][columna] = (int) Math.random() * 50;
            }
        }
        Scanner in = new Scanner(System.in);
        //calculo(in);
        figures2d(in);
        figures3d(in);
        menu(in,arrayMulti);
        mostraMatriu(arrayMulti);
    }

    public static void calculo(Scanner in) {
        int valor1;
        System.out.println("Introduce un valor: ");
        valor1 = in.nextInt();
        System.out.println("Introduce el segundo valor:");
        int valor2 = in.nextInt();
        int resultado = (int) (Math.random() * (valor2 - valor1)) + valor1;
        System.out.println("el numero aleatorio es " + resultado);

    }

    public static void calculadora(Scanner in) {
        System.out.println("Que operacion quieres realizar? 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division");
        int opcion = in.nextInt();
        System.out.println("Introduce un numero: ");
        int num1 = in.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = in.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int division = num1 / num2;
        if (opcion == 1) {
            System.out.println("La suma es de " + num1 + " + " + num2 + " = " + suma);
        } else if (opcion == 2) {
            System.out.println("La resta es de " + num1 + " - " + num2 + " = " + resta);
        } else if (opcion == 3) {
            System.out.println("La multipliacion es de " + num1 + " * " + num2 + " = " + multi);
        } else if (opcion == 4) {
            System.out.println("La divison es de " + num1 + " / " + num2 + " = " + division);
        }
    }

    public static void figures2d(Scanner in) {
        System.out.println("Introduce el nombre de la figura: ");
        String figura = in.nextLine();
        if (figura.equals("quadrat") || figura.equals("Quadrat")) {
            quadrado(in);
        } else if (figura.equals("rectangle") || figura.equals("Rectangle")) {
            rectangle(in);
        } else if (figura.equals("triangle") || figura.equals("Triangle")) {
            triangleiso(in);
        } else if (figura.equals("cercle") || figura.equals("Cercle")) {
            circulo(in);
        }
    }

    public static void quadrado(Scanner in) {
        System.out.println("Introduce cuanto mide sus 4 rectas: ");
        int lados = in.nextInt();
        int quadrado = lados * 4;
        int quadrado2 = lados * lados;
        System.out.println("El perimetro del quadrado es " + quadrado);
        System.out.println("La superficie del quadrado es " + quadrado2);

    }

    public static void rectangle(Scanner in) {
        System.out.println("Introduce cuanto mide el lado mas largo: ");
        int ladoLarge = in.nextInt();
        System.out.println("Introduce cuanto mide los lados cortos: ");
        int ladoCort = in.nextInt();
        int rectPerimetro = ladoLarge * 2 + ladoCort * 2;
        int areaRect = ladoLarge * ladoCort;
        System.out.println("El perimetro del rectangulo es de " + rectPerimetro);
        System.out.println("El area del rectangulo es de " + areaRect);
    }

    public static void triangleiso(Scanner in) {
        System.out.println("Introduce la medida de la altura: ");
        int trianguloLado = in.nextInt();
        System.out.println("Introduce la medida de la base: ");
        int trianguloBase = in.nextInt();
        int peritriangulo = trianguloLado + trianguloLado + trianguloBase;
        int areatriangulo = trianguloLado * trianguloBase / 2;
        System.out.println("El perimtetro del triangulo es de " + peritriangulo);
        System.out.println("El area del triangulo es de " + areatriangulo);
    }

    public static void circulo(Scanner in) {
        System.out.println("Introduce el radio del circulo: ");
        int radio = in.nextInt();
        double periCirculo = 2 * Math.PI * radio;
        System.out.println("El perimetro del circulo es de " + periCirculo);
        double areaCirculo = Math.PI * radio * radio;
        System.out.println("El area del circulo es de " + areaCirculo);
    }

    public static void figures3d(Scanner in) {
        System.out.println("Introduce el nombre de la figura: ");
        String figura = in.nextLine();
        if (figura.equals("cilindre") || figura.equals("Cilindre")) {
            cilindre(in);
        } else if (figura.equals("hexaedre") || figura.equals("Hexaedre")) {
            hexa(in);
        } else if (figura.equals("tetraedre") || figura.equals("Tetraedre")) {
            tetra(in);
        }
    }

    public static void tetra(Scanner in) {
        int altura;
        double areatetra, volumentetra;
        System.out.println("Introduce la altura del tetraedre: ");
        altura = in.nextInt();
        areatetra = Math.sqrt(altura * altura * 3);
        System.out.println("El area del  tetraedre es de " + areatetra);
        volumentetra = Math.sqrt(2 * Math.pow(altura, 3) / 12);
        System.out.println("El volumen del tetraedre es de " + volumentetra);
    }

    public static void hexa(Scanner in) {
        System.out.println("Introduce el cateto del hexaedra");
        int cateto = in.nextInt();
        double hexarea = Math.pow(cateto, 2);
        System.out.println("El area del hexaedre es de " + hexarea);
        double hexavolumen = Math.pow(hexarea, 3);
        System.out.println("El volumen del hexaedre es de " + hexavolumen);
    }

    public static void cilindre(Scanner in) {
        System.out.println("Introduce la altura del cilindro: ");
        int altura = in.nextInt();
        System.out.println("Introduce la altura del cilindro: ");
        int radio = in.nextInt();
        double superficiecilindro = Math.PI * 2 * radio * (altura + radio);
        System.out.println("El area del cilindro es de " + superficiecilindro);
        double volumencilindro = radio * Math.PI * Math.PI * altura;
        System.out.println("El volumen del cilindro es de " + volumencilindro);
    }

    public static void menu(Scanner in, int[][] arrayMulti) {
        boolean menu = false;
        int escribe;
        do {
            System.out.println("Navega por nuestro menú:");
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Ejercicio 3");
            System.out.println("4.Ejercicio 4");
            System.out.println("5.Ejercicio 5");
            System.out.println("6.Ejercicio 6");
            System.out.println("7.Salir");
            escribe = in.nextInt();
            switch (escribe) {
                case 1:
                    System.out.println("Enunciado 1");
                    System.out.println("\"Que demani dos nombres enters i a continuació l’operació a realitzar \n(suma, resta, multiplicació o divisió) i la realitzi i mostri el resultat\"");

                    break;
                case 2:
                    System.out.println("Enunciado 2");
                    System.out.println("\"Que demani el tipus de figura 2D (quadrat, rectangle, triangle isòsceles o cercle) i a \ncontinuació demani les dades necessàries per a cadascun i en mostri el perímetre i la superfície\"");
                    figures2d(in);
                    break;
                case 3:
                    System.out.println("Enunciado 3");
                    System.out.println("\"Que demani el tipus de figura 3D (cilindre, hexaedre, tetraedre o esfera) i a continuació \n demani les dades necessàries per a cadascun i en mostri la superfície i el volum\".");
                    break;
                case 4:
                    System.out.println("Enunciado 4");
                    break;
                case 5:
                    System.out.println("Enunciado 5");
                    System.out.println("Cuantas filas quieres:");
                    int files = in.nextInt();
                    System.out.println("Cuantas columnas quieres:");
                    int columnes = in.nextInt();
                    arrayMulti = demanaMatriu(files, columnes, in);
                    mostraMatriu(arrayMulti);
                    break;
                case 6:
                    System.out.println("Enunciado 6");
                    System.out.println("Cuantas filas quieres:");
                    int files2 = in.nextInt();
                    System.out.println("Cuantas columnas quieres:");
                    int columnes2 = in.nextInt();
                    System.out.println("Introduce el valor min:");
                    int min = in.nextInt();
                    System.out.println("Introduce el valor max:");
                    int max = in.nextInt();
                    generaMatriu(files2, columnes2, min, max);
                    break;
                case 7:
                    System.out.println("7. Saliendo...");
                    menu = true;
                    break;
                default:
                    System.out.println("No existe esta opcion");
            }

        } while (menu == false);
    }

    public static void mostraMatriu(int[][] matriu) {
        int[][] arrayMulti = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                arrayMulti[fila][columna] = ((int) Math.random() * 50);
            }
        }
        System.out.println(" ");
    }

    public static int[][] demanaMatriu(int files, int columnes, Scanner in) {
        int[][] demana = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                demana[i][j] = in.nextInt();
            }
        }
        return null;
    }

    public static int[][] generaMatriu(int files, int columnes, int min, int max) {
        int[][] arrayMulti = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                arrayMulti[fila][columna] = ((int) Math.random());
            }
            System.out.println("El valor maximo es " + max);
            System.out.println("El valor minimo es  " + min);
        }
        System.out.println(" ");
        return null;
    }

}
