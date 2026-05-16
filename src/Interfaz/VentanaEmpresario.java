package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class VentanaEmpresario extends JFrame {

    private PanelNorte panelNorte;
    private PanelCentro panelCentro;
    private PanelSur panelSur;

    public VentanaEmpresario() {

        panelNorte  = new PanelNorte();
        panelCentro = new PanelCentro();
        panelSur    = new PanelSur();

        setLayout(new BorderLayout());

        add(panelNorte,  BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
        add(panelSur,    BorderLayout.SOUTH);

        setTitle("Sistema de un empleado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaEmpresario();
    }
}