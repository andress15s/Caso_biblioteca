package modelo;

public class LibroColeccion extends Libro
{
    //---------------------
    //Atributos
    //---------------------
    private String nombreColeccion;
    private int numColeccion;

    //---------------------
    //Métodos
    //---------------------

    //Constructor comun u ordinario
    public LibroColeccion(String nLi, String nAu1, String nAu2,int aEd, String eLu, String nCo, int nCo2)
    {
        super(nLi, nAu1, nAu2, aEd, eLu);
        this.nombreColeccion = nCo;
        this.numColeccion = nCo2;
    }

    //Metodos de acceso
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public int getNumColeccion() {
        return numColeccion;
    }

    public void setNumColeccion(int numColeccion) {
        this.numColeccion = numColeccion;
    }

    public String toString()
    {
        return "Nombre del libro: " + nombreLibro + "\nNombre del autor 1: " + nombreAutor1 + "\nNombre del autor 2: " + nombreAutor2 + "\nAño de edición: " + anioEdicion + "\nEdición de lujo: " + edicionLujo + "\nNombre de la colección: " + nombreColeccion + "\nNúmero de la colección: " + numColeccion;
    }

    
}
