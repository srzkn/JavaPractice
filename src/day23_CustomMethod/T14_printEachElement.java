package day23_CustomMethod;

public class T14_printEachElement {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
    elementsOfAnnIntegerArray(arr);
    }
public static void elementsOfAnnIntegerArray(int[]arr){
    for (int i : arr) {
        System.out.print(i+" ");
    }
}
}
