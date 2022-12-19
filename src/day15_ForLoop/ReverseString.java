package day15_ForLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write a sentence");
        String sen=scan.nextLine();
        String data="";
        for (int i=sen.length()-1; i>=0; i--)
        {
            data=data+sen.charAt(i);
        }
        sen=data;
        System.out.println(sen);
        scan.close();
    }
}
