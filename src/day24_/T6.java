package day24_;

import java.util.Arrays;

public class T6 {
    public static void main(String[] args) {
        /*
            6. create a method named addElement that takes one integer array and one integer,
            the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
         */
        int arr[]={1,2,3};
        int number=4;
        int arr2[]=addElement(arr,number);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] addElement(int[] arr, int number)
    {
        int []arr2=new int[arr.length+1];
int counter=0;
        for (int i : arr) {
            arr2[counter++]=i;
        }
        arr2[counter]=number;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        return arr2;
    }
}
