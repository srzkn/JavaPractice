package w3ResourceCom;
import java.util.Scanner;
public class InputDivision {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("input the first number");
        int a= input.nextInt();;
        System.out.println("input the second number");
        int b= input.nextInt();
        int c=a/b;
        System.out.println();
        System.out.println("The division of a and b is: "+c);
    }
}
