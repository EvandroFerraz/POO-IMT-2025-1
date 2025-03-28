import javax.swing.JOptionPane;

public class ExemploFor{
    public static void main(String[] args){
        double nota1, double nota2;
        // Quando usar o for?
        // R: Quando for possível calcular o número de iterações que o laço vai ter
        for(int i = 1; i <= 5; i++){ // i = i + 1
            nota1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota1:")
            );
            nota2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota2:")
            );
            JOptionPane.showMessageDialog(null,"i: " + i + " " + (nota1+nota2)/2);
        }
    }
}