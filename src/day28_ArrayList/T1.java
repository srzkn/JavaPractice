package day28_ArrayList;

import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.set(numbers.size()-1,0);
        System.out.println(numbers);

    }
}
