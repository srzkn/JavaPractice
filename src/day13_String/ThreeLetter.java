package day13_String;

import java.util.Scanner;

public class ThreeLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a 3 letter word");
        String s1 = scan.next();
        String message;
        if (s1.length() == 3) {
            if (s1.charAt(1) == 'a') message = "Cool word";
            else message = "Okay word";
        } else {
            if (s1.length() < 3)
                message = "Word is too short";
            else message = "Word is too long";
        }
        System.out.println(message);
        scan.close();
    }
}
