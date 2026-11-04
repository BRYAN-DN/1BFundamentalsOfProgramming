import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ABHLBFFR1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bff = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ENTER 10 NUMBERS");

        System.out.print("Number 1: ");
        int nums = Integer.parseInt(bff.readLine());

        int hghst = nums;
        int lwst = nums;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            nums = Integer.parseInt(bff.readLine());

            if (nums > hghst) {
                hghst = nums;
            }
            if (nums < lwst) {
                lwst = nums;
            }
        }

        System.out.println("HIGHEST NUMBER: " + hghst);
        System.out.println("LOWEST NUMBER: " + lwst);

    }
}