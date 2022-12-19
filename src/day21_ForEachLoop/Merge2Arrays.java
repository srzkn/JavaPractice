package day21_ForEachLoop;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[]arr1 = {30, 10, 20};
        int[]arr2 = {15, 40, 25, 35};
        int[]arr3 = {8, 9, 17, 5, 4, 1};
        int[]arr4=new int[arr1.length+arr2.length+arr3.length];
        int index=0;
        for (int i : arr1) {
            arr4[index++]=i;
        }
        for (int i : arr2) {
            arr4[index++]=i;
        }
        for (int i : arr3) {
            arr4[index++]=i;
        }
        System.out.println(Arrays.toString(arr4));
    }
}
