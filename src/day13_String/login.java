package day13_String;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("USERNAME:");
        String userName = scan.nextLine();
        System.out.println("PASSWORD:");
        String password = scan.nextLine();
        if (userName.equals("Cydeo") && password.equals("WoodenSpoon"))
            System.out.println("Logged in");
        else System.err.println("Incorrect username or password");
        scan.close();
        ;
    }
}
