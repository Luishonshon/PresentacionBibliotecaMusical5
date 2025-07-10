package UI.componentes.paneles;

import UI.componentes.areasTxt.TituloFrameSesion;
import UI.componentes.botones.Boton;
import UI.componentes.botones.BotonCorazon;
import UI.utilidades.Colores;
import UI.utilidades.MetodosUtiles;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author luishonshon
 */
public class CartaPnl extends JPanel {

    private Elemento elemento;

    public CartaPnl() {
        setSize(147, 163);
        setLayout(null);
        setOpaque(false);
        
        elemento = new Elemento();
        elemento.setFav(true);
        elemento.nombre = "Nombre";
        
        JLabel tit = new JLabel(elemento.getNombre());
        
        tit.setSize(127, 20);
        tit.setLocation(0, 114);
        tit.setFont(new Font("Arial", Font.PLAIN, 14));
        tit.setOpaque(false);
        tit.setForeground(Colores.FONDO1);
        tit.setText("Nombre");
        add(tit);

        //JLabel lblIMagen = new JLabel(new ImageIcon(MetodosUtiles.redimensionarImagen(elemento.getImagen(), 110, 100)));
        JLabel lblImagen = new JLabel("Imagen");
        lblImagen.setBounds(18, 10, 110, 100);

        lblImagen.setHorizontalAlignment(JLabel.CENTER);
        lblImagen.setVerticalAlignment(JLabel.CENTER);
        lblImagen.setForeground(Colores.BLANCO);
        add(lblImagen);

        Rectangle rectangulo = new Rectangle(10, 138, 127, 22);
        Boton btn = new Boton("Ver detalles", rectangulo);
        add(btn);
        btn.setTextoColor(Colores.BLANCO);

        BotonCorazon btnFav = new BotonCorazon();
        btnFav.setBounds(122, 114, 20, 20);
        btnFav.setFavorito(elemento != null && elemento.getFav());
        add(btnFav);

        btnFav.addActionListener(e -> {
            elemento.setFav(btnFav.isFavorito());
        });

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Colores.LILA);
        g2d.fillRoundRect(0, 0, 147, 163, 20, 20);

        g2d.setColor(Colores.VERDE);
        g2d.fillRect(0, 114, 147, 22);

        g2d.setColor(Colores.FONDO2);
        g2d.fillRect(18, 10, 110, 100);

        g2d.setColor(Colores.FONDO1);
        g2d.fillRoundRect(10, 138, 127, 22, 10, 10);
    }
}
