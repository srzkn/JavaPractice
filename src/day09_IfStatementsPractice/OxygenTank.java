package day09_IfStatementsPractice;

import java.util.Scanner;

public class OxygenTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your oxygen level? (as a percentage please)");
        int num = sc.nextInt();
        String message = "You're dead man!";
        if (num >= 0 && num <= 100) {
            if (num > 90) {
                message = "Your tank is full";
            } else if (num > 80) {
                message = "Still okay";
            } else if (num > 70) {
                message = "Don't go too far";
            } else if (num > 60) {
                message = "Start to go back";
            } else if (num > 50) {
                message = "Be careful now to are at 50%";
            }
            System.out.println(message);
        } else System.out.println("it is not a valid level.");
    }
}
