import javax.swing.JOptionPane;
public class bsixthJava {
    public static void main (String[] args){

        String name = JOptionPane.showInputDialog("Please enter your name: ");
        String msg = "Hello " + name + "!";

        JOptionPane.showMessageDialog(null, msg);
    }}