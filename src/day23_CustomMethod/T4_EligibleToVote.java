package day23_CustomMethod;

import java.util.Scanner;

public class T4_EligibleToVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("old are you?");
        int age=scan.nextInt();
        System.out.println(scan.nextLine());
        System.out.println("Where do you live");
        String country=scan.nextLine().toLowerCase();
        eligibleToVote(age,country);
    }
    public static void eligibleToVote(int age, String country){
        if (age<18) {
            System.out.println("you should be at least 18 to Vote!");
        System.exit(0);}
        else
        {
            if (country.equals("usa")) System.out.println("yes! you can vote");
            else System.out.println("You should be a USA citizen to vote!");

        }
    }
}
