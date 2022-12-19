package day10_Ternaries;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "";
        System.out.println("Please write your salary");
        int salary = sc.nextInt();
        System.out.println("Please write your credit score");
        int creditScore = sc.nextInt();
        st = (salary > 60000 && creditScore > 650) ? "Loan Approved" : "Loan Denied";
        System.out.println(st);
    }
}
