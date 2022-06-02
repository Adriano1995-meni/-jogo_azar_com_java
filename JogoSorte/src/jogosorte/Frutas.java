package jogosorte;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.ImageIcon;

/**
 *
 * @author Utilizador
 */
public class Frutas {

    public Frutas(String nome, int valor, ImageIcon img) {
        this.nome = nome;
        this.valor = valor;
        this.img = img;
    }
    
    private String nome;
    private int valor;
    private ImageIcon img;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return nome + "," + valor ;
    }
    
    
    
}
