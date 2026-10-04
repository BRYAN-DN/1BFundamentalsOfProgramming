import javax.swing.JOptionPane;
public class Assignment1JavaJOption {

    public static void main(String[] args) {

        String iny = JOptionPane.showInputDialog("INPUT YEAR: ");
        int year = Integer.parseInt(iny);

        if (year % 400 == 0) {
            JOptionPane.showMessageDialog(null, "IT IS A LEAP YEAR");
        }
        else if (year % 100 == 0) {
            JOptionPane.showMessageDialog(null, "IT IS NOT A LEAP YEAR");
        }
        else if (year % 4 == 0) {
            JOptionPane.showMessageDialog(null, "IT IS A LEAP YEAR");
        }
        else {
            JOptionPane.showMessageDialog(null, "IT IS NOT A LEAP YEAR");
        }
    }
}