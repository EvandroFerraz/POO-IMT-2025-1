// Exemplo de quando o while é recomendado
// Quando usar o while?
// R: Quando não é possível calcular quantas iterações o laço vai ter.
// Ex: Quando o número de iterações depende do usuário
// Escreva um algoritmo que recebe vários número positos e retorna a soma deles. 
// O algoritmo deve pedir números para o usuário até que ele digite um número negativo

import javax.swing.JOptionPane;
public class UsoWhile{
    public static void main(String[] args){
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um numero positivo: ")
        );
        int soma = 0;

        while(numero > 0){ // entra no while se o numero digitado pelo usuário é positivo
            soma += numero; // soma = soma + numero

            numero = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um numero positivo: ")
            );
        }
        JOptionPane.showMessageDialog(null,soma);
    }
}