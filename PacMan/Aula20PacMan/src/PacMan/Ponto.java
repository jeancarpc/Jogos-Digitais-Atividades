package PacMan;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Ponto extends javax.swing.JLabel{
    
    private int x, y;
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
        ImageIcon image = new ImageIcon("src/fig/ponto.png");//src/com/jean/java/vasico/aula19/pacman/fig/Pac 11.png
        Image img = image.getImage();
        image = new ImageIcon(img.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH));
        this.setBounds(x, y, 15, 15);
        this.setIcon(image);
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    
}
