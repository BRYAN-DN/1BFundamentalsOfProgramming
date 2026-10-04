import javax.swing.JOptionPane;
public class Assignment2JavaJOption {

    public static void main (String[] args){

        String hprr = JOptionPane.showInputDialog("ENTER YOUR HOURLY PAY RATE: ");
        double hpr = Double.parseDouble(hprr);
        String hww = JOptionPane.showInputDialog("ENTER HOURS WORKED: ");
        double hw = Double.parseDouble(hww);

        double grossp = hpr * hw;

        double taxr = 0.0;
        if (grossp <= 2000.00) {
            taxr = 0.10;
        } else if (grossp <= 4000.00) {
            taxr = 0.12;
        } else if (grossp <= 10000.00) {
            taxr = 0.15;
        } else {
            taxr = 0.20;
        }

        double wthTax = grossp * taxr;
        double netPay = grossp - wthTax;

        JOptionPane.showMessageDialog(null, "Gross Pay: Php " + grossp);
        JOptionPane.showMessageDialog(null, "Withholding Tax: Php " + wthTax);
        JOptionPane.showMessageDialog(null, "Net Pay: Php " + netPay);
    }
}