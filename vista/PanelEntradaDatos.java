package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //---------------
    // Atributos
    // --------------
    private JLabel lx;
    private JLabel ly;
    private JLabel lz;
    private JLabel lw;
    private JLabel lh;
    private JTextField tfx;
    private JTextField tfy;
    private JTextField tfz;
    private JTextField tfw;
    private JTextField tfh;
    private JComboBox cbedicionLujo;
    private String[] edicionLujo = {"De lujo", "No es de lujo"};
    private JLabel lImagen;
    private ImageIcon iImagen;
    

    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelEntradaDatos()
    {
        //crear y agregar imagen
        iImagen = new ImageIcon("C:/Users/carla/Desktop/Programacion orientada/Caso_biblioteca/vista/imagenes/Biblioteca.png");
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(10,10,200,200);
        this.add(lImagen);

        

        // crear y agregar etiqueta x
        lx = new JLabel("Nombre del libro");
        lx.setBounds(270, 30, 200, 20);
        this.add(lx);

        //crear caja de texto x
        tfx = new JTextField();
        tfx.setBounds(400,30,80,20);
        this.add(tfx);

        // crear y agregar etiqueta y
        ly = new JLabel("Nombre autor ");
        ly.setBounds(270, 70, 120, 20);
        this.add(ly);

        //crear caja de texto y
        tfy = new JTextField();
        tfy.setBounds(400,70,80,20);
        this.add(tfy);


        //etiqueta para otro autor
        JLabel otroAutor = new JLabel("¿Otro autor?");
        otroAutor.setBounds(270,100,120,20);
        this.add(otroAutor);


        //crear un boton y agregarlo para otro autor
        JButton btnOtroAutor = new JButton("Otro autor");
        btnOtroAutor.setBounds(400,100,100,20);
        this.add(btnOtroAutor);

        // crear y agregar etiqueta y
        lz = new JLabel("Año edicion =");
        lz.setBounds(270, 140, 120, 20);
        this.add(lz);

        //crear caja de texto y
        tfz = new JTextField();
        tfz.setBounds(400,140,80,20);
        this.add(tfz);

        // crear y agregar etiqueta x
        lw = new JLabel("Edicion =");
        lw.setBounds(270, 180, 120, 20);
        this.add(lw);

        

        cbedicionLujo = new JComboBox();
        for(int i=0; i<edicionLujo.length;i++)
        {
            cbedicionLujo.addItem(edicionLujo[i]);
        }
        cbedicionLujo.setBounds(400,180,80,20);
        this.add(cbedicionLujo);

        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.YELLOW);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("BIBLIOTECA DEL SEÑOR PÉREZ");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // metodos de acceso a la informacion 
    public String getTfx()
    {
        return tfx.getText();
    }

    public String getTfy()
    {
        return tfy.getText();
    }
    public String getTfz()
    {
        return tfz.getText();
    }
    
    public String getTfh()
    {
        return tfh.getText();
    }

    public String getEdicionLujo()
    {
        return (String) cbedicionLujo.getSelectedItem();
    }
    // metodo borrar cajas de texto
    public void borrar()
    {
        tfx.setText("");
        tfy.setText("");
        tfz.setText("");
        tfw.setText("");
        tfh.setText("");
    }
    

}
