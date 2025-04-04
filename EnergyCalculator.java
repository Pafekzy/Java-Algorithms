package DeitelChapter2Algorithm;

import java.util.Scanner; // Import Scanner for user input

public class EnergyCalculator {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMassKilograms = inputScanner.nextDouble(); // Read the mass of water

        // Prompt the user to enter the initial temperature
        System.out.print("Enter the initial temperature in degrees Celsius: ");
        double initialTemperatureCelsius = inputScanner.nextDouble(); // Read the initial temperature

        // Prompt the user to enter the final temperature
        System.out.print("Enter the final temperature in degrees Celsius: ");
        double finalTemperatureCelsius = inputScanner.nextDouble(); // Read the final temperature

        // Declare a variable for energy calculation
        double energyJoules;

        // Calculate energy using provided formula only if the inputs are valid
        if (waterMassKilograms > 0 && finalTemperatureCelsius > initialTemperatureCelsius) {
            // Calculate energy using the formula Q = M * (Tf - Ti) * 4184
            energyJoules = waterMassKilograms * (finalTemperatureCelsius - initialTemperatureCelsius) * 4184;

            // Output the result
            System.out.printf("The energy needed to heat the water is: %.2f joules\n", energyJoules); // Print energy with two decimal places
        } else {
            // Print an error message for invalid input
            System.out.println("Invalid input. Please ensure the mass is positive and the final temperature is greater than the initial temperature.");
        }

        inputScanner.close(); // Close the scanner to free up resources

    }

}