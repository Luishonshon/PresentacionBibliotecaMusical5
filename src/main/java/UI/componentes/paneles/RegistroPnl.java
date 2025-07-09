package UI.componentes.paneles;

import UI.componentes.areasTxt.FieldTxt;
import UI.componentes.areasTxt.PWFieldTxt;
import UI.componentes.areasTxt.TituloFrameSesion;
import UI.componentes.botones.SeleccionBoton;
import UI.utilidades.Colores;
import UI.utilidades.MetodosUtiles;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class RegistroPnl extends JPanel {
    private SeleccionBoton btnVolver;
    private SeleccionBoton btnRegistrarse;
    private JButton btnCambiarImagen;
    private PWFieldTxt pwTxtFld;
    private PWFieldTxt pwTxtFld2;
    private FieldTxt userTxtFld;
    private FieldTxt correoTxtFld;
    private BufferedImage imagen;
    private JLabel lblIMagen;

    public RegistroPnl() {
        setPreferredSize(new Dimension(1000, 600));
        setLayout(null);
        setOpaque(false);

        TituloFrameSesion titulo = new TituloFrameSesion("Registro");
        add(titulo);


        userTxtFld = new FieldTxt("Ingresar usuario");
        userTxtFld.setBounds(150, 140, 500, 50);
        add(userTxtFld);

        correoTxtFld = new FieldTxt("Ingresar correo");
        correoTxtFld.setBounds(150, 207, 500, 50);
        add(correoTxtFld);

        pwTxtFld = new PWFieldTxt("Ingrese su contraseña");
        pwTxtFld.setBounds(150, 274, 500, 50);
        add(pwTxtFld);

        pwTxtFld2 = new PWFieldTxt("Confirme su contraseña");
        pwTxtFld2.setBounds(150, 341, 500, 50);
        add(pwTxtFld2);

        btnRegistrarse = new SeleccionBoton("Registrarse",
                new Rectangle(450, 400, 250, 50));
        add(btnRegistrarse);

        btnVolver = new SeleccionBoton("Volver",
                new Rectangle(150, 400, 250, 50));
        add(btnVolver);

        btnCambiarImagen = new JButton("Cambiar Imagen");
        btnCambiarImagen.setBounds(756,290, 150, 20);
        btnCambiarImagen.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
        btnCambiarImagen.setOpaque(false);
        btnCambiarImagen.setBorder(null);
        btnCambiarImagen.setBackground(null);
        add(btnCambiarImagen);

        try {
            imagen = ImageIO.read(getClass().getResource("/default.png"));
            imagen = MetodosUtiles.redimensionarImagen(imagen, 110, 100);
        } catch (IOException e) {
            imagen = new BufferedImage(110, 100, BufferedImage.TYPE_INT_ARGB); // fallback si falla
        }

        lblIMagen = new JLabel(new ImageIcon(imagen));
        lblIMagen.setBounds(780, 140, 110, 100);
        add(lblIMagen);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        //pinta fondo y redondea esquinas
        g2d.setColor(Colores.FONDO2);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 100, 100);

        //pinta el portador del titulo y redondea
        g2d.setColor(Colores.LILA);
        g2d.fillRect(50, 56, 900, 60);

        //pinta los portadores del area de ingresar texto
        g2d.setColor(Colores.VERDE);
        g2d.fillRoundRect(150, 140, 500, 50, 20, 20);
        g2d.fillRoundRect(150, 207, 500, 50, 20, 20);
        g2d.fillRoundRect(150, 274, 500, 50, 20, 20);
        g2d.fillRoundRect(150, 341, 500, 50, 20, 20);

    }

    public void actualizarImagen(BufferedImage nuevaImagen) {
        this.imagen = nuevaImagen;
        lblIMagen.setIcon(new ImageIcon(imagen));
        repaint();
    }

    public SeleccionBoton getBtnVolver() {
        return btnVolver;
    }

    public SeleccionBoton getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public JButton getBtnCambiarImagen() {
        return btnCambiarImagen;
    }

    public PWFieldTxt getPwTxtFld() {
        return pwTxtFld;
    }

    public PWFieldTxt getPwTxtFld2() {
        return pwTxtFld2;
    }

    public FieldTxt getUserTxtFld() {
        return userTxtFld;
    }

    public FieldTxt getCorreoTxtFld() {
        return correoTxtFld;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    public void setLblIMagen(JLabel lblIMagen) {
        this.lblIMagen = lblIMagen;
    }
}
