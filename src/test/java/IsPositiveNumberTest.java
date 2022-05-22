import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathPositiveValue() {
        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathNegativeValue() {
        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathIsZero() {
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberBoundaryValuePositive() {
        int number = Integer.MAX_VALUE;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberBoundaryValueNegative() {
        int number = Integer.MIN_VALUE;
        boolean expectedResult = false;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
