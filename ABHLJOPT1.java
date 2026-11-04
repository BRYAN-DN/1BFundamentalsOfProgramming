import javax.swing.JOptionPane;
public class ABHLJOPT1 {
    public static void main (String[] args){

        JOptionPane.showMessageDialog(null,"ENTER 10 NUMBER");

        String num = JOptionPane.showInputDialog("Number 1: ");
        int nums = Integer.parseInt(num);

        int hghst = nums;
        int lwst = nums;

        for (double i = 2; i <= 10; i++){

            String numm = JOptionPane.showInputDialog("Number" + i + ": ");
            nums = Integer.parseInt(numm);

            if (nums > hghst){
                hghst = nums;
            }
            if (nums < lwst){
                lwst = nums;
            }

        }
        JOptionPane.showMessageDialog(null, "HIGHEST: "+ hghst);
        JOptionPane.showMessageDialog(null, "LOWEST: "+ lwst);

    }
}
