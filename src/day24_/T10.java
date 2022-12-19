package day24_;

import java.util.Arrays;

public class T10 {
    public static void main(String[] args) {
        /*
        	10. create a method named removeElement that passes one integer array and one integer,
        	the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2
				removeElement(array, index) ==== {10, 20, 40, 50, 60}
         */
       int[] array = {10, 20, 30, 40, 50, 60};
       int index = 2;
       int[]arr2=removeElement(array,index);
       System.out.println(Arrays.toString(arr2));
    }
    public static int[] removeElement(int[]array,int index){
        int[]arr2=new int[array.length-1];
        int counter=0;
        int c2=0;
        for (int i : array) {
            if (c2++==index) continue;
            else arr2[counter++]=i;
        }
        return arr2;
    }
}
