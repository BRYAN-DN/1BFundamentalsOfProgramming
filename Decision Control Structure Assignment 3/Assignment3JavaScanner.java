import java.util.Scanner;

public class Assignment3JavaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter parents' monthly salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter NSAT score: ");
        double nsat = scanner.nextDouble();

        System.out.print("Enter entrance examination score: ");
        double entrance = scanner.nextDouble();

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Result: REJECTED");
        }
        else if (salary <= 3500 && ((nsat + entrance) / 2.0 >= 91)) {
            System.out.println("Result: ACCEPTED");
        }
        else {
            System.out.println("Result: FOR FURTHER STUDY");
        }

        scanner.close();
    }
}