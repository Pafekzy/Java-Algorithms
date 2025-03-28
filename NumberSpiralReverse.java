package DeitelChapter2Algorithm;


import java.util.Scanner;

public class NumberSpiralReverse {
    public static int[][] createSpiral(int size) {
        int[][] spiral1 = new int[size][size];
        int value = size*size;
        int left = 0, right = size - 1, top = 0, bottom = size - 1;

        while (value >= 1) {
            for (int count = left; count <= right; count++) spiral1[top][count] = value--;
            top++;

            for (int count = top; count <= bottom; count++) spiral1[count][right] = value--;
            right--;

            for (int count = right; count >= left; count--) spiral1[bottom][count] = value--;
            bottom--;

            for (int count = bottom; count >= top; count--) spiral1[count][left] = value--;
            left++;
        }
        return spiral1;
    }


    public static void printOrganizedSpiral (int[][] spiral) {
        for (int[] row : spiral) {
            for (int num : row) {
                // Adjust formatting for alignment
                System.out.printf("%4d", num); // 4 spaces per number
            }
            System.out.println(); // Newline after each row
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the spiral: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Size must be a positive integer.");
        } else {
            int[][] spiral = createSpiral(size);
            printOrganizedSpiral(spiral);
        }
        input.close(); // Close the scanner
    }
}