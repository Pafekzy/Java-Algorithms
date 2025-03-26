package DeitelChapter2Algorithm;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberSpiralTest {

    @Test
    void testSpiralMatrixOfSizeThree() {
        int[][] expected = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertArrayEquals(expected, NumberSpiral.generateSpiral(3));
    }




}


