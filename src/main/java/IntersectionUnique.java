import java.util.Arrays;

public class IntersectionUnique {

    //Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвр-ет массив общих элементов.
    //Test Data:
    //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    //{1, 2, 4, 5, 89}, {8, 9, 45} → {}

    public int[] IntersectionUniqueAlgorithm(int[] array1, int[] array2) {

        if (array1.length == 0 || array2.length == 0) {

            return new int[]{};
        }

        int[] array1UniqueNumbers = Arrays.stream(array1).distinct().toArray();
        int[] array2UniqueNumbers = Arrays.stream(array2).distinct().toArray();

        int l = 0;
        for (int i = 0; i < array1UniqueNumbers.length; i++) {
            for (int j = 0; j < array2UniqueNumbers.length; j++) {
                if (array1UniqueNumbers[i] == array2UniqueNumbers[j]) {
                    l++;
                }
            }
        }
        int[] resultArray = new int[l];

        int k = 0;
        for (int i = 0; i < array1UniqueNumbers.length; i++) {
            for (int j = 0; j < array2UniqueNumbers.length; j++) {
                if (array1UniqueNumbers[i] == array2UniqueNumbers[j]) {
                    resultArray[k] = array1UniqueNumbers[i];
                    k++;
                }
            }
        }

        return resultArray;
    }
}
