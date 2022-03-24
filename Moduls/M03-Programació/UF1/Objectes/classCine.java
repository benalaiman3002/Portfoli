package Objectes;

public class classCine {

    private String Director;
    private String Tipo;
    private String Titulo;

    public classCine() {
        this.Director = " ";
        this.Tipo = " ";
        this.Titulo = " ";
    }

    public classCine(String dir, String tip, String tit) {
        this.Director = dir;
        this.Tipo = tip;
        this.Titulo = tit;
    }

    /**
     * @return the Director
     */
    public String getDirector() {
        return Director;
    }

    /**
     * @param Director the Director to set
     */
    public void setDirector(String Director) {
        this.Director = Director;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void imprimeix() {
        System.out.println("Director " + this.Director);
        System.out.println("Tipo " + this.Tipo);
        System.out.println("Titulo " + this.Titulo);
    }
}
