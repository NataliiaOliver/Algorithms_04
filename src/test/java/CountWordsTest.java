import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CountWordsTest {

    @Order(1)
    @Test
    public void testCountWordsHappyPath() {

        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current\n" +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the\n" +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise\n" +
                "still support Java 8 with public updates for personal use indefinitely. Other vendors have begun\n" +
                "to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";
        String word1 = "Java";
        int expectedResult1 = 5;

        String word2 = "version";
        int expectedResult2 = 2;

        String word3 = "8";
        int expectedResult3 = 4;

        CountWords cw = new CountWords();
        int actualResult1 = cw.CountWordsAlgorithm(text, word1);
        int actualResult2 = cw.CountWordsAlgorithm(text, word2);
        int actualResult3 = cw.CountWordsAlgorithm(text, word3);

        Assertions.assertEquals(expectedResult1, actualResult1);
        Assertions.assertEquals(expectedResult2, actualResult2);
        Assertions.assertEquals(expectedResult3, actualResult3);
    }

    @Test
    public void testCountWordsNoWord() {

        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current\n" +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the\n" +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise\n" +
                "still support Java 8 with public updates for personal use indefinitely. Other vendors have begun\n" +
                "to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";
        String word = "";
        int expectedResult = 0;

        CountWords cw = new CountWords();
        int actualResult = cw.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsNoText() {

        String text = "";
        String word = "Java";
        int expectedResult = 0;

        CountWords cw = new CountWords();
        int actualResult = cw.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsTextIsNull() {

        String text = null;
        String word = "Java";
        int expectedResult = Integer.MIN_VALUE;

        CountWords cw = new CountWords();
        int actualResult = cw.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsTextAndWordAreNull() {

        String text = null;
        String word = null;
        int expectedResult = Integer.MIN_VALUE;

        CountWords cw = new CountWords();
        int actualResult = cw.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsWordIsNull() {

        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current\n" +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the\n" +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise\n" +
                "still support Java 8 with public updates for personal use indefinitely. Other vendors have begun\n" +
                "to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";
        String word = null;
        int expectedResult = Integer.MIN_VALUE;

        CountWords cw = new CountWords();
        int actualResult = cw.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWords5NoTextNoWord() {

        String text = "";
        String word = "";
        int expectedResult = 1;

        CountWords cw = new CountWords();
        int actualResult = cw.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
