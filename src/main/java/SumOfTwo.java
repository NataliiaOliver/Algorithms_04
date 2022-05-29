public class SumOfTwo {

    public int[][] SumOfTwoAlgorithm(int[] array, int sum) {
        if (array.length > 0) {

            int[] newArray = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (sum == (array[i] + array[j])) {
                        count++;
                        array[i] = -2147483648;
                    }
                }
            }

            int[][] result = new int[count][2];

            count = 0;
            for (int i = 0; i < newArray.length; i++) {
                for (int j = i + 1; j < newArray.length; j++) {
                    if (sum == newArray[i] + newArray[j]) {
                        result[count][0] = newArray[i];
                        result[count][1] = newArray[j];
                        count++;
                        newArray[i] = -2147483648;
                    }
                }
            }

            return result;
        }

        return new int[][]{};
    }
}
