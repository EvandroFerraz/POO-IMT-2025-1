package com.mycompany.testelivrodenotas;

public class LivroDeNotas {   
    // seguindo o Encapsulamento, todos os atributos devem ser privados
    private String nomeDoCurso;

    // método construtor: serve para criar objetos da classe
    //  - deve ter o mesmo nome que a classe
    //  - serve para inicializar as variáveis de instância (outro nome para atributos)
    //  - ou seja, permite criar um objeto já com um valores iniciais para seus atributos
    public LivroDeNotas(String novoNome){
        nomeDoCurso = novoNome;
    }
    
    // método que imprime uma mensagem de boas vindas no terminal
    public void exibirMensagem(){
        // concatena o valor atual do atributo nomeDoCurso à mensagem
        System.out.println("Bem vindo ao livro de notas do curso " + nomeDoCurso);
    }
    
    // método get
    // serve para retornar o valor atual de um atributo
    // é um método de consulta, utilizamos para saber qual o valor atual guardado em um atributo da classe
    public String getNomeDoCurso(){
        return nomeDoCurso;
    }
    
    // método set
    // serve para atualizar o valor de um atributo
    // é um método de modificação, recebe um novo valor por parâmetro e atribui esse novo valor ao atributo
    public void setNomeDoCurso(String novoValor){
        nomeDoCurso = novoValor;
    }
}
