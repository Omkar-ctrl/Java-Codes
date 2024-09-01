public class maxArray {
    public static void main(String[] args) {
        int[] arr= {111111111,20000,3333,4,5};
        maxVal(arr);
    }

    public static void maxVal(int[] arr)
    {
        int maxValue=arr[0];
        for (int i = 1; i <arr.length ; i++)
        {
            if (arr[i]>maxValue)
            {
                maxValue=arr[i];
            }
        }

        System.out.println(maxValue);
    }

}
