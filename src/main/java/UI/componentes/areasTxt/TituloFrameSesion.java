package UI.componentes.areasTxt;

import javax.swing.*;
import java.awt.*;

public class TituloFrameSesion extends JLabel {

    private String texto;

    public TituloFrameSesion(String texto) {
        setText(texto);
        setFont(new Font("Arial", Font.BOLD, 40));
        setHorizontalAlignment(SwingConstants.CENTER);
        setBounds(50, 56, 900, 60);

    }
}
