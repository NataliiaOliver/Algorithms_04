import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class KthLargestTest {

    @Order(1)
    @Test
    public void testKthLargestHappyPathPositiveNumbers() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kl = new KthLargest();
        int actualResult = kl.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestHappyPath1() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12, 15};
        int k = 1;
        int expectedResult = 15;

        KthLargest kl = new KthLargest();
        int actualResult = kl.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestHappyPath2() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12, 15};
        int k = 5;
        int expectedResult = 7;

        KthLargest kl = new KthLargest();
        int actualResult = kl.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testKthLargestHappyPathNegativeNumbers() {

        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int k = 3;
        int expectedResult = -4;

        KthLargest kl = new KthLargest();
        int actualResult = kl.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testKthLargestHappyPathNegativePositiveNumbers() {

        int[] array = {-4, -3, -7, -12, 0, 5, -2, -9, -4, 12};
        int k = 3;
        int expectedResult = 0;

        KthLargest kl = new KthLargest();
        int actualResult = kl.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testKthLargestNegativeK() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = -3;
        int expectedResult = 0;

        KthLargest kl = new KthLargest();
        int actualResult = kl.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testKthLargestEmptyArray() {

        int[] array = {};
        int k = 3;
        int expectedResult = 0;

        KthLargest kl = new KthLargest();
        int actualResult = kl.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testKthLargestZeroK() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 0;
        int expectedResult = 0;

        KthLargest kl = new KthLargest();
        int actualResult = kl.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testKthLargestMaxK() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = Integer.MAX_VALUE;
        int expectedResult = 0;

        KthLargest kl = new KthLargest();
        int actualResult = kl.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testKthLargestMinK() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = Integer.MIN_VALUE;
        int expectedResult = 0;

        KthLargest kl = new KthLargest();
        int actualResult = kl.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
