import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment4JavaBufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your height (in cm): ");
            double height = Double.parseDouble(reader.readLine());

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter citizenship code ('C' for Endor, 'N' for non-citizen): ");
            char citizenship = reader.readLine().toUpperCase().trim().charAt(0);

            System.out.print("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee): ");
            char recommendee = reader.readLine().toUpperCase().trim().charAt(0);


            if (recommendee == 'R') {
                System.out.println("Result: ACCEPTED (Automatic Acceptance via Master Obi Wan)");
            }

            else if (height >= 200 && (age >= 21 && age <= 25) && citizenship == 'C') {
                System.out.println("Result: ACCEPTED");
            }
            else {
                System.out.println("Result: REJECTED");
            }

        } catch (IOException e) {
            System.out.println("Error input.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid NUMBERS for height and age.");
        }
    }
}