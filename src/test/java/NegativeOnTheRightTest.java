import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class NegativeOnTheRightTest {

    @Order(1)
    @Test
    public void testNegativeOnTheRightHappyPathBeginPositive() {

        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.NegativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testNegativeOnTheRightEmptyArray() {

        int[] array = {};
        int[] expectedResult = {};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.NegativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testNegativeOnTheRightWithZero() {

        int[] array = {0, -3, 0, -12, 0, -2, 0, 0, 0};
        int[] expectedResult = {0, 0, 0, 0, 0, 0, -2, -12, -3};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.NegativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testNegativeOnTheRightHappyPathBeginNegative() {

        int[] array = {-3, -12, -2, 9, 4, 12};
        int[] expectedResult = {9, 4, 12, -2, -12, -3};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.NegativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testNegativeOnTheRightZeroArray() {

        int[] array = {0};
        int[] expectedResult = {0};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.NegativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testNegativeOnTheRightPositiveNumbers() {

        int[] array = {1, 2, 3, 4, 5};
        int[] expectedResult = {1, 2, 3, 4, 5};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.NegativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testNegativeOnTheRightNegativeNumbers() {

        int[] array = {-1, -2, -3, -4, -5};
        int[] expectedResult = {-5, -4, -3, -2, -1};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.NegativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightMaxMinValue() {

        int[] array = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] expectedResult = {Integer.MAX_VALUE, Integer.MIN_VALUE};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.NegativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
