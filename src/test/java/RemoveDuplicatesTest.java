import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RemoveDuplicatesTest {

    @Order(1)
    @Test
    public void testRemoveDuplicatesHappyPath() {

        String str = "AABBCCaabbcc";
        String expectedResult = "abc";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesIsEmpty() {

        String str = "";
        String expectedResult = "";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesNull() {

        String str = null;
        String expectedResult = "";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesNumbers() {

        String str = "112233";
        String expectedResult = "";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesSymbols() {

        String str = "@@##$$%%";
        String expectedResult = "";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testRemoveDuplicatesHappyPathMix() {

        String str = "@@11AAbb";
        String expectedResult = "ab";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testRemoveDuplicatesHappyPathOneLetter() {

        String str = "DDdd";
        String expectedResult = "d";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
