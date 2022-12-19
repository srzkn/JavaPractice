package day11_SwitchScanner;
import java.util.Scanner;

public class CydeoBatchesScanner_IF {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your Batch?");
        String batchName= input.nextLine();
        String message="";
        if (batchName.equals("US morning") || batchName.equals("US evening") || batchName.equals("EU"))
        {
         if (batchName.equals("US morning"))
         {
             message="Class times are 10-5 EST. M, T, Th, F.";
         }
         else if (batchName.equals("US evening"))
         {
             message="Class times are 7-10 EST. M, T, W, Th, S, S";
         }
         else
         {
             message="Class times are 10-5 EST. M, T, W, Th, F.";
         }
        }
        else
        {
            message="Invalid Batch";
        }
        System.out.println(message);
    }
}
