package Objectes;

public class classDepEmp {
    
    private String Nombre;
    private int Edad;
    private String Telefon;
    private String Departament;

    

    public classDepEmp() {
        this.Nombre = " ";
        this.Edad = 0;
        this.Telefon= " ";
        this.Departament = " ";
    }

    public classDepEmp(String Nombre, int Edad, String Telefon, String Departament) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Telefon = Telefon;
        this.Departament = Departament;
    }

  

    public void imprimeix() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Numero de telefon:  " + this.getTelefon());
        System.out.println("Departament: " + this.getDepartament());
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
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the Telefon
     */
    public String getTelefon() {
        return Telefon;
    }

    /**
     * @param Telefon the Telefon to set
     */
    public void setTelefon(String Telefon) {
        this.Telefon = Telefon;
    }

    /**
     * @return the Departament
     */
    public String getDepartament() {
        return Departament;
    }

    /**
     * @param Departament the Departament to set
     */
    public void setDepartament(String Departament) {
        this.Departament = Departament;
    }


}
