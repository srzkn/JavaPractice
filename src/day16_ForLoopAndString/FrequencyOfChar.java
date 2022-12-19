package day16_ForLoopAndString;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String sr = scan.nextLine();
        System.out.println("Please enter a char");
        char ch = scan.next().charAt(0);
        int total = 0;
        for (int i = 0; i < sr.length(); i++) {
            if (sr.charAt(i) == ch) total += 1;
        }
        System.out.println(total);
        scan.close();
    }
}
