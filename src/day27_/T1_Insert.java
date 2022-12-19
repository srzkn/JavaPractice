package day27_;

import java.util.Arrays;

public class T1_Insert {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        arr=insert(arr,2,99999);
        System.out.println(Arrays.toString(arr));

        String[]s={"adana", "mersin", "hatay", "yozgat", "sinop", "samsun"};
        s=insert(s,2,"XXXXXXXXXX");
        System.out.println(Arrays.toString(s));
    }
    //inserts the given element to the given index of an int array.
    public static int[]insert(int[]arr,int index,int element)
    {
        int[]arr2=new int[arr.length+1];
        int k=0;
        for (int i = 0; i < arr2.length; i++) {
            if (i==index)
                arr2[i]=element;

            else arr2[i]=arr[k++];
        }
        return arr2;
        }

    //inserts the given element to the given index of a double array.
    public static double[]insert(double[]arr,int index,double element)
    {
        double[]arr2=new double[arr.length+1];
        int k=0;
        for (int i = 0; i < arr2.length; i++) {
            if (i==index)
                arr2[i]=element;

            else arr2[i]=arr[k++];
        }
        return arr2;
    }

    //inserts the given element to the given index of a char array.
    public static char[]insert(char[]arr,int index,char element)
    {
        char[]arr2=new char[arr.length+1];
        int k=0;
        for (int i = 0; i < arr2.length; i++) {
            if (i==index)
                arr2[i]=element;

            else arr2[i]=arr[k++];
        }
        return arr2;
    }

    //inserts the given element to the given index of a String array.
    public static String[]insert(String[]arr,int index,String element)
    {
        String[]arr2=new String[arr.length+1];
        int k=0;
        for (int i = 0; i < arr2.length; i++) {
            if (i==index)
                arr2[i]=element;

            else arr2[i]=arr[k++];
        }
        return arr2;
    }
}
