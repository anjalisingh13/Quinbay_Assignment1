import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            // Check if the number has more than one digit
            if (Math.abs(number) >= 10) {
                // Throwing custom exception if number has more than one digit
                throw new MoreThanOneDigitException("Number has more than one digit.");
            } else {
                // No exception, proceed normally
                System.out.println("The number is a valid single-digit number: " + number);
            }
        } catch (MoreThanOneDigitException e) {
            // Catching the custom exception and printing the message
            System.out.println("Exception: " + e.getMessage());
        } finally {
          
            scanner.close();
        }
    }
}
