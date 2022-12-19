package day16_ForLoopAndString;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first number");
        int i=scan.nextInt();
        System.out.println("enter the second number");
        int i2=scan.nextInt();
        int total=0;
        for (int j = 0; j < i; j++) {
            total+=i2;
        }
        System.out.println(total);
        scan.close();
    }
}
