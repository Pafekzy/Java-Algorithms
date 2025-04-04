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

    }
}