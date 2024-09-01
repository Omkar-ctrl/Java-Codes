package Excel_Questions_Twenty_Five;

public class HCF {
    public static void main(String[] args) {
        int maxFactor=0;
        int n=4;
        int n2=6;
        for (int i = 1; i <n ; i++)
        {

            if(n%i==0 && n2%i==0 )
            {
                if(maxFactor<i)
                {
                    maxFactor=i;
                }
            }

        }

        System.out.println(maxFactor);
    }
}
