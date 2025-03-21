import javax.swing.JOptionPane;

// Exercício 6: Verificar se um ano é bissexto
public class Exerc6 {
    public static void main(String[] args) {
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano:"));
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            JOptionPane.showMessageDialog(null, "O ano é bissexto.");
        } else {
            JOptionPane.showMessageDialog(null, "O ano não é bissexto.");
        }
    }
}