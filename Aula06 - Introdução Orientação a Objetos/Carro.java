package com.mycompany.testecarro;

public class Carro {  
    // Exerc1 - criar dois atributos
    private String marca;
    private double velocidade;
      
    // Exerc3 - cria um construtor que inicializa os 2 atributos
    public Carro(String marcaInicial, double velocidadeInicial){
        marca = marcaInicial;
        velocidade = velocidadeInicial;
    }
    
    // Exerc1 - criar dois métodos
    public void acelerar(double numero){
        velocidade = velocidade + numero;
    }
    public void desacelerar(double numero){
        velocidade = velocidade - numero;
    }
    
    // Exerc1 - getters e setters dos dois atributos
    // getters
    public String getMarca() {
        return marca;
    }
    public double getVelocidade() {
        return velocidade;
    }
    // setters
    public void setMarca(String novaMarca) {
        marca = novaMarca;
    }
    public void setVelocidade(double novaVelocidade) {
        velocidade = novaVelocidade;
    }   
}
