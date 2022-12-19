package day16_ForLoopAndString;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the sentence");
        String sentence=scan.nextLine();
        System.out.println("Please enter the word");
        String word=scan.next();
        int total=0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.contains(word))
            {
                total+=1;
                sentence=sentence.replaceFirst(word,"");
            }
            else i=sentence.length();
        }
        scan.close();
        System.out.println("total: "+total);
    }
}
