import java.util.Scanner;

public class Assignment4JavaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your citizenship code ('C' for Endor, 'N' for non-citizen): ");
        char citizenship = scanner.next().trim().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee): ");
        char recommendee = scanner.next().trim().toUpperCase().charAt(0);

        // Evaluation Logic
        if (recommendee == 'R') {
            System.out.println("Result: ACCEPTED (Recomendee of Master Obi Wan)");
        }
        else if (height >= 200 && (age >= 21 && age <= 25) && citizenship == 'C') {
            System.out.println("Result: ACCEPTED");
        }
        else {
            System.out.println("Result: REJECTED");
        }
    }
}