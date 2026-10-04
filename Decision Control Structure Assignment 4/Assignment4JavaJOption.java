import javax.swing.JOptionPane;

public class Assignment4JavaJOption {
    public static void main(String[] args) {
        try {
            String heightStr = JOptionPane.showInputDialog("Enter your height (in cm):");
            double height = Double.parseDouble(heightStr);

            String ageStr = JOptionPane.showInputDialog("Enter your age:");
            int age = Integer.parseInt(ageStr);

            String citizenshipStr = JOptionPane.showInputDialog("Enter citizenship code ('C' for Endor, 'N' for non-citizen):");
            char citizenship = citizenshipStr.trim().toUpperCase().charAt(0);

            String recommendeeStr = JOptionPane.showInputDialog("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee):");
            char recommendee = recommendeeStr.trim().toUpperCase().charAt(0);

            String result;

            if (recommendee == 'R') {
                result = "ACCEPTED (Recomendee of Master Obi Wan)";
            }
            else if (height >= 200 && (age >= 21 && age <= 25) && citizenship == 'C') {
                result = "ACCEPTED";
            }
            else {
                result = "REJECTED";
            }

            JOptionPane.showMessageDialog(null, "Application Result: " + result);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please enter valid numbers for height and age.");
        }
    }
}