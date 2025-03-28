import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que verifica se um número natural digitado pelo usuário é primo.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural:"));
        boolean primo = true; // assumimos inicialmente que o número digitado pelo usuário é um número primo
        
        if (numero <= 1) { // números negativos, o número 0 e o número 1 não são primos
            primo = false;
        } else {
            // se o número for divisível por um número entre 2 e número-1 sabemos que ele não é primo, pois um número primo é divisível apenas por 1 e por ele mesmo.
            for (int i = 2; i < numero; i++) { //o contador i percorrerá o intervalo desde 2 até número-1
                if (numero % i == 0) { // verifica se numero é divisível por i, se for então sabemos que o número não é primo
                    primo = false;
                    break; // sai do laço de repetição antes de concluir todas as iterações caso já seja definido que o número não é primo
                }
            }
        }
        if (primo) { // primo == true
            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
        }
    }
}
