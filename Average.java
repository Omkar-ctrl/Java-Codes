package Excel_Questions_Twenty_Five;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n= input.nextInt();
        int sum=0;


        for (int i = 0; i <n ; i++)
        {
             int Number=input.nextInt();
            sum= sum+Number;
        }

        double avg= sum/n;
        System.out.println("Average is :"+avg);

    }
}
