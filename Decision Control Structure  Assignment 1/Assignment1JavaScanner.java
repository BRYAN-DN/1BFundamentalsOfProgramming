import java.util.Scanner;
import java.util.InputMismatchException;
public class Assignment1JavaScanner {

    public static void main (String[] args){

     Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER YEAR: ");
        int year = scanner.nextInt();

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

    }
}