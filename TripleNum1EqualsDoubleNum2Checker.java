package DeitelChapter2Algorithm;

import java.util.Scanner;

public class TripleNum1EqualsDoubleNum2Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number (which is tripled): ");
        int firstNum = sc.nextInt();

        System.out.print("Enter Second Number (which is doubled): ");
        int secondNum = sc.nextInt();

        if (3*firstNum == 2*secondNum) {
            System.out.println("They are equal "+3*firstNum);
        }
        if (3*firstNum != 2*secondNum) {
            System.out.println("They are not equal "+3*firstNum +" & " + 2*secondNum);

        }

    }



}
