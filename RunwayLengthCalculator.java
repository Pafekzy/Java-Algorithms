package DeitelChapter2Algorithm;

import java.util.Scanner; // Import Scanner class for user input

public class RunwayLengthCalculator {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // Create a Scanner object to read input

        // Prompt the user to enter the speed (v) and acceleration (a)
        System.out.print("Enter speed (m/s) and acceleration (m/s²): ");
        double speedMps = inputScanner.nextDouble(); // Read speed input
        double accelerationMpsSquared = inputScanner.nextDouble(); // Read acceleration input

        // Declare a variable for runway length calculation
        double minimumRunwayLength;

        // Ensure that acceleration is not zero to prevent division by zero
        if (accelerationMpsSquared > 0) {
            // Calculate minimum runway length using the formula: length = v² / (2 * a)
            minimumRunwayLength = (speedMps * speedMps) / (2 * accelerationMpsSquared);

            // Output the calculated minimum runway length
            System.out.printf("The minimum runway length for this airplane is %.3f meters.\n", minimumRunwayLength); // Format output to three decimal places
        } else {
            // Inform the user that the acceleration must be positive
            System.out.println("Acceleration must be greater than zero.");
        }

        inputScanner.close(); // Close the scanner to free resources
    }
}