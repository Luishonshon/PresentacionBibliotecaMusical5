package UI;

import java.awt.BorderLayout;
import javax.swing.*;

public class FrameInicio extends JFrame {

    public static JPanel pnlInicio;
    public static JPanel pnlFrm;

    public FrameInicio() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(1280, 800);
        setResizable(false);

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

    }
}
