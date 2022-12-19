package day17_BranchingStatements;
/* day17 practice 1
Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.
 */

import java.util.Scanner;

public class Divide2PositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p1;
        while (true) {
            System.out.println("write the FIRST Positive number");
            p1 = scan.nextInt();
            if (p1 > 0) break;
        }

        int p2;
        while (true) {
            System.out.println("write the SECOND Positive number");
            p2 = scan.nextInt();
            if (p2 > 0) break;
        }
        int division = 0;
        while (p1 > p2) {
            division++;
            p1 = p1 - p2;
        }
        System.out.println(division);
    }
}
