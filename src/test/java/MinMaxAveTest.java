import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {


    @Order(1)
    @Test
    public void testMinMaxAveHappyPath() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveEmptyArray() {

        int[] array = {};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = new int[] {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testMinMaxAveIndex1IsNegative() {

        int[] array = {2, 4, 7, 10};
        int index1 = -2;
        int index2 = 6;
        int[] expectedResult = new int[] {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndex2IsNegative() {

        int[] array = {2, 4, 7, 10};
        int index1 = 2;
        int index2 = -3;
        int[] expectedResult = new int[] {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndex1IsBiggerThanIndex2() {

        int[] array = {2, 4, 7, 10};
        int index1 = 3;
        int index2 = 2;
        int[] expectedResult = new int[] {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testMinMaxAveIndex1EqualIndex2() {

        int[] array = {2, 3, 7, 10};
        int index1 = 3;
        int index2 = 3;
        int[] expectedResult = {10, 10, 10};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testMinMaxAveLengthEqualZero() {

        int[] array = {2};
        int index1 = 0;
        int index2 = 0;
        int[] expectedResult = {2, 2, 2};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testMinMaxAveZeroValues() {

        int[] array = {0, 0, 0, 0};
        int index1 = 1;
        int index2 = 2;
        int[] expectedResult = {0, 0, 0};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testMinMaxAveTwoValues() {

        int[] array = {4, 20};
        int index1 = 0;
        int index2 = 1;
        int[] expectedResult = {4, 20, 12};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveTwoValuesNegative() {

        int[] array = {4, 20};
        int index1 = 0;
        int index2 = 3;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.MinMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }






}
