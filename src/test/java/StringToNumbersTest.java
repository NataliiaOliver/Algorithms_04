import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {

    @Test
    public void testStringToNumbersHappyPath() {

        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers sn = new StringToNumbers();
        int[] actualResult = sn.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersNull() {

        String str = "null";
        int[] expectedResult = {};

        StringToNumbers sn = new StringToNumbers();
        int[] actualResult = sn.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersEmpty() {

        String str = " ";
        int[] expectedResult = {};

        StringToNumbers sn = new StringToNumbers();
        int[] actualResult = sn.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
