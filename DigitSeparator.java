package DeitelChapter2Algorithm;

import java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int fiveDigits = sc.nextInt();

        int firstDigit = fiveDigits / 10000;
        int secondDigit = (fiveDigits % 10000) / 1000;
        int thirdDigit = (fiveDigits % 1000) / 100;
        int fourthDigit = (fiveDigits % 100) / 10;
        int fifthDigit = fiveDigits % 10;

        if (fiveDigits >= 10000 && fiveDigits <= 99999) {
            System.out.println(firstDigit + "   " + secondDigit + "   " + thirdDigit + "   " + fourthDigit + "   " + fifthDigit);
        }

        else {
            System.out.println("The number of digit is incorrect");
        }
    }
}

