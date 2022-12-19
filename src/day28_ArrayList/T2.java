package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("numbers = " + numbers);
        Integer dummy=numbers.get(0);
        System.out.println("dummy = " + dummy);
        numbers.set(0,numbers.get(numbers.size()-1));
        System.out.println(numbers);
        numbers.set(numbers.size()-1,dummy);
        System.out.println("numbers = " + numbers);
    }
}
