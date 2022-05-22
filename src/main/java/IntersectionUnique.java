import java.util.Arrays;

public class IntersectionUnique {

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
