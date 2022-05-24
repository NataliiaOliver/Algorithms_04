public class MinMaxAve {

    public int[] MinMaxAveAlgorithm(int[] array, int index1, int index2) {

        if (array.length == 0 || index1 < 0 || index2 > (array.length - 1) || index1 > index2) {

            return new int[]{};
        }
        int[] resultArray = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};

        for (int i = index1; i <= index2; i++) {
            if (array[i] < resultArray[0]) {
                resultArray[0] = array[i];
            }
            if (array[i] > resultArray[1]) {
                resultArray[1] = array[i];
            }
            resultArray[2] = resultArray[2] + array[i];
        }
        resultArray[2] = resultArray[2] / (index2 - index1 + 1);

        return resultArray;
    }
}
