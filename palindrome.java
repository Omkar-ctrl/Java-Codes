package Excel_Questions_Twenty_Five;

 class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int ognum = num;
        int reversedNum = 0;

        while (num > 0) {
            int rem = num % 10;
            reversedNum = reversedNum * 10 + rem;
            num = num / 10;
        }

        // Check if the original number is a palindrome
        if (ognum == reversedNum) {
            System.out.println("The number " + ognum + " is a palindrome.");
        } else {
            System.out.println("The number " + ognum + " is not a palindrome.");
        }
    }
}
