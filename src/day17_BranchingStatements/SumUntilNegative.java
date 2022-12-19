package day17_BranchingStatements;
/*
day17 practice task 2
	2. Write a program that calculates the sum of numbers
	entered by the user until user enters a negative number.
            hint: you need an infinite loop
 */
import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   int entry=0;
   int sum=0;
   while (entry>=0)
   {
        System.err.println("enter a number");
        entry=scan.nextInt();
        sum+=entry;
    }
        System.out.println("sum of the numbers you entered is: "+sum);
   scan.close();
    }
    }
