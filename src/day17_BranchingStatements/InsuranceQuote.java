package day17_BranchingStatements;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println("Enter your gender ('m' / 'f' / 'male' / 'female')");
        String gender = scan.nextLine().toLowerCase();
        if (!(gender.equals("male") || gender.equals("female") || gender.equals("m") || gender.equals("f")))
            while (!(gender.equals("male") || gender.equals("female") || gender.equals("m") || gender.equals("f"))) {
                System.err.println("invalid entry. Re-enter your gender ( m / f / male / female)");
                gender = scan.nextLine().toLowerCase();
            }
        double totalPrice = 0;
        System.out.println("Are you married? ( yes / no)");
        String marriage = scan.nextLine().toLowerCase();
        if (!(marriage.equals("yes") || marriage.equals("no")))
            while (!(marriage.equals("yes") || marriage.equals("no"))) {
                System.err.println("invalid entry. Are you married? ( yes / no)");
                marriage = scan.nextLine().toLowerCase();
            }

        System.out.println("Enter your age.");
        int age = scan.nextInt();
        if (age < 1 || age > 120)
            while (age < 1 || age > 120) {
                System.err.println("invalid entry. Enter yout age");
                age = scan.nextInt();
            }

        System.out.println("How many miles do you drive a day?");
        int milesADay = scan.nextInt();
        if (milesADay < 5)
            while (milesADay < 5) {
                System.err.println("invalid entry. How many miles do you drive a day?");
                milesADay = scan.nextInt();
            }

        scan.nextLine();
        System.out.println("Which one do you want? full coverage / liability");
        String coverageType = scan.nextLine().toLowerCase();
        if (!(coverageType.equals("full coverage") || coverageType.equals("liability")))
            while (!(coverageType.equals("full coverage") || coverageType.equals("liability"))) {
                System.err.println("invalid entry. Which one do you want? full coverage / liability");
                coverageType = scan.nextLine().toLowerCase();
            }

        System.out.println("Did you have any accidents in past 5 years?  yes/no");
        String accidents = scan.nextLine().toLowerCase();
        if (!(accidents.equals("yes") || accidents.equals("no")))
            while (!(accidents.equals("yes") || accidents.equals("no"))) {
                System.err.println("invalid entry. Did you have any accidents in past 5 years?  (yes/no)");
                accidents = scan.nextLine().toLowerCase();
            }

        System.out.println("Does your car have an anti-theft device? (yes/no)");
        String device = scan.nextLine().toLowerCase();
        if (!(device.equals("yes") || device.equals("no")))
            while (!(device.equals("yes") || device.equals("no"))) {
                System.err.println("invalid entry. Does your car have an anti-theft device? (yes/no)");
                device = scan.nextLine().toLowerCase();
            }

        if (coverageType.equals("liability")) {
            if (age < 25) {
                totalPrice = 90;
            } else totalPrice = 50;

            if (milesADay <= 10) totalPrice += 10;
            else if (milesADay > 10 && milesADay <= 50) totalPrice += 30;
            else totalPrice += 50;
        } else {
            if (age < 25) {
                totalPrice = 160;
            } else totalPrice = 120;

            if (milesADay <= 10) totalPrice += 20;
            else if (milesADay > 10 && milesADay <= 50) totalPrice += 40;
            else totalPrice += 70;
        }
        if (device.equals("yes")) totalPrice = totalPrice * 0.95;
        if (accidents.equals("yes")) totalPrice = totalPrice * 1.15;
        else totalPrice = totalPrice * 0.9;
        if (marriage.equals("yes")) totalPrice = totalPrice * 0.95;
        System.out.println("Total price is: "+totalPrice);
    }
}
