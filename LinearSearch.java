import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int n=2;
        boolean Ans=Even(n);
        System.out.println(Ans);
        }

     static boolean Even(int n)
     {

         if(n%2==0)
         {
             System.out.println("Even Number");
             return true;
         }
         return false;
     }

    }


