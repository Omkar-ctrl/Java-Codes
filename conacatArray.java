import java.lang.reflect.Array;
import java.util.Arrays;

public class conacatArray {
    public conacatArray(int[] arr1, int[] arr2) {
    }

    public static void main(String[] args) {
        int[] nums={};
        int[] ans = new int[2*nums.length];

        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        System.out.println(ans);
    }
}
