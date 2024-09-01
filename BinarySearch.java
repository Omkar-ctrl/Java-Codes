public class BinarySearch {
    public static void main(String[] args) {
        int[]  arr= {1,2,5,6,10,14,19,20,30,35};
        int target=14;
       int ans =Binary_Search(arr,target);
        System.out.println(ans);

    }
     public static int Binary_Search(int[] arr, int element)
     {
         int start=0;
         int end=arr.length-1;
       //  int[]  arr= {1,2,5,6,10,14,19,20,30,35};

         while (start<=end)
         {
             int mid=(start+end)/2;

             if(element>arr[mid])
             {
                 start=mid+1;
             } else if (element<arr[mid])
             {

                 end=mid-1;
             }
             else {return mid ;}
         }
         return -1;


    }
}
