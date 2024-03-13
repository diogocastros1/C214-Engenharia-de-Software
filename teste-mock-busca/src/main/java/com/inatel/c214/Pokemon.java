package main.java.com.inatel.c214;

public class Pokemon {

    private String nome;
    private double qtdVida;
    private String arma;

    public Pokemon (String nome, double qtdVida, String arma){
        this.nome = nome;
        this.qtdVida = qtdVida;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtdVida() {
        return qtdVida;
    }

    public void setQtdVida(double qtdVida) {
        this.qtdVida = qtdVida;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}