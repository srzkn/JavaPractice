package w3ResourceCom;

import java.util.Scanner;

public class InputSumOf2Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the first number");
        int num1= input.nextInt();
        System.out.println("input the second number");
        int num2= input.nextInt();
        int sum=num1+num2;
        System.out.println();
        System.out.println("Sum: "+sum);
    }
}
