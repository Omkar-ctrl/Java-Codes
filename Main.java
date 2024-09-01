import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] carr= {1,2,3,4};
        swap(carr,0,3);
        System.out.println(Arrays.toString(carr));

    }

    public static void swap(int arr[],int a, int b) {
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;


    }

}