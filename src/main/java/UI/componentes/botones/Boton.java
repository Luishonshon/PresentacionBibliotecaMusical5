package UI.componentes.botones;

import UI.utilidades.Colores;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JButton;

/**
 *
 * @author luishonshon
 */
public class Boton extends JButton {

    private Rectangle rectangulo;

    public Boton(String texto, Rectangle rectangulo) {
        super(texto);
        setBounds(rectangulo);
        setFont(new Font("Arial", Font.BOLD, 12));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setForeground(Colores.FONDO1);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public void setTextoColor(Color color) {
        setForeground(color);
    }

    public void setFuente(Font fuente) {
        setFont(fuente);
    }
}
