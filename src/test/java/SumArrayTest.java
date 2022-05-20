import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    @Order(1)
    @Test
    public void testSumArrayHappyPath() {

        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayHappyPathNegativeNumbers() {

        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSumArrayHappyPathNegativePositiveNumbers() {

        int[] array = {-7, -3, 3, 7};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayEmptyArray() {

        int[] array = {};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayZeroValue() {

        int[] array = {0, 0};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayIntMaxValue() {

        int[] array = {2147483647 + 1};
        int expectedResult = 2147483647 + 1;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayIntMinValue() {

        int[] array = {-2147483648 - 1};
        int expectedResult = -2147483648 - 1;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
