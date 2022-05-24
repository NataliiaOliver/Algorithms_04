public class OddIndices {

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
