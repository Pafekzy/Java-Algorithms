package DeitelChapter2Algorithm;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberSpiralTest {

    @Test
    void testSpiralMatrixOfSizeOne(){
        int[][] expected = {
                {1}
        };
        assertArrayEquals(expected, NumberSpiral.generateSpiral(1));
    }
    @Test
    void testSpiralMatrixOfSizeTwo() {
        int[][] expected = {
                {1, 2},
                {4, 3}
        };
        assertArrayEquals(expected, NumberSpiral.generateSpiral(2));
    }

    @Test
    void testSpiralMatrixOfSizeThree() {
        int[][] expected = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        assertArrayEquals(expected, NumberSpiral.generateSpiral(3));
    }

    @Test
    void testSpiralMatrixOfSizeFour() {
        int[][] expected = {
                { 1,  2,  3,  4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10,  9,  8, 7}
        };
        assertArrayEquals(expected, NumberSpiral.generateSpiral(4));
    }

    @Test
    void testSpiralMatrixOfSizeFife() {
        int[][] expected = {
                { 1,  2,  3,  4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}

        };
        assertArrayEquals(expected, NumberSpiral.generateSpiral(5));
    }


}


