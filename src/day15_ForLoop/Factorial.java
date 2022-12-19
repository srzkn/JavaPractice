package day15_ForLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int entry=scan.nextInt();
        int factorial=1;
        for (int i=1; i<=entry; i++)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
