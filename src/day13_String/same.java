package day13_String;

import java.util.Scanner;

public class same {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please write something");
        String sr=scan.nextLine();
        char c1=sr.charAt(0);
        char c2=sr.charAt(sr.length()-1);
        if (c1==c2) System.out.println("same");
        else System.out.println("different");
        scan.close();
    }
}
