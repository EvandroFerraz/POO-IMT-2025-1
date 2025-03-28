import javax.swing.JOptionPane;
public class ExemploDoWhile{
    public static void main(String[] args){
        double nota1, nota2;
        int contador = 10; // a condição do laço será falsa, neste exemplo, pois contador = 10
        do{ // independente da condição do laço ser falsa ou não, o código no laço é executado a primeira vez
            nota1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota 1:")
            );
            nota2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota 2:")
            );
            JOptionPane.showMessageDialog(null,(nota1+nota2)/2);
            contador = contador + 1;
        }while(contador <= 5); // a condição é falsa, então o código no laço não é repetido
    }
}