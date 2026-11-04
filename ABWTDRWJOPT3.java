import javax.swing.JOptionPane;
public class ABWTDRWJOPT3 {
    public static void main (String[] args){

        double bal = 20000;

        String typ = JOptionPane.showInputDialog("(+) TO DEPOSIT. (-) TO WITHDRAW: ");
        char type = typ.trim().charAt(0);
        String amnt = JOptionPane.showInputDialog("ENTER AMOUNT: ");
        double amntt = Double.parseDouble(amnt);

        if (type == '+'){
            bal += amntt;
            JOptionPane.showMessageDialog(null, "DEPOSIT SUCCESSFUL!");
            JOptionPane.showMessageDialog(null,"OUTSTANDING BALANCE: "+ bal);
        }
        else if (type == '-' && amntt < bal) {
            bal -= amntt;
            JOptionPane.showMessageDialog(null, "WITHDRAWAL SUCCESSFUL!");
            JOptionPane.showMessageDialog(null,"OUTSTANDING BALANCE: "+ bal);
        }
        else if (type == '-' && amntt > 20000){
            JOptionPane.showMessageDialog(null,"INSUFFICIENT FUNDS!");
        }

    }
}
