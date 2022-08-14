import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Regex {

    private String deleteDuplicate(String text) {
        String[] allWords;
        String sentence = text.toLowerCase();
        String result = "";
//        Set<String> unique = new HashSet<>();

        allWords = sentence.split(" ");

//        for (int i = 0; i < allWords.length; i++) {
//            unique.add(allWords[i]);
//        }

        for (int i = 0; i < allWords.length; i++) {
            for (int j = i + 1; j < allWords.length; j++) {
                if (allWords[i].equals(allWords[j])) {
                    allWords[j] = "remove";
                }
            }
        }


//        return unique.toString();

        for (String allWord : allWords) {
            if (allWord != "remove") {
                result = result + allWord +" ";
            }
        }

        return result;
    }

    public List<String> getListWithoutDuplicate(List<String> inputList) {
        List<String> newList = new ArrayList<>();
        for (String text : inputList) {
            newList.add(deleteDuplicate(text));
        }

        return newList;
    }
}
