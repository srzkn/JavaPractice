package day23_CustomMethod;
import java.util.Scanner;
public class T16_NameInRegularFormat2 {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Full name?");
        String fullName=scan.nextLine().toLowerCase();
        regularFullName(fullName);
    }
    public static void regularFullName(String fullName){
        String[]names=fullName.split(" ");
        for(String each:names)
        {
            System.out.print(each.substring(0,1).toUpperCase()+each.substring(1,each.length())+" ");
        }
    }
}
