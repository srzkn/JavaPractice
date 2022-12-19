package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a palindrome");
        String palindrome = scan.nextLine().toLowerCase();
        String data = "";
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            data = data + palindrome.charAt(i);
        }
        if (palindrome.equals(data)) System.out.println(palindrome + " and " + data + " are the same...");
        else System.out.println(palindrome + " and " + data + " are NOT the same words...");
        scan.close();
    }
}
