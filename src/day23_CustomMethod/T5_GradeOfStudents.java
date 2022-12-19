package day23_CustomMethod;

import java.util.Scanner;

public class T5_GradeOfStudents {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your score?");
    int score= scan.nextInt();
    calculateGrade(score);
    }

    public static void calculateGrade(int score)
    {
        if (score>=90) System.out.println("Excellent");
        else if (score>=80) System.out.println("Good");
        else if (score>=70) System.out.println("OK");
        else if (score>=60) System.out.println("Passed");
        else System.out.println("Failed");
    }
}
