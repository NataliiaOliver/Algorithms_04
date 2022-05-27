public class PerformActionsWithM {

    public String PerformActionsWithMAlgorithm(int m) {
        String GoodNumber = "Good Number";
        String BadNumber = "Bad Number";
        String PoorNumber = "Poor Number";
        String doesNotSatisfy = "-1";

        if (m % 3 == 0 && m % 5 == 0) {

            return GoodNumber;
        }
        if (m % 3 == 0 && m % 5 != 0) {

            return BadNumber;
        }
        if (m % 3 != 0 && m % 5 == 0) {

            return PoorNumber;
        }

        return doesNotSatisfy;
    }
}
