
/*There are three lines of output:
        For the first line, sum the lengths of  and .
        For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
        For the third line, capitalize the first letter in both and print them on a single line, separated by a space.*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringManager manager = new StringManager();
        InputReader inputReader = new InputReader();

        String first = inputReader.inputRead();
        String second = inputReader.inputRead();

        System.out.println(manager.sumStringsLength(first,second));
        System.out.println(manager.getLexicographicallyComparison(first,second));
        System.out.println(manager.getStringsIntegration(first,second));

        inputReader.closeReader();
    }
}
