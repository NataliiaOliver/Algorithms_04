public class StringToNumbers_15_3 {

    public String StringToNumbersAlgorithm(String str) {
        String result = "";
        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    result = result + str.charAt(i);
                }
            }
        }

        return result;
    }

    public String StringToNumbersAlgorithm2(String str) {
        String result = "";
        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1' || str.charAt(i) == '2'
                        || str.charAt(i) == '3' || str.charAt(i) == '4'
                        || str.charAt(i) == '5' || str.charAt(i) == '6'
                        || str.charAt(i) == '7' || str.charAt(i) == '8'
                        || str.charAt(i) == '9' || str.charAt(i) == '0') {
                    result = result + str.charAt(i);
                }
            }
        }

        return result;
    }
}
