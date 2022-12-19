package day14_String;

import java.util.Scanner;

public class digitsUpperLoverSpecial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String s = scan.next();
        String message = "";
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') message = "first character is digit";
        else if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') message = "first character is UPPERCASE";
        else if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') message = "first character is lowercase";
        else message = "first character is special character";
        System.out.println(message);
        scan.close();
    }
}
