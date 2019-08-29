package PacMan;

public class Cenario extends javax.swing.JFrame {
    private int largura, altura;
    //private PacMan pacman;
    //ArrayList<Bloco> listaBloco;

    public Cenario(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        
       // pacman = new PacMan(this.largura / 2, this.altura / 2);
       // this.add(pacman);
        
        this.setTitle("PACMAN");
        this.setLayout(null);
        this.setSize(this.largura, this.altura);
        this.setVisible(true);
    }
    public void addBloco(Bloco b){
        this.add(b);
    }
    public void addPacMan(PacMan pacman){
        this.add(pacman);
        pacman.repaint();
    }
    
/*    public void addClique(){
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e){
                switch(e.getKeyCode()){
                    case 37:
                        pacman.setDirecao(4);
                        mover(-5, 0);   // esquerda
                        break;
                    case 38:
                        pacman.setDirecao(3);
                        mover(0, -5);   // cima
                        break;
                    case 39:
                        pacman.setDirecao(1);
                        mover(5, 0);    // direita
                        break;
                    case 40:
                        pacman.setDirecao(2);
                        mover(0, 5);    // baixo
                        break;
                        
                }
            }
});
    }
    public void mover(int dx, int dy){
        pacman.mover(pacman.getX() + dx, pacman.getY() + dy);
    }
    public void addBloco(){
        listaBloco = new ArrayList<Bloco>();
        Bloco b1, b2, b3, b4,b5, b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
        b1 = new Bloco(0,0,40,500);
        b2 = new Bloco(40,0,420,100);
        b3 = new Bloco(40,440,420,500);
        b4 = new Bloco(460,0,40,500);
        b5 = new Bloco(80,140,80,40);
        b6 = new Bloco(80,220,40,80);
        b7 = new Bloco(80,320,40,80);
        b8 = new Bloco(80,400,80,40);
        
        
        listaBloco.add(b1);
        listaBloco.add(b2);
        listaBloco.add(b3);
        listaBloco.add(b4);
        listaBloco.add(b5);
        listaBloco.add(b6);
        listaBloco.add(b7);
        listaBloco.add(b8);
        for(Bloco b : listaBloco)
            this.add(b);
        
    }
*/
}
