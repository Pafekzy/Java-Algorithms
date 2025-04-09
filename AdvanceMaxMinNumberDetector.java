package DeitelChapter2Algorithm;

import java.util.Scanner;

public class AdvanceMaxMinNumberDetector {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers would you like to input? ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("The count should be a positive number.");
            return;
        }

        if (count == 1) {
            System.out.println("The count should be greater than 1 to compare.");
            return;
        }

        System.out.println("Enter " + count + " numbers (give space in-between each number):");

        int number = 0;
        int greatest = 0;
        int lowest = 0;
        boolean allSame = true;
        boolean firstTime = true;
        int inputCount = 0;

        // Accept exactly `count` numbers
        while (inputCount < count) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (firstTime) {
                    greatest = lowest = number;
                    firstTime = false;
                } else {
                    if (number != greatest) {
                        allSame = false;
                    }
                    if (number > greatest) {
                        greatest = number;
                    }
                    if (number < lowest) {
                        lowest = number;
                    }
                }

                inputCount++;
            } else {
                break;
            }
        }

         if (inputCount < count) {
            System.out.println("❌ You entered fewer numbers than expected (" + inputCount + "/" + count + ").");
            return;
        }

         if (scanner.hasNextInt()) {
            System.out.println("❌ You entered MORE numbers than expected!");
            return;
        }

         if (allSame) {
            System.out.println("All numbers are the same, there is none greater or lower.");
        } else {
            System.out.println("The greatest number is: " + greatest);
            System.out.println("The lowest number is: " + lowest);
        }

        scanner.close();
    }
}

