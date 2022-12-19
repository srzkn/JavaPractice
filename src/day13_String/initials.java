package day13_String;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("First Name");
        String s1=scan.nextLine();
        String s10=s1.toUpperCase();
        System.out.println("Last Name");
        String s2=scan.nextLine();
        String s20=s2.toUpperCase();
        char i1=s10.charAt(0);
        char i2=s20.charAt(0);
        System.out.println(i1+"."+i2);
        scan.close();
    }
}
