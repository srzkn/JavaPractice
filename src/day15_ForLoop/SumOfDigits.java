package day15_ForLoop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please write a sentence that has also digits in it.");
        String entry = scan.nextLine();
        int sum = 0;
        for (int i = 0; i < entry.length(); i++) {
            if (entry.charAt(i) >= '0' && entry.charAt(i) <= '9') {
                int data=entry.charAt(i)-48;
                sum = sum + data;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
