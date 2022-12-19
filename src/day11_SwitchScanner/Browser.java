package day11_SwitchScanner;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your browser name?");
        String browserName=input.next();
        String message;
        switch (browserName)
        {
            case "chrome": case "firefox": case "opera": case "safari": case "edge":
                message=browserName;
                break;
            default:
                message="Invalid Browser";
        }
        System.out.println(message);
    }
}
