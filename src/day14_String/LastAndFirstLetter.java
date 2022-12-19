package day14_String;

import java.util.Scanner;

public class LastAndFirstLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the FIRST word");
        String s1 = scan.next();
        System.out.println("Please enter the SECOND word");
        String s2 = scan.next();
        int length = s1.length();
        if (s1.charAt(length - 1) == s2.charAt(0))
            System.out.println(s1 + s2.substring(1));
        else System.out.println(s1 + s2);
        scan.close();
    }
}
