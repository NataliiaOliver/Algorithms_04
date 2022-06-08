public class ReverseString {

    public String ReverseStringAlgorithm(String str) {
        String result = "";
        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0) {
            for (int i = str.length() - 1; i >= 0; i--) {
                result = result.concat(Character.toString(str.charAt(i)));
            }

            return result;
        }

        return "";
    }
}
