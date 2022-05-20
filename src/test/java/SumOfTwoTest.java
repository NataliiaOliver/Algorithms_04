import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumOfTwoTest {

    @Order(1)
    @Test
    public void testSumOfTwoHappyPathPositiveNumbers() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSumOfTwoHappyPathPositiveNumbers3Sum() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12, 6, 6};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}, {6, 6}};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

//    @Order(4)
//    @Test
//    public void testSumOfTwoHappyPathPositiveNumbers1Sum() {
//
//        int[] array = {4, 3, 0, 12, 0, 2, 9, 4, 12};
//        int sum = 12;
//        int[][] expectedResult = {{3, 9}, {}};
//
//        SumOfTwo st = new SumOfTwo();
//        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);
//
//        Assertions.assertArrayEquals(expectedResult, actualResult);
//    }

    @Order(2)
    @Test
    public void testSumOfTwoHappyPathNegativeNumbers() {

        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int sum = -12;
        int[][] expectedResult = {{-3, -9}, {-7, -5}};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testSumOfTwoHappyPathPositiveNegativeNumbers() {

        int[] array = {4, -3, -7, 12, -5, 2, -9, 4, -12};
        int sum = -12;
        int[][] expectedResult = {{-3, -9}, {-7, -5}};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testSumOfTwoPositiveArrayNegativeSum() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = -12;
        int[][] expectedResult = {};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testSumOfTwoNegativeArrayPositiveSum() {

        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int sum = 12;
        int[][] expectedResult = {};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testSumOfTwoEmptyArray() {

        int[] array = {};
        int sum = 12;
        int[][] expectedResult = {};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testSumOfTwoSumIsZero() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 0;
        int[][] expectedResult = {};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(10)
    @Test
    public void testSumOfTwoZeroArrayZeroSum() {

        int[] array = {0};
        int sum = 0;
        int[][] expectedResult = {};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(11)
    @Test
    public void testSumOfTwoEmptyArrayZeroSum() {

        int[] array = {};
        int sum = 0;
        int[][] expectedResult = {};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }








}
