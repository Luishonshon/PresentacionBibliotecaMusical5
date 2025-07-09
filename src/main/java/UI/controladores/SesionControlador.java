package UI.controladores;

import UI.FrameSesion;
import UI.componentes.paneles.InicioSesionPnl;
import UI.componentes.paneles.RegistroPnl;
import UI.utilidades.MetodosUtiles;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SesionControlador {
        private InicioSesionPnl inicioSesionPnl;
        private RegistroPnl registroPnl;
        //IFacadeUsuario FU = new FacadeUsuario();

        public SesionControlador(InicioSesionPnl vista) {
            this.inicioSesionPnl = vista;
            this.registroPnl = new RegistroPnl();
            controlar();
        }

        private void controlar() {
            //listener del boton para iniciar sesión
            inicioSesionPnl.getBtnIniciarSesion().addActionListener(e -> {
                String usuario = inicioSesionPnl.getUserTxtFld().getText();
                String contraseña = new String(inicioSesionPnl.getPwTxtFld().getPassword());

// Falta------> FU.inciarSeion(new InidioSesionDTO(usuario, contraseña));
                System.out.println(usuario + " " + contraseña);
            });

            inicioSesionPnl.getBtnRegistrarse().addActionListener(e -> {
                FrameSesion.mostrarVista(registroPnl);

                registroPnl.getBtnCambiarImagen().addActionListener(e1 -> {
                    JFileChooser chooser = new JFileChooser();
                    int resultado = chooser.showOpenDialog(null);

                    if (resultado == JFileChooser.APPROVE_OPTION) {
                        try {
                            File archivo = chooser.getSelectedFile();
                            BufferedImage imagen = ImageIO.read(archivo);

                            BufferedImage imagenRedimensionada = MetodosUtiles.redimensionarImagen(imagen, 110, 100);
                            JLabel lblImagen = new JLabel(new ImageIcon(imagenRedimensionada));

                            registroPnl.actualizarImagen(imagenRedimensionada);

                        } catch (IOException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error al cargar la imagen.");
                        }
                    }
                });
            });

            registroPnl.getBtnVolver().addActionListener(e -> {
               FrameSesion.mostrarVista(inicioSesionPnl);
            });

        }
}
