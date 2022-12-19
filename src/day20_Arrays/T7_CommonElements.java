package day20_Arrays;

public class T7_CommonElements {
    public static void main(String[] args) {
        int[]arr1={1,4,3,4,5};
        int[]arr2={4,5,5,7,4};
        String common="";
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr2.length; i1++) {
                if (arr1[i]==arr2[i1] && !common.contains(""+arr1[i])) common+=arr1[i]+" ";
            }
        }
        System.out.println(common);
    }
}
