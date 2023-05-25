package modelo;

import java.util.ArrayList;

public class Biblioteca 
{
    //atributos
    private  ArrayList<Libro> libros;
    private int numLibros;

    //constructor
    public Biblioteca()
    {
        libros = new ArrayList<Libro>();
        numLibros = 0;
    }

    //metodos
    public void agregarLibro(Libro libro)
    {
        libros.add(libro);
        numLibros++;
    }

    public int getNumLibros()
    {
        return numLibros;
    }

    public Libro obtenerLibro(int indice)
    {
        return libros.get(indice);
    }
  
    
    
}
