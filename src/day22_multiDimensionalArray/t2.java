package day22_multiDimensionalArray;

import java.util.Arrays;

public class t2 {
    public static void main(String[] args) {
        //Input: arr[] = {2, 3, 1, 0, 5, 0, 8}
        //Output = [2, 3, 5, 8, 0, 0, 0]

        int arr[] = {2, 3, 1, 1, 5, 1, 8};
        int arr2[]=new int[arr.length];
        int counter=0;
        for (int each : arr) {
            if (each!=0) arr2[counter++]=each;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
