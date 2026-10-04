import javax.swing.JOptionPane;

public class Assignment3JavaJOption {
    public static void main(String[] args) {
        try {
            String salaryStr = JOptionPane.showInputDialog("Enter monthly salary of parents: ");
            double salary = Double.parseDouble(salaryStr);

            String nsatStr = JOptionPane.showInputDialog("Enter NSAT score: ");
            double nsat = Double.parseDouble(nsatStr);

            String entranceStr = JOptionPane.showInputDialog("Enter entrance examination score: ");
            double entrance = Double.parseDouble(entranceStr);

            String result;
            if (salary > 10000 || nsat < 90 || entrance < 85) {
                result = "REJECTED";
            }
            else if (salary <= 3500 && ((nsat + entrance) / 2.0 >= 91)) {
                result = "ACCEPTED";
            }
            else {
                result = "FOR FURTHER STUDY";
            }

            JOptionPane.showMessageDialog(null, "Application Result: " + result);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR INPUT");
        }
    }
}