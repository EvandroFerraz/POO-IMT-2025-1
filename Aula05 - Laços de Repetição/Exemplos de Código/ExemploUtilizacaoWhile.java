// Quando uitilizar o while?
// Quando o número de iterações não pode ser calculado (não é um valor fixo)
// Exemplo:  Escreva um algoritmo que recebe varios numeros positivos e retorna a soma
// desses numeros. O algoritmo deve parar de pedir por numeros quando o usuario escrever
// um numero negativo.

import javax.swing.JOptionPane;
public class ExemploUtilizacaoWhile{
    public static void main(String[] args){

        double numero = Double.parseDouble(
            // se negativo para o laço
            JOptionPane.showInputDialog("Digite um numero positivo:")
        );
        double soma = 0;

        // criterio de parada que depende do usuario
        while(numero >= 0){
            soma = soma + numero;
            numero = Double.parseDouble(
                JOptionPane.showInputDialog("Digite um numero positivo:")
            );
        }
        JOptionPane.showMessageDialog(null,"Soma dos Positivos: " + soma);
    }
}