package day16_ForLoopAndString;

import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
int pos=0;
int neg=0;
        for (int i = 1; i <6; i++) {
            System.out.println("Please enter a number");
            int number=scan.nextInt();
            if(number>0) pos+=1;
            else if (number<0) neg+=1;
            else pos=pos;
        }
        System.out.println(pos+" positive and "+neg+" negative");
    scan.close();
    }
}
