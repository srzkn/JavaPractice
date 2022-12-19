package day14_String;

import java.util.Scanner;

public class twoWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write the FIRST word");
        String s1=scan.next();
        System.out.println("Please write the SECOND word");
        String s2=scan.next();
        System.out.println(s1.substring(1)+s2.substring(1));
        scan.close();
    }
}
