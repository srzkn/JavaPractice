package day20_Arrays;

import java.util.Scanner;

public class T2_ClassmatesReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println("enter full name");
            names[i] = scan.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            String dummy1 = names[i];
            String dummy2 = "";
            int place = dummy1.indexOf(" ");
            int length = dummy1.length();
            for (int j = place - 1; j >= 0; j--) {
                dummy2 += dummy1.charAt(j);
            }
            dummy2 += " ";
            for (int j = dummy1.length() - 1; j >= place + 1; j--) {
                dummy2 += dummy1.charAt(j);
            }
            System.out.println(dummy2);
        }
        scan.close();
    }
}
