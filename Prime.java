package Excel_Questions_Twenty_Five;

public class Prime {
    public static void main(String[] args) {
        int n = 23;
        int i;

        // Assume the number is prime
        for (i = 2; i < n; i++) {
            // Check if n is divisible by i
            if (n % i == 0) {
                System.out.println(n + " is not a Prime number.");
                break; // Exit the loop as we found a divisor
            }
        }

        // If the loop completes without finding a divisor, i will be equal to n

            System.out.println(n + " is a Prime number.");

    }
}
