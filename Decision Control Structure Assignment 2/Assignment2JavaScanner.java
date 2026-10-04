import java.util.Scanner;
public class Assignment2JavaScanner {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER YOUR HOURLY PAY RATE: ");
        double hpr = scanner.nextDouble();
        System.out.println("ENTER HOURS WORKED: ");
        double hw = scanner.nextDouble();

        double grossp = hpr * hw;

        double taxr = 0.0;
        if (grossp <= 2000.00){
             taxr = 0.10;
        }
        else if (grossp <= 4000.00){
             taxr = 0.12;
        } else if (grossp <= 10000.00) {
             taxr = 0.15;
        }
        else{
             taxr = 0.20;
        }

        double wthTax = grossp * taxr;
        double netPay = grossp - wthTax;

        System.out.println("Gross Pay: Php " + grossp);
        System.out.println("Withholding Tax: Php " + wthTax);
        System.out.println("Net Pay: Php " + netPay);
    }
}
