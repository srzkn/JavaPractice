package w3ResourceCom;

import java.util.Scanner;

public class InputName {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("input your first name");
        String fname= input.next();
        System.out.println("input your last name");
        String lname= input.next();
        System.out.println();
        System.out.println("Hello,\n"+fname+" "+lname );
    }
}
