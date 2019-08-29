package PacMan;

import java.util.ArrayList;

public class Controle {
    // ATRIBUTOS DA CLASS
    private Cenario cenario;
    private PacMan pacman;
    private int largura, altura;
    // LISTA DE BLOCOS
        ArrayList<Bloco> listaBloco;
    // LISTA DE PONTOS
        ArrayList<Ponto> listaPonto;
        ////////////
    // CONSTRUTOR DA CLASSE
    public Controle(){
        
        this.largura = 500;
        this.altura = 500;
        // INICIALIZANDO O CENARIO
        cenario = new Cenario(largura, altura);
        // ADICIONANDO FUNÇÕES AO CLICAR NO CENARIO
        addClique();
        // ADICIO BLOCOS NO CENARIO
        addBloco();
        // ADICIONANDO OBJETO PAC MAN
        addPacMan();
        //ADICIONANDO PONTOS NO CENÁRIO
        addPonto();
    }
    public void addPacMan(){
        pacman = new PacMan(this.largura / 2, this.altura / 2);
        this.cenario.addPacMan(pacman);
    }
    
    public static void main(String[] args){
        new Controle();
    }
        public void addClique(){
        this.cenario.addKeyListener(new java.awt.event.KeyAdapter() {
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
        int minX, minY, maxX, maxY;
        minX =  Math.min(pacman.getX(), pacman.getX() + dx);
        minY =  Math.min(pacman.getY(), pacman.getY() +  dy);
        maxX =  Math.max(pacman.getX() + 40, pacman.getX() + dx + 40);
        maxY =  Math.max(pacman.getY() + 40, pacman.getY() + dy + 40);
        // VERIFICANDO SE HÁVERA CONTATO ENTRE PACMAN E BLOCOS
        for(Bloco b: listaBloco)
            if(minX < b.getX() + b.getWidth() && maxX > b.getX()
                    && minY < b.getY() + b.getHeight() && maxY > b.getY())
                return;
        pacman.mover(pacman.getX() + dx, pacman.getY() + dy);
        
    }
    public void addBloco(){
        listaBloco = new ArrayList<Bloco>();
        Bloco b1, b2, b3, b4,b5, b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
        //  LATERAL (esquerdo, posição,
        b1 = new Bloco(0,0,30,500);
        b2 = new Bloco(30,0,440,70);
        b3 = new Bloco(30,440,460,70);
        b4 = new Bloco(470,0,30,500);
        //   ESQUERDA
        b5 = new Bloco(70,120,80,40);
        b6 = new Bloco(70,160,40,80);
        b7 = new Bloco(70,280,40,80);
        b8 = new Bloco(70,360,80,40);
        b9 = new Bloco(150,200,40,120);
        //  BARRA CENTRAL
        b10 = new Bloco(190,120,120,40);
        b11 = new Bloco(190,360,120,40);
        
        //  DIREITA
        b12 = new Bloco(310,200,40,120);
        b13 = new Bloco(350,120,80,40);
        b14 = new Bloco(350,360,80,40);
        b15 = new Bloco(390,160,40,80);
        b16 = new Bloco(390,280,40,80);
        
        
        listaBloco.add(b1);
        listaBloco.add(b2);
        listaBloco.add(b3);
        listaBloco.add(b4);
        listaBloco.add(b5);
        listaBloco.add(b6);
        listaBloco.add(b7);
        listaBloco.add(b8);
        listaBloco.add(b9);
        listaBloco.add(b10);
        listaBloco.add(b11);
        listaBloco.add(b12);
        listaBloco.add(b13);
        listaBloco.add(b14);
        listaBloco.add(b15);
        listaBloco.add(b16);
        
        for(Bloco b : listaBloco){
            this.cenario.add(b);
            b.repaint();
        }
    }
        public void addPonto(){
            listaPonto = new ArrayList<Ponto>();
            for(int i = 0; i<15; i++)
                for (int j = 0; j<17; j++){
                    if(i * 40 + 10 < 500 && j * 40 + 20 < 500 && !Pety(i * 40 + 10, j * 40 + 20)){
                        Ponto p = new Ponto(i * 40 + 5, j * 40+10);
                        listaPonto.add(p);
                        this.cenario.add(p);
                        p.repaint();
                    }
                }
        }
        public boolean Pety(int x, int y){
            for(Bloco b : listaBloco)
                if(b.getX() < x && b.getX() + b.getWidth() > x
                        && b.getY() < y && b.getY() + b.getHeight() > y)
                    return true;
            return false;
        }
    }

