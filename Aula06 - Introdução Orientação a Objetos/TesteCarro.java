package com.mycompany.testecarro;

import javax.swing.JOptionPane;

public class TesteCarro {
    public static void main(String[] args) {
        // Exerc2 - instancia dois carros: cria dois objetos da classe Carro
        // Exerc4 - ajustes necessários: Passar valores iniciais para os atributos como parâmetros do construtor
        Carro carro1 = new Carro("fusca", 100);
        Carro carro2 = new Carro("outro fusca", 50);
        
        // Exerc2 - obtém valores para seus atributos e os atribui para os atributos dos objetos carro1 e carro2
        // Exerc2 - chama cada um dos métodos que você criou
        String marca1 = JOptionPane.showInputDialog("Digite a marca do carro 1:");
        carro1.setMarca(marca1);
        String marca2 = JOptionPane.showInputDialog("Digite a marca do carro 2:");
        carro2.setMarca(marca2);   
        double velocidade1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a velocidade do carro 1:")
        );
        carro1.setVelocidade(velocidade1);
        double velocidade2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a velocidade do carro 2:")
        );
        carro2.setVelocidade(velocidade2);
        
        // Exibe os valores dos atributos utilizam os getters
        System.out.println("Carro1: \n Marca: " + carro1.getMarca() + " Velocidade: " + carro1.getVelocidade());
        System.out.println("Carro2: \n Marca: " + carro2.getMarca() + " Velocidade: " + carro2.getVelocidade());
        
        carro1.acelerar(100); // aumenta a velocidade atual do carro1 em 100
        carro2.desacelerar(20); // diminui a velocidade atual do carro2 em 20
        
        // Exibe os valores das velocidades atualizadas
        System.out.println("Carro1 \n: Velocidade: " + carro1.getVelocidade());
        System.out.println("Carro2 \n: Velocidade: " + carro2.getVelocidade());
    }
}
