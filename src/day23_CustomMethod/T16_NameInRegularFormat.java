package day23_CustomMethod;

import java.util.Scanner;

public class T16_NameInRegularFormat {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Name and Last Name?");
        String fullName=scan.nextLine();
        regularNameFormat(fullName);
    }
    public static void regularNameFormat(String fullName){
        int s=fullName.indexOf(" ");
        fullName=fullName.toLowerCase();
    fullName=fullName.substring(0,1).toUpperCase()+fullName.substring(1,s+1)+
            fullName.substring(s+1,s+2).toUpperCase()+fullName.substring(s+2,fullName.length());
        System.out.println(fullName);
    }
}
