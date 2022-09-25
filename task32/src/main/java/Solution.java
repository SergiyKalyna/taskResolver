import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numbers = Integer.parseInt(reader.readLine());
        if (numbers < 1 || numbers > 100000) throw new RuntimeException("Wrong input data");

        Map<String, Integer> contacts = new HashMap<>();
        for (int i = 0; i < numbers; i++) {
            String contactName = reader.readLine();
            try {
                int phoneNumber = checkNumber(reader.readLine());
                contacts.put(contactName, phoneNumber);
            } catch (RuntimeException ex) {
            }
        }

        List<String> searchResult = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
            String query = reader.readLine();
            if (contacts.containsKey(query)) {
                searchResult.add(String.format("%s=%s", query, contacts.get(query)));
            } else {
                searchResult.add("Not found");
            }
        }
        reader.close();

        searchResult.forEach(System.out::println);
    }

    public static int checkNumber(String number) {
        String regex = "^([1-9][0-9]+)$";
        if (!number.matches(regex) || number.length() != 8) {
            throw new RuntimeException("Wrong input phone number");
        } else {
            return Integer.parseInt(number);
        }
    }
}
