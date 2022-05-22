public class OddIndices {

    //Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    public int[] OddIndicesAlgorithm(int[] arrayNumbers) {
        if (arrayNumbers.length != 0) {
            int[] arrayOddIndices = new int[arrayNumbers.length / 2];
            int countOdd = 0;
            for (int i = 1; i < arrayNumbers.length; i += 2) {
                arrayOddIndices[countOdd] = arrayNumbers[i];
                countOdd++;
            }

            return arrayOddIndices;
        }

        return new int[]{};
    }
}
