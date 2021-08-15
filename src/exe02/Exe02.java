package exe02;

import javax.swing.JOptionPane;

public class Exe02 {
    public static void main(String[] args) {
        int n1, n2;
        String n1S;
        String n2S;
        
        n1S = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        n1 = Integer.parseInt(n1S);
        n2S = JOptionPane.showInputDialog("Digite o segundo numero: ");
        n2 = Integer.parseInt(n2S);
        
        if (n1 >= 1 && n1 <= 10 && n2 >=  1 && n2 <= 10) {
            if ((n1 + n2) < 8) {
                JOptionPane.showMessageDialog(null, "A média dos números é " + (n1 + n2) / 2, "Números válidos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "A soma dos números não pode ser igual ou maior que 8", "Números inválidos", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os números precisam ser entre 1 e 10", "Números inválidos", JOptionPane.ERROR_MESSAGE);
        } 
    }
}
