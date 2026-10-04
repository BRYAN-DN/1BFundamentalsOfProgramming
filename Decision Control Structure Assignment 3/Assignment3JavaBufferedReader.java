import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment3JavaBufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter parents' monthly salary: ");
            double salary = Double.parseDouble(reader.readLine());

            System.out.print("Enter NSAT score: ");
            double nsat = Double.parseDouble(reader.readLine());

            System.out.print("Enter entrance examination score: ");
            double entraS = Double.parseDouble(reader.readLine());

            if (salary > 10000 || nsat < 90 || entraS < 85) {
                System.out.println("Result: REJECTED");
            }
            else if (salary <= 3500 && ((nsat + entraS) / 2 >= 91)) {
                System.out.println("Result: ACCEPTED");
            }
            else {
                System.out.println("Result: FOR FURTHER STUDY");
            }

        } catch (IOException e) {
            System.out.println("Error reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }
    }
}