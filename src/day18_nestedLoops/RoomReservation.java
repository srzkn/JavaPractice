package day18_nestedLoops;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("which bedroom do you want to reserve? King Bed / Queen Ben / Single Bed");
            String bedType = scan.nextLine().toLowerCase();
            while (!(bedType.equals("king bed") || bedType.equals("queen bed") || bedType.equals("single bed"))) {
                System.err.println("incorrect bed type. please Re-enter.");
                System.out.println("which bedroom do you want to reserve? King Bed / Queen Bed / Single Bed");
                bedType = scan.nextLine().toLowerCase();
            }
            System.out.println("How many days are you staying");
            int day = scan.nextInt();
            while (!(day > 0)) {
                System.err.println("incorrect entry. please Re-enter.");
                System.out.println("How many days are you staying");
                day = scan.nextInt();
            }
            System.out.println("Bed Type : " + bedType);
            System.out.println("Stay Time: " + day + " days");
            if (bedType.equals("king bed")) System.out.println("Total pay: $" + (180 * day));
            else if (bedType.equals("queen bed")) System.out.println("Total pay: $" + (100 * day));
            else System.out.println("Total pay: $" + (80 * day));

            System.out.println("would you like to reserve another room?");
            scan.nextLine();
            String answer = scan.nextLine().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("incorrect bed type. please Re-enter.");
                System.out.println("would you like to reserve another room?");
                answer = scan.nextLine().toLowerCase();
            }
            if (answer.equals("no")) break;
        }
    }
}
