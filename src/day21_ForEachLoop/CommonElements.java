package day21_ForEachLoop;

public class CommonElements {
    public static void main(String[] args) {
        int[]arr1= {1,2,3,4,5};
        int[]arr2= {4,5,6,7,8};
        for (int i : arr1) {
            int count=0;
            for (int i1 : arr2) {
                if (i==i1) count++;
            }
            if (count>=1)             System.out.print(i+" ");
        }
    }
}
