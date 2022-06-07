import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbers_15_3Test {


    @Order(1)
    @Test
    public void testStringToNumbers_15_3HappyPath() {

        String str = "123$%gh  rt9 0";
        String expectedResult = "12390";

        StringToNumbers_15_3 sn = new StringToNumbers_15_3();
        String actualResult = sn.StringToNumbersAlgorithm(str);
        String actualResult2 = sn.StringToNumbersAlgorithm2(str);

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult, actualResult2);
    }

    @Test
    public void testStringToNumbers_15_3Null() {

        String str = null;
        String expectedResult = "";

        StringToNumbers_15_3 sn = new StringToNumbers_15_3();
        String actualResult = sn.StringToNumbersAlgorithm(str);
        String actualResult2 = sn.StringToNumbersAlgorithm2(str);

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult, actualResult2);
    }

    @Test
    public void testStringToNumbers_15_3Empty() {

        String str = "";
        String expectedResult = "";

        StringToNumbers_15_3 sn = new StringToNumbers_15_3();
        String actualResult = sn.StringToNumbersAlgorithm(str);
        String actualResult2 = sn.StringToNumbersAlgorithm2(str);

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult, actualResult2);
    }

    @Test
    public void testStringToNumbers_15_3BorderNumberZero() {

        String str = "0";
        String expectedResult = "0";

        StringToNumbers_15_3 sn = new StringToNumbers_15_3();
        String actualResult = sn.StringToNumbersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbers_15_3BorderNumberNine() {

        String str = "9";
        String expectedResult = "9";

        StringToNumbers_15_3 sn = new StringToNumbers_15_3();
        String actualResult = sn.StringToNumbersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
