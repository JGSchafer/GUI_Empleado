package Interfaz;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelNorte extends JPanel {

	private JLabel banner;

	public PanelNorte() {

		BorderLayout bl = new BorderLayout();
		setLayout(bl);

		ImageIcon img = new ImageIcon("src/Imagenes/Encabezadofinalhd.png");
		banner = new JLabel(img);

		add(banner, BorderLayout.CENTER);
	}
}