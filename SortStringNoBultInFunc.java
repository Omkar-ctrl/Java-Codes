

package Excel_Questions_Twenty_Five;

public class SortStringNoBultInFunc {
    public static void main(String[] args) {
        String str = "openai";

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Sort the character array using Bubble Sort
        bubbleSort(charArray);

        // Convert the sorted character array back to a string
        String sortedStr = new String(charArray);

        // Output the result
        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedStr);
    }

    public static void bubbleSort(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
