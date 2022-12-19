package day18_nestedLoops;

import java.util.Scanner;

public class Freq {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = scan.nextLine();
        String result = "";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//each character from str
            int count = 0;//frequency of the character

            for (int i = 0; i < str.length(); i++) {// finds the frequency of the cahracter
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            if (count != 1) { // if it appears more than once skip it
                continue;
            }

            result += ch;


        }
        scan.close();
    }
}
