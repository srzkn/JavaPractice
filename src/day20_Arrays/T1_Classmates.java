package day20_Arrays;

import java.util.Scanner;

public class T1_Classmates {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[]classmates=new String[10];
        for (int i = 0; i < classmates.length; i++) {
            System.out.println("full name");
            classmates[i]=scan.nextLine();
        }
        for (int i = 0; i < classmates.length; i++) {
            String fullname=classmates[i];
            int place=fullname.indexOf(' ');
            System.out.println(fullname.charAt(0)+"."+fullname.charAt(place+1));
        }
    }
}
