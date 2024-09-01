package Excel_Questions_Twenty_Five;

import java.util.Scanner;

public class CalculateElectricityBIill {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Calculate Electricity Bill");
        System.out.print("Enter Power Consumption : ");
        int PowerConsumtion=input.nextInt();
        System.out.print("Enter the cost of per Unit : ");
        float cost=input.nextFloat();

        System.out.println("Power Consumption:"+PowerConsumtion+"kWh"+" Cost:"+cost+" Rs");
        float Bill= PowerConsumtion*cost;
        System.out.println("Electricity Bill= "+Bill+" Rs");
    }
}
