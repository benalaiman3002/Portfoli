package Objectes;

public class classLibreria {

    private String ISBN;
    private String title;
    private String autor;
    private String editorial;
    private int numberBooks;
    private double precio;

    public classLibreria() {
        this.ISBN = " ";
        this.title = " ";
        this.autor = " ";
        this.editorial = " ";
        this.numberBooks = 0;
        this.precio = 0;
    }

    public classLibreria(String isbn, String tit, String aut, String edit, int num, double precio) {
        this.ISBN = isbn;
        this.title = tit;
        this.autor = aut;
        this.editorial = edit;
        this.numberBooks = num;
        this.precio = precio;
    }
    public void imprimeix() {
        System.out.printf("ISBN:\t" + this.getISBN());
        System.out.println("");
        System.out.printf("Titulo:\t" + this.getTitle());
        System.out.println("");
        System.out.printf("Autor:\t" + this.getAutor());
        System.out.println("");
        System.out.printf("Editorial:\t" + this.getEditorial());
        System.out.println("");
        System.out.printf("Numero de libros en tienda:\t" + this.getNumberBooks());
        System.out.println("");
        System.out.printf("Precio:\t" + this.getPrecio());
        System.out.println("");
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the numberBooks
     */
    public int getNumberBooks() {
        return numberBooks;
    }

    /**
     * @param numberBooks the numberBooks to set
     */
    public void setNumberBooks(int numberBooks) {
        this.numberBooks = numberBooks;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
