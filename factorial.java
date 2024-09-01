package Excel_Questions_Twenty_Five;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int  fact=1;
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 1; i <=n ; i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);


    }
}
