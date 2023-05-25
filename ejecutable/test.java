package ejecutable;

import controlador.Controlador;
import modelo.Libro;
import vista.VentanaPrincipal;

public class test 
{
    public static void main (String[] args)
    {
      /* VentanaPrincipal miVentana= new VentanaPrincipal();
       Libro miModelo = new Libro(null, null, null, 0, null);  
       Controlador miControlador = new Controlador(miVentana,miModelo);*/

       //entrada consola
         Libro miModelo = new Libro(null, null, null, 0, null);
            miModelo.setNombreLibro("El señor de los anillos");
            miModelo.setNombreAutor1("J.R.R. Tolkien");
            miModelo.setNombreAutor2("J.R.R. Tolkien");
            miModelo.setAnioEdicion(1954);
            miModelo.setEdicionLujo("No");
            System.out.println(miModelo.toString());


            


    }   
}