import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SortArrayTest {

    @Order(1)
    @Test
    public void testSortArrayHappyPathPositiveNumbers() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sa = new SortArray();
        int[] actualResult = sa.SortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSortArrayHappyPathNegativeNumbers() {

        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int[] expectedResult = {-12, -12, -9, -7, -5, -4, -4, -3, -2};

        SortArray sa = new SortArray();
        int[] actualResult = sa.SortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSortArrayHappyPathNegativePositiveNumbers() {

        int[] array = {-4, -3, -7, -12, -5, 2, 9, 4, 12};
        int[] expectedResult = {-12, -7, -5, -4, -3, 2, 4, 9, 12};

        SortArray sa = new SortArray();
        int[] actualResult = sa.SortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testSortArrayHappyPathNegativePositiveZeroNumbers() {

        int[] array = {0, -4, -3, -7, -12, -5, 2, 9, 4, 12};
        int[] expectedResult = {-12, -7, -5, -4, -3, 0, 2, 4, 9, 12};

        SortArray sa = new SortArray();
        int[] actualResult = sa.SortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayZero() {

        int[] array = {0};
        int[] expectedResult = {0};

        SortArray sa = new SortArray();
        int[] actualResult = sa.SortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayEmptyArray() {

        int[] array = {};
        int[] expectedResult = {};

        SortArray sa = new SortArray();
        int[] actualResult = sa.SortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
