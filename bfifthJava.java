import java.util.Scanner;
import java.util.InputMismatchException; // Import the specific exception
public class bfifthJava {
    public static void main(String[] args) {

        Scanner inputDevice = new Scanner(System.in);
        try {
            System.out.print("Please enter your name: ");
            String name = inputDevice.nextLine();
            System.out.print("Please enter your age: ");
            int age = inputDevice.nextInt();

            System.out.println("Your name is " + name + " and you are " + age + " years old.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Age must be a whole number.");
        } } }