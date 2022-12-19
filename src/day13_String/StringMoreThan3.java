package day13_String;

import java.util.Scanner;

public class StringMoreThan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please write a word or a sentence");
        String s1 = scan.nextLine();
        int l1 = s1.length();
        if (l1 > 3) System.out.println(s1.charAt(l1 - 3) + "" + s1.charAt(l1 - 2) + "" + s1.charAt(l1 - 1));
        else if (l1 == 0) System.out.println("string is empty");
        else System.out.println(s1);
        scan.close();
    }
}
