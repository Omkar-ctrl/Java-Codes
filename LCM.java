package Excel_Questions_Twenty_Five;

public class LCM {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;
        int lcm = 0;

        // Loop from the maximum of n1 and n2 until we find the LCM
        for (int i = 1; i <= n1 * n2; i++) {
            int multipleOfN1 = n1 * i;

            // Check if this multiple of n1 is also a multiple of n2
            if (multipleOfN1 % n2 == 0) {
                lcm = multipleOfN1;
                break; // Once LCM is found, exit the loop
            }
        }

        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
    }
}
