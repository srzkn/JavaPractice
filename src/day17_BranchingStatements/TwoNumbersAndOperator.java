package day17_BranchingStatements;
/*
day17 practice task3
    3. write a program to ask user to enter two number and math operator, and return the result.
		if the operator is invalid operator, ask user to re-enter the operator
		until user provides a valid operator (+, -, *, /)
 */

import java.util.Scanner;

public class TwoNumbersAndOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the FIRST number");
        int num1 = scan.nextInt();
        System.out.println("Please enter the SECOND number");
        int num2 = scan.nextInt();
        System.out.println("enter your operator. +,-,*,/");
        char operator = scan.next().charAt(0);
        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.err.println("Invalid operator. Please Re-enter your operator. +,-,*,/");
            operator = scan.next().charAt(0);
        }
        if (operator == '+')
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        else if (operator == '-')
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        else if (operator == '*')
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        else
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
