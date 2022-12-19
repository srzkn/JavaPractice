package day20_Arrays;

import java.util.Arrays;

public class T6_moveZeros {
    public static void main(String[] args) {
        int[]array = {10, 0, 5, 0, 1, 0};
        int[]withoutZero=new int[array.length];
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0)
            {
                withoutZero[count]=array[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(withoutZero));
    }
}
