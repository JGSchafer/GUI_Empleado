package Interfaz;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelNorte extends JPanel {

    private JLabel lblBanner;

    public PanelNorte() {

        setLayout(new BorderLayout());

        ImageIcon banner = new ImageIcon("src/Imagenes/Encabezadofinalhd.png");
        lblBanner = new JLabel(banner);

        add(lblBanner, BorderLayout.CENTER);
    }
}