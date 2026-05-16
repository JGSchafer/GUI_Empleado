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

	private JLabel nombre, apellido, genero;
	private JLabel fechaNac, fechaIng, salario;
	private JTextField txt1, txt2, txt3;
	private JTextField txt4, txt5, txt6;
	private JButton btnModificar;
	private JLabel foto;
	private JButton btnEdad, btnAntiguedad, btnPrestaciones;

	public PanelCentro() {

		setLayout(new BorderLayout());

		JPanel panelDatos = new JPanel(new BorderLayout());
		panelDatos.setBorder(new TitledBorder("Datos"));

		GridLayout gl = new GridLayout(7, 2);
		JPanel panelCampos = new JPanel(gl);

		nombre = new JLabel("Nombre:");
		txt1 = new JTextField("Pedro");
		apellido = new JLabel("Apellido:");
		txt2 = new JTextField("Matallana");
		genero = new JLabel("Género:");
		txt3 = new JTextField("masculino");
		fechaNac = new JLabel("Fecha de nacimiento:");
		txt4 = new JTextField("16-6-1982");
		fechaIng = new JLabel("Fecha de ingreso:");
		txt5 = new JTextField("5-4-2000");
		salario = new JLabel("Salario:");
		txt6 = new JTextField("$1,500,000");
		btnModificar = new JButton("Modificar salario");

		panelCampos.add(nombre);
		panelCampos.add(txt1);
		panelCampos.add(apellido);
		panelCampos.add(txt2);
		panelCampos.add(genero);
		panelCampos.add(txt3);
		panelCampos.add(fechaNac);
		panelCampos.add(txt4);
		panelCampos.add(fechaIng);
		panelCampos.add(txt5);
		panelCampos.add(salario);
		panelCampos.add(txt6);
		panelCampos.add(new JLabel());
		panelCampos.add(btnModificar);

		foto = new JLabel();
		foto.setIcon(new ImageIcon("src/Imagenes/empleado1.png"));

		panelDatos.add(panelCampos, BorderLayout.CENTER);
		panelDatos.add(foto, BorderLayout.EAST);

		JPanel panelCalculos = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		panelCalculos.setLayout(fl);
		panelCalculos.setBorder(new TitledBorder("Cálculos"));

		btnEdad = new JButton("Calcular edad");
		btnAntiguedad = new JButton("Calcular antigüedad");
		btnPrestaciones = new JButton("Calcular prestaciones");

		panelCalculos.add(btnEdad);
		panelCalculos.add(btnAntiguedad);
		panelCalculos.add(btnPrestaciones);

		add(panelDatos, BorderLayout.NORTH);
		add(panelCalculos, BorderLayout.CENTER);
	}
}