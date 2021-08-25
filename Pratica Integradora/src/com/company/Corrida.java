package com.company;

import java.util.List;

public class Corrida {
    public double distancia;
    public double premioEmDolares;
    public String nome;
    public int quantidadeDeVeicular;
    public List<Veiculo> listaDeVeiculos;

    public void adicionarCarro (int velocidade, double aceleracao, double anguloDeVirada, String patente){
     Carro carro = new Carro(velocidade, aceleracao, anguloDeVirada, patente);
     if (listaDeVeiculos.size() < 10){
      listaDeVeiculos.add(carro);
     }
     else {
         System.out.println("Limite atingido.");
     }
    }

    public void adicionarMoto (int velocidade, double aceleracao, double anguloDeVirada, String patente){
        Motos moto = new Motos(velocidade,aceleracao,anguloDeVirada,patente);
        if (listaDeVeiculos.size() < 10){
            listaDeVeiculos.add(moto);
        }

    }

    public void removerVeiculo (Veiculo veiculo){
        for (int i = 0; i < listaDeVeiculos.size(); i++){
            if(listaDeVeiculos.get(i).patente == veiculo.patente){
                listaDeVeiculos.remove(veiculo);
            }
        }

    }
    public void removeVeiculoPatente(String patente){
        for (int i = 0; i < listaDeVeiculos.size(); i++){
            if(listaDeVeiculos.get(i).patente == patente){
                listaDeVeiculos.remove(listaDeVeiculos.get(i));
            }
        }

    }
    public void vencedorDaCorrida (){
        double vencedor = 0;
        for (int a = 0; a < listaDeVeiculos.size(); a++) {
            double resultadoConta = listaDeVeiculos.get(a).velelocidade * (listaDeVeiculos.get(a).aceleracao) / (listaDeVeiculos.get(a).anguloDeVirada) * (listaDeVeiculos.get(a).anguloDeVirada * (listaDeVeiculos.get(a).peso - listaDeVeiculos.get(a).rodas * 100));
            if (resultadoConta > vencedor){
                vencedor = resultadoConta;

            }
        }


    }
    public void SocorristaDeCarro (){
        SocorristaCarro socorristaDeCarro = new SocorristaCarro();
    }

    public void SocorristaDeMoto (){
        SocorristaMoto socorristaMoto = new SocorristaMoto();

    }
    public void SocorrerCarro(String patente){
        for (int c = 0; c < listaDeVeiculos.size(); c++){
            if(listaDeVeiculos.get().patente == patente){
                listaDeVeiculos.remove(listaDeVeiculos.get(c));
            }
        }

    }
    public void SocorrerMoto(String patente){
        for (int d = 0; d < listaDeVeiculos.size(); d++){
            if(listaDeVeiculos.get().patente == patente){
                listaDeVeiculos.remove(listaDeVeiculos.get(d));
            }
        }

    }



}

