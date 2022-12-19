package day09_IfStatementsPractice;

import java.util.Scanner;

public class FINRA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a number");
        int a = sc.nextInt();

        if (a % 3 == 0 && a % 5 != 0) {
            System.out.println("FIN");
        } else if (a % 5 == 0 && a % 3 != 0) {
            System.out.println("RA");
        } else if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("FINRA");
        } else {
            System.out.println(a + " is NOT dividible with 3 or 5");
        }
    }
}
