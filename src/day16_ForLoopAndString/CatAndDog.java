package day16_ForLoopAndString;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s = scan.nextLine().toLowerCase();
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.contains("cat")) {
                cat += 1;
                s = s.replaceFirst("cat", "");
            } else if (s.contains("dog")) {
                dog += 1;
                s = s.replaceFirst("dog", "");
            } else i = s.length();
        }
        System.out.println(cat == dog);
        scan.close();
    }
}
