import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersAndSpaces_15_4Test {

    @Order(1)
    @Test
    public void testStringToNumbersAndSpaces_15_4HappyPath() {

        String str = "123$%gh  rt9 0";
        String expectedResult = "123  9 0";

        StringToNumbersAndSpaces_15_4 ns = new StringToNumbersAndSpaces_15_4();
        String actualResult = ns.StringToNumbersAndSpacesAlgorithm(str);
        String actualResult2 = ns.StringToNumbersAndSpacesAlgorithm2(str);

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult, actualResult2);
    }

    @Test
    public void testStringToNumbersAndSpaces_15_4Null() {

        String str = null;
        String expectedResult = "";

        StringToNumbersAndSpaces_15_4 ns = new StringToNumbersAndSpaces_15_4();
        String actualResult = ns.StringToNumbersAndSpacesAlgorithm(str);
        String actualResult2 = ns.StringToNumbersAndSpacesAlgorithm2(str);

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult, actualResult2);
    }

    @Test
    public void testStringToNumbersAndSpaces_15_4Empty() {

        String str = "";
        String expectedResult = "";

        StringToNumbersAndSpaces_15_4 ns = new StringToNumbersAndSpaces_15_4();
        String actualResult = ns.StringToNumbersAndSpacesAlgorithm(str);
        String actualResult2 = ns.StringToNumbersAndSpacesAlgorithm2(str);

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult, actualResult2);
    }

    @Test
    public void testStringToNumbersAndSpaces_15_4BorderNumberZero() {

        String str = "0";
        String expectedResult = "0";

        StringToNumbersAndSpaces_15_4 ns = new StringToNumbersAndSpaces_15_4();
        String actualResult = ns.StringToNumbersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpaces_15_4BorderNumberNine() {

        String str = "9";
        String expectedResult = "9";

        StringToNumbersAndSpaces_15_4 ns = new StringToNumbersAndSpaces_15_4();
        String actualResult = ns.StringToNumbersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
