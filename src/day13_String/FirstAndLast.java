package day13_String;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a sentence please");
        String sr=scan.nextLine();
        System.out.println(sr.charAt(0)+"&"+sr.charAt(sr.length()-1));
        scan.close();

    }
}
