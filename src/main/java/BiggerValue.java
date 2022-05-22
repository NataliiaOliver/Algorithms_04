public class BiggerValue {

    public int BiggerValueAlgorithm(int a, int b) {
        int max;
        if (a == b) {

            return a - b;
        }
        if (a < b) {
            max = b;
        } else {
            max = a;
        }

        return max;
    }
}
