package Excel_Questions_Twenty_Five;

import java.util.Scanner;

public class SimpleHCFAndLCM {
    public static int findHCF(int a, int b) {
        while (b != 0) {        // Loop until remainder is zero
            int remainder = a % b;   // Find the remainder
            a = b;                // Update a to b
            b = remainder;        // Update b to remainder
        }
        return a;                 // Return HCF
    }
    public static int findLCM(int a, int b, int hcf) {
        return (a * b) / hcf;      // LCM formula
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2, hcf);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        scanner.close();
    }
}
