package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write the FIRST sentence");
        String s1 = scan.nextLine();
        int l1 = s1.length();
        System.out.println("Please write the SECOND sentence");
        String s2 = scan.nextLine();
        int l2 = s2.length();
        if (l1 > l2) System.out.println(s1);
        else System.out.println(s2);
        scan.close();
    }
}
