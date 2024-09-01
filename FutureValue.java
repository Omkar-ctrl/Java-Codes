package Excel_Questions_Twenty_Five;

public class FutureValue {
    public static void main(String[] args) {
        double Fiv=0;
        int Principle=100;
        int n=3;
        double rate= 0.05;
        Fiv=Principle*Math.pow(1+rate,n);
        System.out.println(Fiv);
    }


}
