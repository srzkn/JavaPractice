package day15_ForLoop;

import java.util.Scanner;

public class Retrieve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String s = scan.nextLine().toLowerCase();
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                letters = letters + s.charAt(i);
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                digits = digits + s.charAt(i);
            else specialChars = specialChars + s.charAt(i);
        }
        System.out.println("letters       : " + letters);
        System.out.println("digits        : " + digits);
        System.out.println("special shars : " + specialChars);
        scan.close();
    }
}
