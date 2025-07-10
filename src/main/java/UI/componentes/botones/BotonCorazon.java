package UI.componentes.botones;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author luishonshon
 */
public class BotonCorazon extends JButton {

    private boolean favorito = false;

    public BotonCorazon() {
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        addActionListener(e -> {
            favorito = !favorito;
            repaint();
        });
    }

    public void setFavorito(boolean fav) {
        this.favorito = fav;
        repaint();
    }

    public boolean isFavorito() {
        return favorito;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawHeart((Graphics2D) g, getWidth(), getHeight(), favorito);
    }

    private void drawHeart(Graphics2D g2d, int w, int h, boolean filled) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(2));

        Shape heart = crearFormaCorazon(w, h);

        if (filled) {
            g2d.setColor(Color.RED);
            g2d.fill(heart);
        } else {
            g2d.setColor(Color.RED);
            g2d.draw(heart);
        }
    }

    private Shape crearFormaCorazon(int w, int h) {
        int x = 0, y = 0;
        int width = w, height = h;

        Polygon heart = new Polygon();
        heart.addPoint(x + width / 2, y + height);
        heart.addPoint(x, y + height / 2);
        heart.addPoint(x + width / 4, y);
        heart.addPoint(x + width / 2, y + height / 4);
        heart.addPoint(x + 3 * width / 4, y);
        heart.addPoint(x + width, y + height / 2);
        return heart;
    }
}
