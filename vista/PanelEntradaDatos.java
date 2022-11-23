package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
//import javax.swing.ImageIcon;
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
    //private JLabel lImagen;
    //private ImageIcon iImagen;
    

    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelEntradaDatos()
    {
        //crear y agregar imagen
        //iImagen = new ImageIcon(getClass().getResource("empleado.png"));
        //lImagen = new JLabel(iImagen);
        //lImagen.setBounds(30,27,238,212);
        //this.add(lImagen);

        // crear y agregar etiqueta x
        lx = new JLabel("Nombre del libro =");
        lx.setBounds(290, 30, 200, 20);
        this.add(lx);

        //crear caja de texto x
        tfx = new JTextField();
        tfx.setBounds(500,30,80,20);
        this.add(tfx);

        // crear y agregar etiqueta y
        ly = new JLabel("Nombre autor 1=");
        ly.setBounds(290, 70, 120, 20);
        this.add(ly);

        //crear caja de texto y
        tfy = new JTextField();
        tfy.setBounds(500,70,80,20);
        this.add(tfy);

        lh = new JLabel("Nombre autor 2=");
        lh.setBounds(290, 110, 120, 20);
        this.add(lh);

        //crear caja de texto y
        tfh = new JTextField();
        tfh.setBounds(500,110,80,20);
        this.add(tfh);

        // crear y agregar etiqueta y
        lz = new JLabel("Año edicion =");
        lz.setBounds(290, 140, 120, 20);
        this.add(lz);

        //crear caja de texto y
        tfz = new JTextField();
        tfz.setBounds(500,140,80,20);
        this.add(tfz);

        // crear y agregar etiqueta x
        lw = new JLabel("Edicion =");
        lw.setBounds(290, 180, 120, 20);
        this.add(lw);

        //crear caja de texto x
        /*tfw = new JTextField();
        tfw.setBounds(500,200,80,20);
        this.add(tfw);*/

        cbedicionLujo = new JComboBox();
        for(int i=0; i<edicionLujo.length;i++)
        {
            cbedicionLujo.addItem(edicionLujo[i]);
        }
        cbedicionLujo.setBounds(500,180,80,20);
        this.add(cbedicionLujo);

        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
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
