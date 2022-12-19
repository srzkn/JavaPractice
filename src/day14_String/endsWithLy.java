package day14_String;

import java.util.Scanner;

public class endsWithLy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.next();
        int length = word.length();
        String word2 = word.substring(length - 2);
        if (word2.equals("ly")) System.out.println("really???");
        else System.out.println("never mind");
        scan.close();
    }
}
