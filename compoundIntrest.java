package Excel_Questions_Twenty_Five;

public class compoundIntrest {
    public static void main(String[] args) {
        double principleAmount=10000;
        int year=5;
        double rate=1000;
        double C_I= principleAmount*Math.pow((1+rate),year)-principleAmount;

        System.out.println(C_I);
    }
}
