import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible integer value

        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();

            if (number > largest) {
                largest = number; // Update the largest number if the input is greater
            }
        } while (number != 0);

        if (largest == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number is: " + largest);
        }

        scanner.close();
    }
}
