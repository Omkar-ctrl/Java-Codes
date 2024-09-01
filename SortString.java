package Excel_Questions_Twenty_Five;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "oaaapenai";

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        String sortedStr = new String(charArray);

        // Output the result
        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedStr);
    }
}
