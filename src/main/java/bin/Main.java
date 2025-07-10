package bin;

import UI.FrameSesion;
import UI.componentes.paneles.CartaPnl;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
            //FrameSesion frame = new FrameSesion();
            JFrame frame2 = new JFrame();
            frame2.setSize(1000, 1000);
            Rectangle rectangulo = new Rectangle(0, 0, 0, 0);
            
            CartaPnl pnl = new CartaPnl();
            frame2.add(pnl);
            
            frame2.setVisible(true);
    }
}
