public class MinMaxAve {

    //Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
    //Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,  и среднее среди всех
    //значений между 2-мя индексами.
    //Test Data:
    //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

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
