package day14_String;

import java.util.Scanner;

public class startWithX {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
        String s= scan.next();
        char s1=s.charAt(0);
        if (s1=='x') System.out.println(s.substring(1));
        else System.out.println(s);
        scan.close();
    }
}
