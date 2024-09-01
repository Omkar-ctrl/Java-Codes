package Excel_Questions_Twenty_Five;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int totalSubjects=input.nextInt();
        float sumOfGrades=0;
        for (int i = 1; i <=totalSubjects ; i++)
        {

            float grade= input.nextFloat();
            sumOfGrades = grade+sumOfGrades;
        }

        System.out.println("SUm of Grades"+sumOfGrades);
        System.out.println(totalSubjects);
        float CGPA= sumOfGrades/totalSubjects;
        System.out.println(CGPA);
        
    }
}
