package day15_ForLoop;

import java.util.Scanner;

public class SumOfGiven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int entry = scan.nextInt();
        ;
        int sum = 0;
        for (int i = 1; i <= entry; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
