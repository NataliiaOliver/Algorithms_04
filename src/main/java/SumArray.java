public class SumArray {

    public int SumArrayAlgorithm(int[] array) {
        if (array.length == 0) {

            return 0;
        }
        int sumNum = 0;
        for (int i = 0; i < array.length; i++) {
                sumNum += array[i];
        }

        return sumNum;
    }
}
