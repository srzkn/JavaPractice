package day22_multiDimensionalArray;

import java.util.Arrays;

public class T1_Reverse2DimensionalArray {
    public static void main(String[] args) {
        /*
        output:
			reverse = { {6,5,4}, {3,2,1},};
         */

        int array[][] = { {1,2,3}, {4,5,6}};
        int reverse[][]=new int[2][3];
        int k=0;
        int l=0;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j=array[i].length-1; j>=0; j--)
            {
                reverse[k][l]=array[i][j];
                l++;
            }
            k++;
            l=0;
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(reverse));
    }
}
