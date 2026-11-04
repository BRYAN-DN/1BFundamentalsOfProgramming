import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ABWTDRWBFFR3 {
    public static void main(String[] args) throws IOException {

        BufferedReader bff = new BufferedReader(new InputStreamReader(System.in));

        double bal = 20000;

        System.out.print("(+) TO DEPOSIT. (-) TO WITHDRAW: ");
        char type = bff.readLine().trim().charAt(0);
        System.out.print("ENTER AMOUNT: ");
        double amnt = Double.parseDouble(bff.readLine());

        if (type == '+'){
            bal += amnt;
            System.out.println("DEPOSIT SUCCESSFUL!");
            System.out.println("OUTSTANDING BALANCE: "+ bal);
        }
        else if (type == '-' && amnt < bal) {
            bal -= amnt;
            System.out.println("WITHDRAWAL SUCCESSFUL!");
            System.out.println("OUTSTANDING BALANCE: "+ bal);
        }
        else if (type == '-' && amnt > 20000){
            System.out.println("INSUFFICIENT FUNDS!");
        }

    }
}