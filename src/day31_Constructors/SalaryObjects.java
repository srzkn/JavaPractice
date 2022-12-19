package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class SalaryObjects {
    public static void main(String[] args) {
        SalaryCalculator salary1= new SalaryCalculator(15,5,10,40);
        SalaryCalculator salary2= new SalaryCalculator(25,8,6,40);
        SalaryCalculator salary3= new SalaryCalculator(30,8,8,40);
        System.out.println(salary1);

        SalaryCalculator[]salaries={salary1,salary2,salary3};
        System.out.println(Arrays.toString(salaries));
        System.out.println("--------------------------------------------------------");
        ArrayList<SalaryCalculator>list=new ArrayList<>(Arrays.asList(salaries));
        System.out.println("list = " + list);
        System.out.println("-------------------------------------------------------");
        System.out.println(list);
    }
}
