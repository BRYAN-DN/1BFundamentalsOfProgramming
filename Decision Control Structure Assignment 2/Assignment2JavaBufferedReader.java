import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment2JavaBufferedReader {

    public static void main(String[] args) {

        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("ENTER YOUR HOURLY PAY RATE: ");
            double hpr = Double.parseDouble(dataln.readLine());

            System.out.println("ENTER YOUR HOURS WORKED: ");
            double hw = Double.parseDouble(dataln.readLine());

            double grossp = hpr * hw;

            double taxr = 0.0;
            if (grossp <= 2000.00) {
                taxr = 0.10;
            } else if (grossp <= 4000.00) {
                taxr = 0.12;
            } else if (grossp <= 10000.00) {
                taxr = 0.15;
            } else {
                taxr = 0.20;
            }

            double wthTax = grossp * taxr;
            double netPay = grossp - wthTax;

            System.out.println("Gross Pay: Php " + grossp);
            System.out.println("Withholding Tax: Php " + wthTax);
            System.out.println("Net Pay: Php " + netPay);

        } catch (IOException e) {
            System.out.println("ERROR reading input.");
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Please enter a valid number.");
        }
    }
}