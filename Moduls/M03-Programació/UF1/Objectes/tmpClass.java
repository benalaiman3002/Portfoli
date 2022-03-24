/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author benal
 */
public class tmpClass {

    private String nom;
    private int edat;
    private char sexe;

    public tmpClass() {
        this.nom = "";
        this.edat = 0;
        this.sexe = ' ';
    }

    public tmpClass(String nom, int edat, char sexe) {
        this.nom = nom;
        this.edat = edat;
        this.sexe = sexe;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the edat
     */
    public int getEdat() {
        return edat;
    }

    /**
     * @param edat the edat to set
     */
    public void setEdat(int edat) {
        this.edat = edat;
    }

    /**
     * @return the sexe
     */
    public char getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(char sexe) {
        Scanner in = new Scanner(System.in);
        while (sexe != 'h' && sexe != 'd') {
        System.out.println("Error. Prueba otra vez");
            sexe = in.nextLine().charAt(0);
        }
                this.sexe = sexe;
    }

    public void augmentaEdat() {
        edat = edat + 1;
    }

    public long SegonsViscuts() {
        return this.edat * 365 * 24 * 3600;

    }

}
