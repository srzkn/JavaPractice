package day27_;

import java.util.Arrays;

public class T2_Swap {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        arr=swap(arr,0,4);
        System.out.println(Arrays.toString(arr));

        String[]arrs={"a","b","c","d","e","f","g"};
        arrs=swap(arrs,0,4);
        System.out.println(Arrays.toString(arrs));


    }
    //swaps the element at the first given index with the element at the second given index and returns the new array
    public static int[] swap(int[]arr,int index1, int index2){
        int []arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i==index1) arr2[i]=arr[index2];
            else if (i==index2) arr2[i]=arr[index1];
            else arr2[i]=arr[i];
        }
        return arr2;
    }

    //swaps the element at the first given index with the element at the second given index and returns the new array
    public static double[] swap(double[]arr,int index1, int index2){
        double []arr2=new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i==index1) arr2[i]=arr[index2];
            else if (i==index2) arr2[i]=arr[index1];
            else arr2[i]=arr[i];
        }
        return arr2;
    }

    //swaps the element at the first given index with the element at the second given index and returns the new array
    public static char[] swap(char[]arr,int index1, int index2){
        char []arr2=new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i==index1) arr2[i]=arr[index2];
            else if (i==index2) arr2[i]=arr[index1];
            else arr2[i]=arr[i];
        }
        return arr2;
    }

    //swaps the element at the first given index with the element at the second given index and returns the new array
    public static String[] swap(String[]arr,int index1, int index2){
        String []arr2=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i==index1) arr2[i]=arr[index2];
            else if (i==index2) arr2[i]=arr[index1];
            else arr2[i]=arr[i];
        }
        return arr2;
    }
}
