import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Order(1)
    @Test
    public void testBiggerValueHappyPathPositiveNumbers() {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPathNegativeNumbers() {
        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPathPositiveNegativeNumbers() {
        int a = -1;
        int b = 1;
        int expectedResult = 1;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testBiggerValueTheSameNumbers() {
        int a = 3333;
        int b = 3333;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testBiggerValueZeroFirstNumber() {
        int a = 0;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test
    public void testBiggerValueZeroSecondNumber() {
        int a = 3333;
        int b = 0;
        int expectedResult = 3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
