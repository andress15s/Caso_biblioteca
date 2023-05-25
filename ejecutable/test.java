package ejecutable;

import controlador.Controlador;
import modelo.Libro;
import modelo.LibroColeccion;
import vista.VentanaPrincipal;

public class test 
{
    public static void main (String[] args)
    {
       VentanaPrincipal miVentana= new VentanaPrincipal();
       Libro miModelo = new Libro(null, null, null, 0, null);  
       Controlador miControlador = new Controlador(miVentana,miModelo);

       //entrada consola
         Libro miModelo1 = new Libro(null, null, null, 0, null);
            miModelo1.setNombreLibro("El señor de los anillos");
            miModelo1.setNombreAutor1("J.R.R. Tolkien");
            miModelo1.setNombreAutor2("J.R.R. Tolkien");
            miModelo1.setAnioEdicion(1954);
            miModelo1.setEdicionLujo("SI");
            System.out.println(miModelo1.toString());
            System.out.println("\n------------------------------------\n");

            LibroColeccion miModelo2 = new LibroColeccion(null, null, null, 0, null, null, 0);
            miModelo2.setNombreLibro("Harry Potter y la piedra filosofal");
            miModelo2.setNombreAutor1("J.K. Rowling");
            miModelo2.setNombreAutor2("J.K. Rowling");
            miModelo2.setAnioEdicion(1997);
            miModelo2.setEdicionLujo("SI");
            miModelo2.setNombreColeccion("Harry Potter sagas");
            miModelo2.setNumColeccion(1);
            System.out.println(miModelo2.toString());
            System.out.println("\n------------------------------------\n");




            


    }   
}