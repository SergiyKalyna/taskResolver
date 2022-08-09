public class StringManager {

    public int sumStringsLength(String first, String second) {
        return first.length() + second.length();
    }

    public String getLexicographicallyComparison(String first, String second) {
        if (first.compareTo(second) < 0) {
            return "No";
        } else {
            return "Yes";
        }
    }

    public String getStringsIntegration(String first, String second) {
        return capitalizeString(first).concat(" " + capitalizeString(second));
    }

    private String capitalizeString(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
