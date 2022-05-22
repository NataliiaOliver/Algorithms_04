import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {

    @Order(1)
    @Test
    public void testOddIndicesTestHappyPath() {

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.OddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesTestEmptyArray() {

        int[] array = {};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.OddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesTestZeroNumber() {

        int[] array = {0};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.OddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
