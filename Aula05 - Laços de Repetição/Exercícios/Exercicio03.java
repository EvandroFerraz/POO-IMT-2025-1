import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que calcula o fatorial de um valor natural digitado pelo usuário.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural:"));
        long fatorial = 1;
        
        // Verifica se é número natural
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Número inválido. Digite um número natural (maior ou igual a zero).");
        } else {
            // calcula o fatorial de numero
            long fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
        }
    }
}
