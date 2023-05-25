package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
        //---------------
    // Atributos
    // --------------
    public JButton btHallar;
    public JButton btBorrar;
    public JButton btSalir;

    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelOperaciones()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //crear y agregar boton hallar
        btHallar = new JButton("Hallar");
        btHallar.setBounds(45,25,80,40);
        this.add(btHallar);
        btHallar.setActionCommand("Hallar");

        // crear y agregar boton borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(250,25,80,40);
        this.add(btBorrar);
        btBorrar.setActionCommand("Borrar");

        // crear y agregar boton salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(450,25,80,40);
        this.add(btSalir);
        btSalir.setActionCommand("Salir");

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

    }
}