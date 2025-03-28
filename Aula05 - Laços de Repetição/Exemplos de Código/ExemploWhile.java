import javax.swing.JOptionPane;

public class ExemploWhile{
    public static void main(String[] args){
        double nota1, nota2;

        //1 - criar uma variável contadora e atribuir um valor inicial
        int i = 1; // i é nossa variável contadora

        //2- definir uma condição de parada
        while(i <= 5){
            nota1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota1:")
            );
            nota2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota2:")
            );
            JOptionPane.showMessageDialog(null,"i: " + i + " " + (nota1+nota2)/2);

            // Teste de Mesa
            // 1º iteração: i = 1; 1 <= 5: Verdadeiro; i = 1 + 1 = 2
            // 2º iteração: i = 2; 2 <= 5: Verdadeiro; i = 2 + 1 = 3
            // 3º iteração: i = 3; 3 <= 5: Verdadeiro; i = 3 + 1 = 4
            // 4º iteração: i = 4; 4 <= 5: Verdadeiro; i = 4 + 1 = 5
            // 5º iteração: i = 5; 5 <= 5: Verdadeiro; i = 5 + 1 = 6
            // 6º iteração: i = 6; 6 <= 5: FALSO; Sair do laço.

            // 3- atualizar o valor da variável contadora
            i++; // i = i + 1
        }
    }
}