package DeitelChapter2Algorithm;
import java.util.Scanner;  // Import the Scanner class for reading input from the console

public class MaxMinNumberDetector {

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

             System.out.println("Enter " + count + " numbers(give space in-between each number):");

            int number = scanner.nextInt();
            int greatest = number;
            int lowest = number;
            boolean allSame = true;

              for (int i = 1; i < count; i++) {
                number = scanner.nextInt();

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

            if (allSame) {

                System.out.println("All numbers are the same, there is none greater or lower.");
            } else {
                 System.out.println("The greatest number is: " + greatest);
                System.out.println("The lowest number is: " + lowest);
            }

             scanner.close();
        }
    }

