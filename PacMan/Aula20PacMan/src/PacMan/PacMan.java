package PacMan;

import java.awt.Image;
import javax.swing.ImageIcon;

import java.awt.Image;
import javax.swing.ImageIcon;

public class PacMan extends javax.swing.JLabel{


    public void setFig(int fig) {
        this.fig = fig;
    }
    private int x, y;
    private int direcao, fig;
    public PacMan(int x, int y){
        this.x = x;
        this.y = y;
        this.direcao = 1;
        this.fig = 1;
        
        ImageIcon image = new ImageIcon("src/fig/Pac 11.png");//src/com/jean/java/vasico/aula19/pacman/fig/Pac 11.png
        Image img = image.getImage();
        image = new ImageIcon(img.getScaledInstance(38, 38, java.awt.Image.SCALE_SMOOTH));
        this.setBounds(x, y, 40, 40);
        this.setIcon(image);
    }
    
    public void mover(int x, int y){
        this.x = x;
        this.y = y;
        this.setLocation(this.x, this.y);
        trocarFigura();
    }
    private void trocarFigura(){
        ImageIcon image = new ImageIcon("src/fig/Pac "+ (this.direcao)
            +(this.fig + 1)+ ".png");
        Image img = image.getImage();
        image = new ImageIcon(img.getScaledInstance(38,38, java.awt.Image.SCALE_SMOOTH));
        this.fig++;
        this.fig %=6;
        this.setIcon(image);
    }
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }
    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * @return the direcao
     */
    public int getDirecao() {
        return direcao;
    }
    /**
     * @param direcao the direcao to set
     */
    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }
    /**
     * @return the fig
     */
    public int getFig() {
        return fig;
    }
    /**
     * @param fig the fig to set
     */
}
