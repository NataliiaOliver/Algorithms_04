import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLetters_15_1Test {

    @Order(1)
    @Test
    public void testStringToLetters_15_1HappyPath() {

        String str = "123$%gh  rt9 0";
        String expectedResult = "ghrt";

        StringToLetters_15_1 sl = new StringToLetters_15_1();
        String actualResult = sl.testStringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLetters_15_1Null() {

        String str = null;
        String expectedResult = "";

        StringToLetters_15_1 sl = new StringToLetters_15_1();
        String actualResult = sl.testStringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLetters_15_1IsEmpty() {

        String str = "";
        String expectedResult = "";

        StringToLetters_15_1 sl = new StringToLetters_15_1();
        String actualResult = sl.testStringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLetters_15_1Space() {

        String str = " ";
        String expectedResult = "";

        StringToLetters_15_1 sl = new StringToLetters_15_1();
        String actualResult = sl.testStringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLetters_15_1Number() {

        String str = "1";
        String expectedResult = "";

        StringToLetters_15_1 sl = new StringToLetters_15_1();
        String actualResult = sl.testStringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLetters_15_1Symbol() {

        String str = "$";
        String expectedResult = "";

        StringToLetters_15_1 sl = new StringToLetters_15_1();
        String actualResult = sl.testStringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
