package day09_IfStatementsPractice;

import java.util.Scanner;

public class NumberToWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the number");
        int no = input.nextInt();

        if (no >= 0 && no <= 9) {
            if (no == 0) {
                System.out.println("Zero");
            } else if (no == 1) {
                System.out.println("One");
            } else if (no == 2) {
                System.out.println("Two");
            } else if (no == 3) {
                System.out.println("Three");
            } else if (no == 4) {
                System.out.println("Four");
            } else if (no == 5) {
                System.out.println("Five");
            } else if (no == 6) {
                System.out.println("Six");
            } else if (no == 7) {
                System.out.println("Seven");
            } else if (no == 8) {
                System.out.println("Eight");
            } else {
                System.out.println("Nine");
            }
        } else {
            System.out.println(no + " is not a valid entry!");
        }
    }
}
