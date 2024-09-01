package Excel_Questions_Twenty_Five;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter No of Subjects");
        int totalSubjects =input.nextInt();
        int sumMarks=0;

        for (int i = 0; i <totalSubjects ; i++)
        {
            System.out.print("Enter Marks of Subjects ");
            int marks=input.nextInt();
            sumMarks=sumMarks+marks;
            
        }

        float avgMarks= sumMarks/totalSubjects;
        System.out.println("Avrage of Marks :"+avgMarks);
        
        
    }
}
