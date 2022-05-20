import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PerformActionsWithMTest {

    @Order(1)
    @Test
    public void testPerformActionsWithMHappyPath3multiple5multiple() {

        int m = 15;
        String expectedResult = "Good Number";

        PerformActionsWithM pam = new PerformActionsWithM();
        String actualResult = pam.PerformActionsWithMAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testPerformActionsWithMHappyPath3multipleNot5multiple() {

        int m = 9;
        String expectedResult = "Bad Number";

        PerformActionsWithM pam = new PerformActionsWithM();
        String actualResult = pam.PerformActionsWithMAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testPerformActionsWithMHappyPathNot3multiple5multiple() {

        int m = 25;
        String expectedResult = "Poor Number";

        PerformActionsWithM pam = new PerformActionsWithM();
        String actualResult = pam.PerformActionsWithMAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPerformActionsWithMNot3multipleNot5multiple() {

        int m = 7;
        String expectedResult = "-1";

        PerformActionsWithM pam = new PerformActionsWithM();
        String actualResult = pam.PerformActionsWithMAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPerformActionsWithNegativeNumber() {

        int m = -1;
        String expectedResult = "-1";

        PerformActionsWithM pam = new PerformActionsWithM();
        String actualResult = pam.PerformActionsWithMAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPerformActionsWithZero() {

        int m = 0;
        String expectedResult = "Good Number";

        PerformActionsWithM pam = new PerformActionsWithM();
        String actualResult = pam.PerformActionsWithMAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }




}
