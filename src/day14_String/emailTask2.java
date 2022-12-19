package day14_String;

import java.util.Scanner;

public class emailTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your EMAIL address");
        String s=scan.nextLine();
        String fName=s.substring(0,s.indexOf("_"));
        String f=fName.toUpperCase();
        String lName=s.substring(s.indexOf("_")+1, s.indexOf("@"));
        String l=lName.toUpperCase();
        String domain=s.substring(s.indexOf("@")+1,s.indexOf("."));
        System.out.println("First name: "+f.charAt(0)+fName.substring(1)+"\n"
                +"Fast name:"+l.charAt(0)+lName.substring(1)+"\n"
        +"Domain: "+domain);
        scan.close();
    }
}
