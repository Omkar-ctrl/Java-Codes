public class SumOfColumnIn2DArray {
    public static void main(String[] args){
        int [] arr={1,2,13,20,34,55,67,89,120,333,500};
        int target=55;
        int ans =BinarySearch(arr,target);
        System.out.println(ans);

    }

    public static int BinarySearch(int arr[],int target)
    {
        int start=0,end=arr.length-1;
        while (start<=end)
        {
            int mid = start + (end - start) / 2;
            if(target>arr[mid])
            {
                start=mid+1;
            } else if (target<arr[mid])
            {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }
}
