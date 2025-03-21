import javax.swing.JOptionPane;

/* 2- Ler coeficientes reais a, b e c de uma equação de segundo grau e exibir a(s) raiz(es),
caso exista(m). Lembretes: Calcule o valor de delta. Se ele for negativo, não há
raízes.. Se for igual a zero, há uma única raiz. Se delta for maior do que zero, então
há duas raízes.*/
public class Exerc2 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente c:"));

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Não há raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "Existe uma única raiz: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "As raízes são: " + raiz1 + " e " + raiz2);
        }
    }
}