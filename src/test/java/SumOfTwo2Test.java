import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumOfTwo2Test {

    @Order(1)
    @Test
    public void testSumOfTwo2HappyPath() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo2 st = new SumOfTwo2();
        int[][] actualResult = st.SumOfTwo2Algorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumOfTwo2HappyPathPositiveNumbers3Sum() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12, 6, 6};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}, {6, 6}};

        SumOfTwo2 st = new SumOfTwo2();
        int[][] actualResult = st.SumOfTwo2Algorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSumOfTwo2HappyPathNegativeNumbers() {

        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int sum = -12;
        int[][] expectedResult = {{-3, -9}, {-7, -5}};

        SumOfTwo2 st = new SumOfTwo2();
        int[][] actualResult = st.SumOfTwo2Algorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testSumOfTwo2HappyPathPositiveNegativeNumbers() {

        int[] array = {4, -3, -7, 12, -5, 2, -9, 4, -12};
        int sum = -12;
        int[][] expectedResult = {{-3, -9}, {-7, -5}};

        SumOfTwo2 st = new SumOfTwo2();
        int[][] actualResult = st.SumOfTwo2Algorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testSumOfTwo2PositiveArrayNegativeSum() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = -12;
        int[][] expectedResult = {};

        SumOfTwo2 st = new SumOfTwo2();
        int[][] actualResult = st.SumOfTwo2Algorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testSumOfTwo2NegativeArrayPositiveSum() {

        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int sum = 12;
        int[][] expectedResult = {};

        SumOfTwo2 st = new SumOfTwo2();
        int[][] actualResult = st.SumOfTwo2Algorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testSumOfTwo2EmptyArray() {

        int[] array = {};
        int sum = 12;
        int[][] expectedResult = {{}};

        SumOfTwo2 st = new SumOfTwo2();
        int[][] actualResult = st.SumOfTwo2Algorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testSumOfTwo2ZeroArrayZeroSum() {

        int[] array = {0};
        int sum = 0;
        int[][] expectedResult = {};

        SumOfTwo2 st = new SumOfTwo2();
        int[][] actualResult = st.SumOfTwo2Algorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testSumOfTwo2EmptyArrayZeroSum() {

        int[] array = {};
        int sum = 0;
        int[][] expectedResult = {{}};

        SumOfTwo2 st = new SumOfTwo2();
        int[][] actualResult = st.SumOfTwo2Algorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
