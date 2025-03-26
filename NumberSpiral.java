package DeitelChapter2Algorithm;

public class NumberSpiral {
    public static int[][] generateSpiral(int size) {
        int[][] spiral = new int[size][size];
        int value = 1;
        int left = 0, right = size - 1, top = 0, bottom = size - 1;

        while (value <= size * size) {
            for (int i = left; i <= right; i++) spiral[top][i] = value++;
            top++;

            for (int i = top; i <= bottom; i++) spiral[i][right] = value++;
            right--;

            for (int i = right; i >= left; i--) spiral[bottom][i] = value++;
            bottom--;

            for (int i = bottom; i >= top; i--) spiral[i][left] = value++;

        }
        return spiral;
    }
}
