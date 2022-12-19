package day14_String;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write your email address");
        String s = scan.nextLine();
        String firstName = s.substring(0, s.indexOf("_"));
        String lastName = s.substring(s.indexOf("_") + 1, s.indexOf("@"));
        String rest = s.substring(s.indexOf("@"));
        System.out.println(lastName + "_" + firstName + rest);
        scan.close();
    }
}
