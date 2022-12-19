package day23_CustomMethod;

import java.util.Scanner;

public class T3_EligibleToBuyAlcohol {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("How old are you?");
        int age= scan.nextInt();
        EligibleToBuyAlcohol(age);
    }
    public static void EligibleToBuyAlcohol(int age){
        if (age>=18) System.out.println("You are eligible to buy alcohol");
        else System.out.println("Yo CAN NOT buy alcohol");
    }
}
