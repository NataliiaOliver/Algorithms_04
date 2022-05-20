public class ReverseArray {

    //Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
    //Test Data:
    //{2, 7, 3, 10} → {10, 3, 7, 2}

    public int[] ReverseArrayAlgorithm(int[] array) {

        int[] result = new int[array.length];
        int count = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            result[count] = array[i];
            count--;
        }

        return result;
    }
}
