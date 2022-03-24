package Objectes;

import java.util.Scanner;

public class classDepartament {
    
    private String Nombre;
    private int Horas;
    private double Sueldo;
    private int Codigo;


    

    public classDepartament() {
        this.Nombre=" ";
        this.Horas= 0;
        this.Sueldo = 0;
        this.Codigo= 0;
    }

    public classDepartament(int Horas, double Sueldo, int Codigo, String Nombre) {
        this.Nombre = Nombre;
        this.Horas = Horas;
        this.Sueldo = Sueldo;
        this.Codigo = Codigo;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Horas
     */
    public int getHoras() {
        return Horas;
    }

    /**
     * @param Horas the Horas to set
     */
    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    /**
     * @return the Sueldo
     */
    public double getSueldo() {
        return Sueldo;
    }

    /**
     * @param Sueldo the Sueldo to set
     */
    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    /**
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
public void departament (String dep) {
    Scanner in = new Scanner(System.in);
    while(!checkDepartamentos(dep)) {
        System.out.println("Intro departamento:");
        String deps = in.nextLine();
    }
    this.departament(dep);
}

  
}
