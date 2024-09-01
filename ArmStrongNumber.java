package Excel_Questions_Twenty_Five;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n=370;
        int arm=n;
        int sum=0;
        while (n>0)
        {
            int rem=n%10;
            int remcube= rem*rem*rem;
            sum= sum+remcube;
            n=n/10;
           // System.out.print(remcube+" ");
            //System.out.println(rem);

        }
        System.out.print(sum+" ");
        if (sum==arm){
            System.out.println("Yes it's Armstrong Number");
        }

    }
}
