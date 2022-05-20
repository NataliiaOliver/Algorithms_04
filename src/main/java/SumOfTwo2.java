public class SumOfTwo2 {

    //Вариант 2(без замены значений в массиве)

    public int[][] SumOfTwo2Algorithm(int[] array, int sum) {

        int[][] result = {{}};
        int count = 0;

        if (array.length > 0) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == sum) {
                        count++;
                    }
                }
            }
            result = new int[count][2];
            count = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == sum) {
                        result[count][0] = array[i];
                        result[count][1] = array[j];
                        count++;
                    }
                }
            }
        }

        return result;
    }
}
