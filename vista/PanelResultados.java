package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import modelo.Libro;

public class PanelResultados extends JPanel
{
        //---------------
    // Atributos
    // --------------
    private JTextArea taResultado;
    private JScrollPane spResultado;
   
    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelResultados()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar area de texto 
        taResultado= new JTextArea("bienvendio a la biblioteca del cucho Pérez");
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,760,220);
        this.add(spResultado);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("ARCHIVADOS");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

    }
    // metodo de acceso a la informacion
    public void mostrarResultado(Libro p)
    {
        taResultado.setText(p.toString());
    }

    // borrar resultados
    public void borrar()
    {
        taResultado.setText("");
    }  

    // metodo de acceso a la informacion
    public void mostrarResultado(String p)
    {
        taResultado.setText(p);
    }

    // borrar resultados   
    public void borrar(String p)
    {
        taResultado.setText(p);
    }

    
    
}