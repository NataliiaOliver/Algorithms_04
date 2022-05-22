import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PeakElementTest {

    @Order(1)
    @Test
    public void testPeakElementHappyPath() {

        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.PeakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testPeakElementHappyPathNegative() {

        int[] array = {-3, 2, -7, 5, 1, -9, 23, 1};
        int[] expectedResult = {2, 5, 23};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.PeakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testPeakElementHappyPathZero() {

        int[] array = {0, 2, -7, 0, 1, 0, 23, 1};
        int[] expectedResult = {2, 1, 23};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.PeakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testPeakElementHappyPathDuplicates() {

        int[] array = {3, 3, 3, 5, 3, 3, 3, 3};
        int[] expectedResult = {5};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.PeakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testPeakElementTheSameValue() {

        int[] array = {3, 3, 3, 3, 3, 3, 3, 3};
        int[] expectedResult = {};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.PeakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
