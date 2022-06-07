import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersAndSpaces_15_2Test {

    @Order(1)
    @Test
    public void testStringToLettersAndSpaces_15_2HappyPath() {

        String str = "123$%gh  rt9 0";
        String expectedResult = "gh  rt ";

        StringToLettersAndSpaces_15_2 ls = new StringToLettersAndSpaces_15_2();
        String actualResult = ls.StringToLettersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpaces_15_2Null() {

        String str = null;
        String expectedResult = "";

        StringToLettersAndSpaces_15_2 ls = new StringToLettersAndSpaces_15_2();
        String actualResult = ls.StringToLettersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpaces_15_2IsEmpty() {

        String str = "";
        String expectedResult = "";

        StringToLettersAndSpaces_15_2 ls = new StringToLettersAndSpaces_15_2();
        String actualResult = ls.StringToLettersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpaces_15_2IsBorderLetters() {

        String str1 = Character.toString('A' - 1); //ASCII 64 = @
        String expectedResult1 = "";

        String str2 = Character.toString('Z' + 1); //ASCII 91 = [
        String expectedResult2 = "";

        String str3 = Character.toString('a' - 1); //ASCII 97 = `
        String expectedResult3 = "";

        String str4 = Character.toString('z' + 1); //ASCII 123 = {
        String expectedResult4 = "";

        StringToLettersAndSpaces_15_2 sl = new StringToLettersAndSpaces_15_2();

        String actualResult1 = sl.StringToLettersAndSpacesAlgorithm(str1);
        String actualResult2 = sl.StringToLettersAndSpacesAlgorithm(str2);
        String actualResult3 = sl.StringToLettersAndSpacesAlgorithm(str3);
        String actualResult4 = sl.StringToLettersAndSpacesAlgorithm(str4);

        Assertions.assertEquals(expectedResult1, actualResult1);
        Assertions.assertEquals(expectedResult2, actualResult2);
        Assertions.assertEquals(expectedResult3, actualResult3);
        Assertions.assertEquals(expectedResult4, actualResult4);
    }
}
