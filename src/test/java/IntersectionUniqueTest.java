import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionUniqueTest {

    @Order(1)
    @Test
    public void testIntersectionUniqueHappyPathPositiveNumber() {

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        IntersectionUnique is = new IntersectionUnique();
        int[] actualResult = is.IntersectionUniqueAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIntersectionUniqueHappyPathNegativeNumber() {

        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        IntersectionUnique is = new IntersectionUnique();
        int[] actualResult = is.IntersectionUniqueAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIntersectionUniqueHappyPathNoMatchesNumber() {

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};

        IntersectionUnique is = new IntersectionUnique();
        int[] actualResult = is.IntersectionUniqueAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionUniqueArray1isEmpty() {

        int[] array1 = {};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};

        IntersectionUnique is = new IntersectionUnique();
        int[] actualResult = is.IntersectionUniqueAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionUniqueArray2IsEmpty() {

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {};
        int[] expectedResult = {};

        IntersectionUnique is = new IntersectionUnique();
        int[] actualResult = is.IntersectionUniqueAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionUniqueManyDuplicatesInArray1() {

        int[] array1 = {1, 2, 4, 5, 89, 4, 4, 2};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        IntersectionUnique is = new IntersectionUnique();
        int[] actualResult = is.IntersectionUniqueAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionUniqueManyDuplicatesInArray2() {

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2, 9, 8, 4, 2, 2};
        int[] expectedResult = {2, 4};

        IntersectionUnique is = new IntersectionUnique();
        int[] actualResult = is.IntersectionUniqueAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionUniqueBothArraysHaveManyDuplicates() {

        int[] array1 = {1, 2, 4, 5, 89, 89, 2, 2, 4};
        int[] array2 = {8, 9, 4, 2, 9, 8, 4, 2, 2};
        int[] expectedResult = {2, 4};

        IntersectionUnique is = new IntersectionUnique();
        int[] actualResult = is.IntersectionUniqueAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
