/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author benal
 */
public class Ejercicio8 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    double radi, resultat=0;
    
    System.out.println("Valor:");
    radi = in.nextDouble();
    resultat = 2 * Math.PI * radi;
    
    System.out.println("Resultat:" + resultat);
    
}
}

