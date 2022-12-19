package day24_;

import java.util.Arrays;
import java.util.Scanner;

public class T11 {
    public static void main(String[] args) {
       /*
       1-Find Factorial of a number with using loop and also try without using loop
   //input = 5! (5x4x3x2x1)
   //output = 120
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scan.nextInt();
        int result=1;                           //1 is identity element (etkisiz eleman) in multiplication
        for (int i = number; i>0; i--) {
          result*=i;
        }
        System.out.println(result);
        }
}
