public class weathRichPerson {
    public static void main(String[] args) {
        int[][] arr={
                {1,1,1},
                {2,2,2},
                {3,3,3},
        };


        for (int row = 0; row <arr.length ; row++)
        {
            int sum=0;
            for (int column = 0; column <arr[row].length ; column++)
            {
                 sum= sum+arr[row][column];
            }

            System.out.print(sum);

        }
    }
}
