package Excel_Questions_Twenty_Five;

import java.util.HashSet;
import java.util.Scanner;

public class SUmofNNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter ths N number for sum");
//        int N=input.nextInt();
//        int sum=0;
//        for (int i = 0; i <=N ; i++) {
//             sum=sum+i;
//        }
//        System.out.println("Sum of N"+N+" numbers ="+sum);

        int arrayv[]={1,2,3,44,55,66,771,22,22,22,44,44,44};
        HashSet<Integer> hashSet= new HashSet<>();

        for (int i = 0; i < arrayv.length; i++) {

            hashSet.add(arrayv[i]);

        }

        System.out.println(hashSet);
//        int n=451;
//        int og=n;
//        int reverse=0;
//
//        while (n>0){
//            int rem= n%10;
//            reverse= reverse*10+rem;
//             n= n/10;
//        }
//        System.out.println(reverse);


    }
}
