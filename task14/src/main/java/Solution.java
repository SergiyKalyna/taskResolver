import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.in;
import static java.lang.System.out;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String inputData1 = reader.readLine();
        String inputData2 = reader.readLine();
        String inputData3 = reader.readLine();

        if (!checkInputData(inputData1) || !checkInputData(inputData2) || !checkInputData(inputData3)) {
            throw new RuntimeException("Input data i snot valid");
        }
        List<String> inputList = List.of(inputData1, inputData2, inputData3);
        List<String> concatList = splitInputData(inputList);

        checkValidNumbers(concatList);

        Map<String, String> map = convertInputDataToMap(concatList);

        printer(map);
        reader.close();
    }

    public static boolean checkInputData(String text) {
        return text.length() <= 10;
    }

    public static Map<String, String> convertInputDataToMap(List<String> list) {
        Map<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < list.size(); i += 2) {
            map.put(list.get(i), reformatNumber(list.get(i + 1)));
        }

        return map;
    }

    public static List<String> splitInputData(List<String> inputList) {
        List<String> concatList = new ArrayList<>();

        for (String list : inputList) {
            String[] arr = list.split(" ");
            concatList.add(arr[0]);
            concatList.add(arr[1]);
        }

        return concatList;
    }

    public static void checkValidNumbers(List<String> list) throws RuntimeException {
        for (int i = 1; i < list.size(); i += 2) {
            int number = Integer.parseInt(list.get(i));
            if (number < 0 || number > 999) {
                throw new RuntimeException("Input data i snot valid");
            }
        }
    }

    public static String reformatNumber(String number) {
        if (number.length() == 3) {
            return number;
        } else if (number.length() == 2) {
            return "0".concat(number);
        } else {
            return "00".concat(number);
        }
    }

    public static void printer(Map<String, String> map) {
        out.println("================================");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.println(entry.getKey() + "               " + entry.getValue());
        }

        out.println("================================");
    }
}
