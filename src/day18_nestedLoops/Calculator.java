package day18_nestedLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the FIRST number.");
            double n1 = scan.nextDouble();
            System.out.println("please enter the OPERATOR.  + , - ,  * , /");
            char operator = scan.next().charAt(0);
            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.err.println("invalid operator. Please enter the OPERATOR.  + , - ,  * , /\"");
                operator = scan.next().charAt(0);
            }
            System.out.println("Please enter the SECOND number.");
            double n2 = scan.nextDouble();
            if (operator == '+')
                System.out.println(n1 + "" + operator + "" + n2 + "=" + (n1 + n2));
            else if (operator == '-')
                System.out.println(n1 + "" + operator + "" + n2 + "=" + (n1 - n2));
            else if (operator == '*')
                System.out.println(n1 + "" + operator + "" + n2 + "=" + (n1 * n2));
            else
                System.out.println(n1 + "" + operator + "" + n2 + "=" + (n1 / n2));
            System.out.println("Do you want to continue? yes/no");
            scan.nextLine();
            String answer = scan.nextLine().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("invalid answer. Do you want to continue? yes/no");
                answer = scan.nextLine().toLowerCase();
            }
            if (answer.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }
    }
}
