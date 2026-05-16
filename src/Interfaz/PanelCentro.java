package Interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelCentro extends JPanel {

    private JLabel lblNombre, lblApellido, lblGenero;
    private JLabel lblFechaNac, lblFechaIng, lblSalario;
    private JTextField txtNombre, txtApellido, txtGenero;
    private JTextField txtFechaNac, txtFechaIng, txtSalario;
    private JButton btnModificar;
    private JLabel lblFoto;
    private JButton btnEdad, btnAntiguedad, btnPrestaciones;

    public PanelCentro() {

        setLayout(new BorderLayout());

       
        JPanel panelDatos = new JPanel(new BorderLayout());
        panelDatos.setBorder(new TitledBorder("Datos"));

        JPanel panelCampos = new JPanel(new GridLayout(7, 2, 5, 5));

        lblNombre   = new JLabel("Nombre:");
        txtNombre   = new JTextField("Pedro");
        lblApellido = new JLabel("Apellido:");
        txtApellido = new JTextField("Matallana");
        lblGenero   = new JLabel("Género:");
        txtGenero   = new JTextField("masculino");
        lblFechaNac = new JLabel("Fecha de nacimiento:");
        txtFechaNac = new JTextField("16-6-1982");
        lblFechaIng = new JLabel("Fecha de ingreso:");
        txtFechaIng = new JTextField("5-4-2000");
        lblSalario  = new JLabel("Salario:");
        txtSalario  = new JTextField("$1,500,000");
        btnModificar = new JButton("Modificar salario");

        panelCampos.add(lblNombre);    panelCampos.add(txtNombre);
        panelCampos.add(lblApellido);  panelCampos.add(txtApellido);
        panelCampos.add(lblGenero);    panelCampos.add(txtGenero);
        panelCampos.add(lblFechaNac);  panelCampos.add(txtFechaNac);
        panelCampos.add(lblFechaIng);  panelCampos.add(txtFechaIng);
        panelCampos.add(lblSalario);   panelCampos.add(txtSalario);
        panelCampos.add(new JLabel()); panelCampos.add(btnModificar);

        lblFoto = new JLabel();
        lblFoto.setIcon(new ImageIcon("src/Imagenes/empleado1.png"));

        panelDatos.add(panelCampos, BorderLayout.CENTER);
        panelDatos.add(lblFoto,     BorderLayout.EAST);

        
        JPanel panelCalculos = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelCalculos.setBorder(new TitledBorder("Cálculos"));

        btnEdad         = new JButton("Calcular edad");
        btnAntiguedad   = new JButton("Calcular antigüedad");
        btnPrestaciones = new JButton("Calcular prestaciones");

        panelCalculos.add(btnEdad);
        panelCalculos.add(btnAntiguedad);
        panelCalculos.add(btnPrestaciones);

        
        add(panelDatos,    BorderLayout.NORTH);
        add(panelCalculos, BorderLayout.CENTER);
    }
}