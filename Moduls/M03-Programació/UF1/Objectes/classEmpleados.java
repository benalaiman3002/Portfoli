package Objectes;

public class classEmpleados {

    private String Direccion;
    private String Nombre;
    private int CodPostal;
    private int CalleNum;
    private String Localidad;
    private String Provincia;
    

    public classEmpleados() {
        this.Direccion = " ";
        this.Nombre = " ";
        this.CalleNum = 0;
        this.Localidad = " ";
        this.Provincia = " ";
        this.CodPostal = 0;
    }

    public classEmpleados(String dir, String nom, String loc, int Cnum, int pos, String prov) {
        this.Direccion = dir;
        this.Nombre = nom;
        this.Localidad = loc;
        this.CalleNum = Cnum;
        this.CodPostal = pos;
        this.Provincia = prov;
    }

    public void imprimeix() {
        System.out.println("Director " + this.getDireccion());
        System.out.println("Tipo " + this.getNombre());
        System.out.println("Titulo " + this.getCodPostal());
        System.out.println("Titulo " + this.getCalleNum());
        System.out.println("Titulo " + this.getLocalidad());
        System.out.println("Titulo " + this.getProvincia());
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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
     * @return the CodPostal
     */
    public int getCodPostal() {
        return CodPostal;
    }

    /**
     * @param CodPostal the CodPostal to set
     */
    public void setCodPostal(int CodPostal) {
        this.CodPostal = CodPostal;
    }

    /**
     * @return the CalleNum
     */
    public int getCalleNum() {
        return CalleNum;
    }

    /**
     * @param CalleNum the CalleNum to set
     */
    public void setCalleNum(int CalleNum) {
        this.CalleNum = CalleNum;
    }

    /**
     * @return the Localidad
     */
    public String getLocalidad() {
        return Localidad;
    }

    /**
     * @param Localidad the Localidad to set
     */
    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    /**
     * @return the Provincia
     */
    public String getProvincia() {
        return Provincia;
    }

    /**
     * @param Provincia the Provincia to set
     */
    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
}
