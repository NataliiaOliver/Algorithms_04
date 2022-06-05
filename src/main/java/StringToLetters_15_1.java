public class StringToLetters_15_1 {

    public String testStringToLettersAlgorithm(String str) {

        String result = "";

        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0) {
            for (int i =0; i < str.length(); i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90
                        || str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    result = result + str.charAt(i);
                }
            }
        }

        return result;
    }
}
