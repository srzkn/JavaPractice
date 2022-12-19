package day09_IfStatementsPractice;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input1=new Scanner(System.in);
        System.out.println("Please write the first number");
        double n1= input1.nextDouble();
        System.out.println("Please write the second number");
        double n2= input1.nextDouble();
        System.out.println("Please write the operator");
        char mathOperator= input1.next().charAt(0);
        if (mathOperator=='+' || mathOperator=='-' || mathOperator=='/' || mathOperator== '*')
        {
            if      (mathOperator=='+') {    System.out.println(n1+n2); }
            else if (mathOperator=='-') {    System.out.println(n1-n2); }
            else if (mathOperator=='/') {    System.out.println(n1/n2); }
            else                        {    System.out.println(n1*n2); }
        }
        else {
            System.out.println("invalid operator");
        }
    }
}
