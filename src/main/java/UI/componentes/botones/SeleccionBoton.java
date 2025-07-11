package UI.componentes.botones;

import UI.utilidades.Colores;

import javax.swing.*;
import java.awt.*;

public class SeleccionBoton extends JButton {
    public SeleccionBoton(String nombre, Rectangle rectangulo) {
        super(nombre);
        setBounds(rectangulo);
        setFont(new Font(Font.DIALOG, Font.BOLD, 32));
        setContentAreaFilled(false);
        setBorderPainted(false);
        setForeground(Colores.BLANCO);

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Colores.LILA);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        g2d.dispose();
        super.paintComponent(g);
    }
}
