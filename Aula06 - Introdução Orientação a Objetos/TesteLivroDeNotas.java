package com.mycompany.testelivrodenotas;

import javax.swing.JOptionPane;

public class TesteLivroDeNotas {

    public static void main(String[] args) {
        // utilizamos o construtor para criar um objeto da classe LivroDeNotas
        // cria o objeto livro1 já com o valor inicial "Matematica" em seu atributo nomeDoCurso
        LivroDeNotas livro1 = new LivroDeNotas("Matemática");
        // cria o objeto livro2 já com o valor inicial "Biologia" em seu atributo nomeDoCurso
        LivroDeNotas livro2 = new LivroDeNotas("Biologia");
        
        // imprime o atributo nomeDoCurso dos dois objetos criados, utilizando o método get
        // para ter acesso ao valor do atributo
        System.out.println("Livro1: \n " + livro1.getNomeDoCurso());
        System.out.println("Livro2: \n " + livro2.getNomeDoCurso());
        
        // pede para o usuário digitar o nome de um novo curso para o livro1
        String novoNome = JOptionPane.showInputDialog("Digite um novo nome para o curso do livro1: ");
        // atribui o novo nome de curso para o livro1 utilizando o método set
        livro1.setNomeDoCurso(novoNome);
        // exibe a mensagem de boas vindas do com nome do curso atualizado
        livro1.exibirMensagem();
    }
}
