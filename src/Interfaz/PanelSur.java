package Interfaz;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelSur extends JPanel {

	private JButton btnCambiar;
	private JButton btnOp1;
	private JButton btnOp2;

	public PanelSur() {

		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		setLayout(fl);
		setBorder(new TitledBorder("Opciones"));

		btnCambiar = new JButton("Cambiar empleado");
		btnOp1 = new JButton("Opción 1");
		btnOp2 = new JButton("Opción 2");

		add(btnCambiar);
		add(btnOp1);
		add(btnOp2);
	}
}