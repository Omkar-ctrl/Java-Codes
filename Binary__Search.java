public class Binary__Search {
    public static void main(String[] args) {
        int[] arr={1,3,4,7,8,10,13,16,20};
        int targrt= 1;
        int ans= BS(arr,targrt);
        System.out.println(ans);
    }
    public static int BS(int[] arr, int element){

        int start=0;
        int end= arr.length-1;

        while (start<=end){
           int mid= (start+end)/2;

            if(element>arr[mid]){
                start =mid+1;
            } else if (element < arr[mid]) {
                end= mid-1;
            }
            else {
                return mid;
            }
        }





        return -1;
    }
}
