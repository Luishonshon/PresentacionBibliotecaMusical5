package UI;

import UI.componentes.paneles.InicioSesionPnl;
import UI.controladores.SesionControlador;
import UI.utilidades.Colores;

import javax.swing.*;
import java.awt.*;

public class FrameSesion extends JFrame {

    public static JPanel pnlSesion;
    public static JPanel pnlFrm;

    public FrameSesion() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(1280, 800);
        setResizable(false);

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        pnlFrm = new JPanel();
        pnlFrm.setLayout(null);
        pnlFrm.setBackground(Colores.FONDO1);
        pnlFrm.setSize(1280, 800);
        add(pnlFrm, BorderLayout.CENTER);

        pnlSesion = new JPanel();
        pnlSesion.setLayout(null);
        pnlSesion.setBackground(null);
        pnlSesion.setPreferredSize(new Dimension(1000, 600));
        pnlSesion.setOpaque(false);
        pnlSesion.setLocation(140, 30);
        pnlSesion.setBounds(140, 30, 1000, 600);

        pnlFrm.add(pnlSesion, BorderLayout.CENTER);

        InicioSesionPnl pnlInicioSesion = new InicioSesionPnl();
        mostrarVista(pnlInicioSesion);
        new SesionControlador(pnlInicioSesion);

        setVisible(true);
    }

    public static void mostrarVista(JPanel nuevoPanel) {
        pnlSesion.removeAll();

        nuevoPanel.setBounds(0, 0, 1000, 600);
        nuevoPanel.setOpaque(false);

        pnlSesion.add(nuevoPanel);
        pnlSesion.revalidate();
        pnlSesion.repaint();
    }

}
