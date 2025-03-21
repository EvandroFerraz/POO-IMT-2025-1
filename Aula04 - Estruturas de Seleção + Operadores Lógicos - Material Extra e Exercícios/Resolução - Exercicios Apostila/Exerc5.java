import javax.swing.JOptionPane;

// Exercício 5: Exibir o número de dias de um mês
// || representa o operador lógico OU
public class Exerc5 {
    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 12 representando o mês:"));
        String diasMes;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diasMes = "Este mês tem 31 dias.";
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasMes = "Este mês tem 30 dias.";
        } else if (mes == 2) {
            diasMes = "Fevereiro pode ter 28 ou 29 dias dependendo se o ano é bissexto.";
        } else {
            diasMes = "Número inválido! Digite um número entre 1 e 12.";
        }
        JOptionPane.showMessageDialog(null, diasMes);
    }
}