package day13_String;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cost = 0;
        System.out.println("Do you have a valid passport? (yes or no)");
        String yesNO = scan.next();
        if (yesNO.equals("yes") || yesNO.equals("Yes")) {
            cost = cost + 1000;
            scan.nextLine();
            System.out.println("Which country are you travelling to?");
            String country = scan.nextLine();
            System.out.println("How many bags do you have?");
            byte bag = scan.nextByte();
            cost = cost + (bag * 50);
            System.out.println("How many people are you travelling?");
            short travellersNumber = scan.nextShort();
            if (travellersNumber <= 3)
                cost = cost - (travellersNumber * 100);
            else
                cost = cost - 300;
            scan.nextLine();
            System.out.println("Please write the names of the people that will travel. Write them in one line " +
                    "and Separate with comma");
            String travellerNames = scan.nextLine();
            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " + bag +
                    " bags but you are travelling with " + travellersNumber +
                    " people so we are giving you a discount. Your total cost is $" + cost);
        } else {
            cost = 200;
            System.out.println("When did your passport expire? (The Year)");
            int expireYear = scan.nextInt();
            int totalYears = 2022 - expireYear;
            cost = cost + (totalYears * 75);
            System.out.println("Which country are you planning to travel?");
            scan.nextLine();
            String countryName = scan.nextLine();
            System.out.println("Will you be travelling in the next year?");
            String yesNo = scan.next();
            if (yesNo.equals("Yes") || (yesNo.equals("yes"))) cost = cost + 100;
            else cost = cost - 50;
            System.out.println("Looks like your passport has been expired for " + totalYears +
                    " years, but not to worry. We will get it ready for you to travel to "
                    + countryName + ". Your total cost has come out to " + cost + ".");
        }
        scan.close();
    }
}
