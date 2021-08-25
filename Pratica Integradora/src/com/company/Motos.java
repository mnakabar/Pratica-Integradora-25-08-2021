package com.company;

public class Motos extends Veiculo{
    public Motos (int velocidade, double aceleracao, double anguloDeVirada, String patente){
        this.velelocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
        this.patente = patente;
        this.rodas = 2;
        this.peso = 300;
    }
}
