package day24_;

import java.util.Arrays;

public class T8 {
    public static void main(String[] args) {
        /*
        	8. Create method named reverse that passes an integer array parameter,
        	the method can return the reversed array
				Ex:

					reverse(arr) ==> {40, 30, 20, 10}

         */
        int[]arr = {10, 20, 30, 40};
        int reversed[]=reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reversed));
    }
    public static int [] reverse(int[]arr){
        int[]reversed=new int[arr.length];
        int counter=0;
        for (int i=arr.length-1; i>=0; i--) {
            reversed[counter++]=arr[i];
        }
        return reversed;
    }
}
