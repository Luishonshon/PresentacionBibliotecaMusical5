package UI.componentes.paneles;

import java.awt.image.BufferedImage;

/**
 *
 * @author luishonshon
 */
class Elemento {

    String nombre;
    BufferedImage imagen;
    String genero;
    private boolean fav;

    public String getNombre() {
        return nombre;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public String getGenero() {
        return genero;
    }

    public boolean getFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }
    
}
