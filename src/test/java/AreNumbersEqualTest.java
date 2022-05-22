import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathNumbersAreEqual() {

        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual ne = new AreNumbersEqual();
        int actualResult = ne.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathOneNumberLessThanSecond() {

        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual ne = new AreNumbersEqual();
        int actualResult = ne.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathOneNumberGreaterThanSecond() {

        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual ne = new AreNumbersEqual();
        int actualResult = ne.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
