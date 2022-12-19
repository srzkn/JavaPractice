package day17_BranchingStatements;
//day17 practice task5
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String answer = scan.nextLine().toLowerCase();

        while (!((answer.equals("yes")) || (answer.equals("no")))) {
            System.err.println("invalid answer. Do you want to reserve a room?");
            answer = scan.nextLine().toLowerCase();
        }
        if (answer.equals("no"))
            System.out.println("have a nice day");
        else {
            System.out.println("Please enter the room type: 'King bed' / 'Queen Bed' / 'Single Bed'");
            String bedType = scan.nextLine().toLowerCase();

            while (!((bedType.equals("king bed")) || (bedType.equals("queen bed")) || (bedType.equals("single bed"))))
            {
                System.err.println("invalid answer. Please Re-enter the room type: 'King bed' / 'Queen Bed' / 'Single Bed'");
                bedType = scan.nextLine().toLowerCase();
            }
            if (bedType.equals("king bed"))
                System.out.println("King Bed ==> 120$");
            else if (bedType.equals("queen bed"))
                System.out.println("Queen Bed ==> 100$");
            else
                System.out.println("Single Bed ==> 80$");
        }
        scan.close();
    }
}
