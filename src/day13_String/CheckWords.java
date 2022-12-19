package day13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write the FIRST word");
        String s1 = scan.next();
        System.out.println("Please write the SECOND word");
        String s2 = scan.next();
        System.out.println("Please write the THIRD word");
        String s3 = scan.next();
        String message;
        if (s1.length() == s2.length() && s2.length() == s3.length())
            message = "All words are same length";
        else if (s1.length() != s2.length() && s1.length() != s3.length() && s2.length() != s3.length())
            message = "All different length";
        else message = "Not Same nor Different";
        System.out.println(message);
        scan.close();
    }
}
