package UI.componentes.paneles;

import UI.componentes.areasTxt.FieldTxt;
import UI.componentes.areasTxt.PWFieldTxt;
import UI.componentes.areasTxt.TituloFrameSesion;
import UI.componentes.botones.SeleccionBoton;
import UI.utilidades.Colores;

import javax.swing.*;
import java.awt.*;

public class InicioSesionPnl extends JPanel {
    private SeleccionBoton btnIniciarSesion;
    private SeleccionBoton btnRegistrarse;
    private PWFieldTxt pwTxtFld;
    private FieldTxt userTxtFld;



    public InicioSesionPnl() {
        setPreferredSize(new Dimension(1000, 600));
        setLayout(null);
        setOpaque(false);

        TituloFrameSesion titulo = new TituloFrameSesion("Inicio Sesión");
        add(titulo);


        userTxtFld = new FieldTxt("Ingresar usuario");
        userTxtFld.setBounds(250, 140, 500, 50);
        add(userTxtFld);

        pwTxtFld = new PWFieldTxt("Ingrese contraseña");
        pwTxtFld.setBounds(250, 207, 500, 50);
        add(pwTxtFld);

        btnRegistrarse = new SeleccionBoton("Registrarse",
                new Rectangle(209, 320, 250, 50));
        add(btnRegistrarse);

        btnIniciarSesion = new SeleccionBoton("Entrar",
                new Rectangle(524, 320, 250, 50));
        add(btnIniciarSesion);
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
        g2d.fillRoundRect(250, 140, 500, 50, 20, 20);
        g2d.fillRoundRect(250, 207, 500, 50, 20, 20);

    }

    public SeleccionBoton getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public SeleccionBoton getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public PWFieldTxt getPwTxtFld() {
        return pwTxtFld;
    }

    public FieldTxt getUserTxtFld() {
        return userTxtFld;
    }
}
