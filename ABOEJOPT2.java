import javax.swing.JOptionPane;

public class ABOEJOPT2 {
    public static void main (String[] args){

        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                JOptionPane.showMessageDialog(null,i + ", ");
                if (i % 20 == 0){
                    System.out.println();
                }
            }
        }
    }
}
