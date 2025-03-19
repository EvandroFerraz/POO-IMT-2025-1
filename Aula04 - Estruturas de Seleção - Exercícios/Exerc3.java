import javax.swing.JOptionPane;

// Exercício 3: Encontrar o maior valor entre três números distintos
// && = Operador Lógico AND (E)
public class Exerc3 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if (num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num1);
        } else if (num2 > num1 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "O maior número é " + num3);
        }
    }
}
