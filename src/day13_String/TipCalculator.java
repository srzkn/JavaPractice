package day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)");
        String split = scan.next().toLowerCase();
        System.out.println("Enter the number of people");
        int numberOfPeople = scan.nextInt();
        System.out.println("Enter the check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = scan.next().toLowerCase();
        double totalPay;
        if (serviceQuality.equals("excellent"))
            totalPay = checkAmount * 1.25;
        else if (serviceQuality.equals("great"))
            totalPay = checkAmount * 1.20;
        else if (serviceQuality.equals("good"))
            totalPay = checkAmount * 1.15;
        else if (serviceQuality.equals("fair"))
            totalPay = checkAmount * 1.10;
        else totalPay = checkAmount * 1.05;
        System.out.println("Number of people entered:" + numberOfPeople);
        System.out.println("Total to pay            :" + totalPay);
        System.out.println("Total tip               :" + (totalPay - checkAmount));
        if (split.equals("yes")) {
            System.out.println("Total per person        :" + (totalPay / numberOfPeople));
            System.out.println("Tip per person          :" + ((totalPay - checkAmount) / numberOfPeople));
        }
        scan.close();
    }
}
