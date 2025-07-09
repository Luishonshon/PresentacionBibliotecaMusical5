package UI.componentes.areasTxt;

import UI.utilidades.PWTxtUI;

import javax.swing.*;
import java.awt.*;

public class PWFieldTxt extends JPasswordField {
    public PWFieldTxt(String texto) {
        setFont(new Font("Arial", Font.PLAIN, 32));
        setHorizontalAlignment(SwingConstants.CENTER);
        setBackground(null);
        setBorder(null);
        setOpaque(false);
        setUI(new PWTxtUI(texto));

    }
}
