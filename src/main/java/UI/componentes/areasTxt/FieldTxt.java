    package UI.componentes.areasTxt;

import UI.utilidades.Colores;

import javax.swing.*;
import java.awt.*;

public class FieldTxt extends JTextField {

    public FieldTxt(String texto) {
        setText(texto);
        setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 32));
        setHorizontalAlignment(SwingConstants.CENTER);
        setBackground(null);
        setBorder(null);
        setOpaque(false);
    }
}
