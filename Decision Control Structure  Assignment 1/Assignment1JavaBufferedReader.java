import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment1JavaBufferedReader {
    public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Input year: ");
            int year = Integer.parseInt(dataIn.readLine());

            if (year % 400 == 0) {
                System.out.println("IT IS A LEAP YEAR");
            }
            else if (year % 100 == 0) {
                System.out.println("IT IS NOT A LEAP YEAR");
            }
            else if (year % 4 == 0) {
                System.out.println("IT IS A LEAP YEAR");
            }
            else {
                System.out.println("IT IS NOT A LEAP YEAR");
            }

        } catch (IOException e) {
            System.out.println("ERROR reading input.");
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Please enter a valid whole number.");
        }
    }
}