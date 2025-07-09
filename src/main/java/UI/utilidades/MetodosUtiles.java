package UI.utilidades;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MetodosUtiles {
    public static BufferedImage redimensionarImagen(BufferedImage original, int ancho, int alto) {
        Image imagenEscalada = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        try {
            imagenEscalada = original.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        }catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        BufferedImage imagenNueva = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imagenNueva.createGraphics();
        g2d.drawImage(imagenEscalada, 0, 0, null);
        g2d.dispose();

        return imagenNueva;
    }
}