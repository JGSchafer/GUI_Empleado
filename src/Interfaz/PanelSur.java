package Interfaz;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelSur extends JPanel {

    private JButton btnCambiar;
    private JButton btnOpcion1;
    private JButton btnOpcion2;

    public PanelSur() {

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBorder(new TitledBorder("Opciones"));

        btnCambiar = new JButton("Cambiar empleado");
        btnOpcion1 = new JButton("Opción 1");
        btnOpcion2 = new JButton("Opción 2");

        add(btnCambiar);
        add(btnOpcion1);
        add(btnOpcion2);
    }
}