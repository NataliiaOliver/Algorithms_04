import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseStringTest {

    @Order(1)
    @Test
    public void testReverseStringHappyPath() {

        String str = "Abracadabra";
        String expectedResult = "arbadacarbA";

        ReverseString rs = new ReverseString();
        String actualResult = rs.ReverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseStringIsEmpty() {

        String str = "";
        String expectedResult = "";

        ReverseString rs = new ReverseString();
        String actualResult = rs.ReverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseStringNull() {

        String str = null;
        String expectedResult = "";

        ReverseString rs = new ReverseString();
        String actualResult = rs.ReverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseStringNumbers() {

        String str = "1234567890";
        String expectedResult = "0987654321";

        ReverseString rs = new ReverseString();
        String actualResult = rs.ReverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseStringSymbols() {

        String str = "!@#$%^&*";
        String expectedResult = "*&^%$#@!";

        ReverseString rs = new ReverseString();
        String actualResult = rs.ReverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseStringMix() {

        String str = "-1&";
        String expectedResult = "&1-";

        ReverseString rs = new ReverseString();
        String actualResult = rs.ReverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
