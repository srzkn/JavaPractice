package day23_CustomMethod;

public class T15_Calculator {
    public static void main(String[] args) {
        int num1=5;
        int num2=48;
        char operator='+';
        calculate(5,48,'-');
    }
    public static void calculate (double num1, double num2, char operator){
     if (operator=='+')      System.out.println(num1+" + "+num2+" = "+(num1+num2));
     else if (operator=='-') System.out.println(num1+" - "+num2+" = "+(num1-num2));
     else if (operator=='*') System.out.println(num1+" * "+num2+" = "+(num1*num2));
     else if (operator=='/') System.out.println(num1+" * "+num2+" = "+(num1/num2));
    }
}
