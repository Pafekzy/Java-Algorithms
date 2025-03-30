package DeitelChapter2Algorithm;

import java.util.Scanner;

public class SeparatingDigitsWithOnlyIfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");

        int number = scanner.nextInt();

         if (number >= 10000) {
            if (number <= 99999) {
                String space = "   ";
                int firstDigit = number / 10000;
                int secondDigit = (number / 1000) % 10;
                int thirdDigit = (number / 100) % 10;
                int fourthDigit = (number / 10) % 10;
                int fifthDigit = number % 10;

                 System.out.println("Valid number");
                System.out.println(firstDigit + space + secondDigit + space + thirdDigit
                        + space + fourthDigit + space + fifthDigit);

            }
        }

        if (number < 10000) {
            System.out.println("Invalid number");
        }

        if (number > 99999) {
            System.out.println("Invalid number");
        }

        scanner.close();
    }
}