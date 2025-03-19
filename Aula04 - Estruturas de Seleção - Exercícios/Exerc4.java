import javax.swing.JOptionPane;

// Exercício 4: Exibir o dia da semana correspondente a um número
public class Exerc4 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7:"));
        String diaSemana;
        if (dia == 1) {
            diaSemana = "Domingo";
        } else if (dia == 2) {
            diaSemana = "Segunda-feira";
        } else if (dia == 3) {
            diaSemana = "Terça-feira";
        } else if (dia == 4) {
            diaSemana = "Quarta-feira";
        } else if (dia == 5) {
            diaSemana = "Quinta-feira";
        } else if (dia == 6) {
            diaSemana = "Sexta-feira";
        } else if (dia == 7) {
            diaSemana = "Sábado";
        } else {
            diaSemana = "Número inválido! Digite um número entre 1 e 7.";
        }
        JOptionPane.showMessageDialog(null, diaSemana);
    }
}