import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseArrayTest {

    @Order(1)
    @Test
    public void testReverseArrayHappyPath() {

        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.ReverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testReverseArrayHappyPathNegativeNumbers() {

        int[] array = {-2, -7, -3, -10};
        int[] expectedResult = {-10, -3, -7, -2};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.ReverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testReverseArrayHappyPathNegativePositiveNumbers() {

        int[] array = {-2, -7, 3, 10};
        int[] expectedResult = {10, 3, -7, -2};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.ReverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayEmptyArray() {

        int[] array = {};
        int[] expectedResult = {};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.ReverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayZero() {

        int[] array = {0};
        int[] expectedResult = {0};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.ReverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayMinMaxValue() {

        int[] array = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] expectedResult = {Integer.MAX_VALUE, Integer.MIN_VALUE};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.ReverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
