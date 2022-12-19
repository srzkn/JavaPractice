package day18_nestedLoops;

import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        String output ="";
        int freq = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!output.contains("" + word.charAt(i))) {
                output = output + word.charAt(i);
                for (int j = 0; j < word.length(); j++) {
                    if (output.charAt(output.length() - 1) == word.charAt(j))
                        freq++;
                }
                output = output + freq;
                freq = 0;
            }
        }
        System.out.println(output);
    }
}
