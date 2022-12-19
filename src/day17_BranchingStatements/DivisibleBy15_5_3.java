package day17_BranchingStatements;
// day17_practice task 4
import java.util.Scanner;

public class DivisibleBy15_5_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scan.nextInt();
        String divisibleBy15="";
        String divisibleBy5="";
        String divisibleBy3="";
        for (int i = 1; i <=num ; i++) {
            if (i%15==0)
                divisibleBy15+=i+" ";
            else if (i%5==0)
                divisibleBy5+=i+" ";
            else if (i%3==0)
                divisibleBy3+=i+" ";
                else continue;
        }
        System.out.println("numbers divisible by 15 are: "+divisibleBy15);
        System.out.println("numbers divisible by 5 are: "+divisibleBy5);
        System.out.println("numbers divisible by 3 are: "+divisibleBy3);
        scan.close();
    }
}
