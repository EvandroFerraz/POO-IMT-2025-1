import javax.swing.JOptionPane;

public class ExemploWhile{
    public static void main(String[] args){
        double nota1, nota2;
        
        // 1- criar e atribuir um valor inicial para a variável contador
        int i = 1;

        // 2- comando do laço com condição de parada
        while(i <= 5){
            // 1ª iteração, i = 1, entao 1 <= 5 é verdadeiro
            // 2ª iteração, i = 2, então 2 <= 5 é verdadeiro
            // 3ª iteração, i = 3, então 3 <= 5 é verdadeiro
            // 4ª iteração, i = 4, então 4 <= 5 é verdadeiro
            // 5ª iteração, i = 5, então 5 <= 5 é verdadeiro
            // 6ª iteração, i = 6, então 6 <= 5 é FALSA, 
            // o laço termina e a 6ª iteração não acontece

            nota1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota1:")
            );
            nota2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota2:")
            );

            JOptionPane.showMessageDialog(null, i + " " + "Media: " + (nota1+nota2)/2);

            //3- atualizar o valor da variável contador
            i++; // i = i + 1
        }
    }
}