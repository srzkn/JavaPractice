package day15_ForLoop;
import java.util.Scanner;
public class cal  {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Plese enter first number");
        double number= scanner.nextDouble();

        System.out.println("Please enter your second number");
        double number2= scanner.nextDouble();

        System.out.println("please enter your operator");
        String operator = scanner.next();
        double result=0;

        switch (operator){
            case "+":
                result=number+number2;
                break;
            case "-":
                result=number-number2;
                break;

            case "*":
                result=number*number2;
                break;
            case "/":
                result=number/number2;
                break;
            default:
                System.out.println("only +-*/");
        }
        System.out.println("result = " + result);

    }
}
