package DeitelChapter2Algorithm;

import java.util.Arrays;

public class NumberSpiral {
    public static int[][] generateSpiral(int size) {
        int[][] spiral = new int[size][size];
        int value = 1;
        int left = 0, right = size - 1, top = 0, bottom = size - 1;

        while (value <= size * size) {
            for (int count = left; count <= right; count++) spiral[top][count] = value++;
            top++;

            for (int count = top; count <= bottom; count++) spiral[count][right] = value++;
            right--;

            for (int count = right; count >= left; count--) spiral[bottom][count] = value++;
            bottom--;

            for (int count = bottom; count >= top; count--) spiral[count][left] = value++;
            left++;
        }
        return spiral;
    }


    public static void printSpiral(int[][] spiral) {
        for (int[] row : spiral) {
            for (int num : row) {
                // Adjust formatting for alignment
                System.out.printf("%4d", num); // 4 spaces per number
            }
            System.out.println(); // Newline after each row
        }
    }


    public static void main(String[] args) {
        int[][] spiral = generateSpiral(5);
        printSpiral(spiral); // Use the new print method
    }
}
