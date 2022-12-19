package day10_Ternaries;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int num = sc.nextInt();
        String st = "";
        if (num >= 0 && num <= 150) {
            st = (num < 21) ? "Teenager" : (num < 55) ? "Adult" : "Senior";
        } else st = "invalid";
        System.out.println(st);
    }
}
