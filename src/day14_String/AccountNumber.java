package day14_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write your ACCOUNT NUMBER");
        String accountNumber = scan.next();
        String message = "";
        if (accountNumber.charAt(0) == '2' || accountNumber.charAt(0) == '5') {
            if (accountNumber.charAt(0) == '2') {
                if (accountNumber.length() == 7) {
                    message = "YOU ARE GOOD TO GO";
                } else {
                    message = "Invalid account number";
                }
            } else {
                if (accountNumber.length() == 10)
                    message = "YOU ARE GOOD TO GO";
                else message = "Invalid account number";
            }
        } else {
            message = "Invalid account number";
        }
        System.out.println(message);
        scan.close();
    }
}
