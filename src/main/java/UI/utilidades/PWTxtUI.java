package UI.utilidades;


import javax.swing.*;
import javax.swing.plaf.basic.BasicPasswordFieldUI;
import java.awt.*;
import javax.swing.text.JTextComponent;

public class PWTxtUI extends BasicPasswordFieldUI {
    private final String hint;
    private final Color hintColor;

    public PWTxtUI(String hint) {
        this(hint, Color.GRAY);
    }

    public PWTxtUI(String hint, Color hintColor) {
        this.hint = hint;
        this.hintColor = hintColor;
    }

    @Override
    protected void paintSafely(Graphics g) {
        super.paintSafely(g);
        JTextComponent comp = getComponent();

        if (comp.getText().isEmpty() && !comp.hasFocus()) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.BLACK);
            g2.setFont(comp.getFont().deriveFont(Font.PLAIN));
            Insets insets = comp.getInsets();
            int padding = (comp.getHeight() - comp.getFontMetrics(comp.getFont()).getHeight()) / 2;
            g2.drawString(hint, insets.left + 5, comp.getHeight() - padding - 3);
        }
    }

    @Override
    public void installUI(JComponent component) {
        super.installUI(component);
        ((JTextComponent) component).setOpaque(false);
    }
}
