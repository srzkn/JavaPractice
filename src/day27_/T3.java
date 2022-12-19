package day27_;

import java.util.Arrays;

public class T3 {
    public static void main(String[] args) {
        String str = "Wooden Spoon123!.";
        String letters="";
        String digits="";
        String specialChars="";
        char[]chr= str.toCharArray();
        for (char each : chr) {
            if (Character.isLetter(each)) letters+=each;
            else if (Character.isDigit(each)) digits+=each;
            else specialChars+=each;
        }
        System.out.println("letters = " + "\""+ letters+"\"");
        System.out.println("digits = " + "\""+ digits+"\"");
        System.out.println("specialChars = " +"\""+ specialChars+"\"");

    }
}
