package day09_IfStatementsPractice;

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner inputSalary = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = inputSalary.nextInt();
        double tax1;

        Scanner inputMarriage = new Scanner(System.in);
        System.out.println("Enter your marriage status: married or single");
        String marriage = inputMarriage.next();

        if (salary >= 130000) {
            tax1 = salary * 0.35;
        } else if (salary >= 100000) {
            tax1 = salary * 0.30;
        } else if (salary >= 80000) {
            tax1 = salary * 0.25;
        } else {
            tax1 = salary * 0.20;
        }
        if (marriage.equals("married")) // bir string ifadenin eşitliğini check etme
        {
            tax1 = tax1 - (salary * 0.05);
        }
        System.out.println("Your net salary is: " + (salary - tax1));
    }
}
