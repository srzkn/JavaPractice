package day20_Arrays;

import java.util.Arrays;

public class T5_ArrayOfIntegers {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5};
        int[]reversedArray=new int[array.length];
        for (int i = 0, j=array.length-1; i <array.length; i++, j--) {
            reversedArray[i]=array[j];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));
    }
}
