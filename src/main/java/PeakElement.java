public class PeakElement {

    //Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает значения пиковых
    // элементов (элементы, которые больше своих соседей).
    //Test Data:
    //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}


    public int[] PeakElementAlgorithm(int[] array) {
        //определим длину массива
        int lengthArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[0] > array[1]) {
                lengthArray++;
            } else if (i > 0 && i < array.length - 1 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                lengthArray++;
            } else if (array[array.length - 1] > array[array.length - 2]) {
                lengthArray++;
            }
        }
        int[] resultArray = new int[lengthArray];

        //заполним массив
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[0] > array[1]) {
                resultArray[count] = array[0];
                count++;
            } else if (i > 0 && i < array.length - 1 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                resultArray[count] = array[i];
                count++;
            } else if (array[array.length - 1] > array[array.length - 2]) {
                resultArray[count] = array[array.length - 1];
            }
        }

        return resultArray;
    }
}
