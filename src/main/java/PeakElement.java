public class PeakElement {

    public int[] PeakElementAlgorithm(int[] array) {
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
