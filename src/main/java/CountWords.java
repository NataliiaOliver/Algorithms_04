public class CountWords {

    public int CountWordsAlgorithm(String text, String word) {
        if (text != null && word != null) {
            text = text.toLowerCase().replace(",", "")
                    .replace(".", "");
            word = word.toLowerCase();

            String[] array = text.split(" ");
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(word)) {
                    count++;
                }
            }

            return count;
        }

        return Integer.MIN_VALUE;
    }
}
