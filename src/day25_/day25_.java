package day25_;

import java.util.Arrays;

public class day25_ {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        int[]arr2={6,7,8,9,10};
        int[]arr=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr));

        double[]arr1d={11.5,21.5,31,41.5,51.5};
        double[]arr2d={6,7.00,8.0,9.5,10.5};
        double[]arrd=merge(arr1d,arr2d);
        System.out.println(Arrays.toString(arrd));

        char[]arr1c={'n','f','t','%','e'};
        char[]arr2c={'^','+','%','6','Z'};
        char[]arrc=merge(arr1c,arr2c);
        System.out.println(Arrays.toString(arrc));

        String[]arr1S={"a","b","c","d","e"};
        String[]arr2S={"A","B","C","D","E"};
        String[]arrS=merge(arr1S,arr2S);
        System.out.println(Arrays.toString(arrS));
    }

    private static int[] merge(int[]arr1,int[]arr2)
    {
        int[]arr=new int[arr1.length+arr2.length];
        int counter=0;
        for (int i : arr1) {    arr[counter++]=i;   }
        for (int i : arr2) {    arr[counter++]=i;   }
        return arr;
    }
    private static double[] merge(double[]arr1,double[]arr2)
    {
        double[]arr=new double[arr1.length+arr2.length];
        int counter=0;
        for (double i : arr1) {    arr[counter++]=i;   }
        for (double i : arr2) {    arr[counter++]=i;   }
        return arr;
    }
    private static char[] merge(char[]arr1,char[]arr2)
    {
        char[]arr=new char[arr1.length+arr2.length];
        int counter=0;
        for (char i : arr1) {    arr[counter++]=i;   }
        for (char i : arr2) {    arr[counter++]=i;   }
        return arr;
    }
    private static String[] merge(String[]arr1,String[]arr2)
    {
        String[]arr=new String[arr1.length+arr2.length];
        int counter=0;
        for (String i : arr1) {    arr[counter++]=i;   }
        for (String i : arr2) {    arr[counter++]=i;   }
        return arr;
    }
}
