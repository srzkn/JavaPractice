package day09_IfStatementsPractice;

import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time");
        int time = input.nextInt();
        if (time >= 1 && time <= 24) {
            if (time >= 8 && time <= 23) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else System.out.println("it is not a valid time");
    }
}
