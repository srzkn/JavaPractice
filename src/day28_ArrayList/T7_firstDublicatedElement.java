package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class T7_firstDublicatedElement {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,9,9,3,4,4,5,6,7,7));
        System.out.println("numbers = " + numbers);
        for (int i = 0; i < numbers.size(); i++) {
            int number=numbers.get(i);
            if (numbers.indexOf(number)!=numbers.lastIndexOf(number)){
                System.out.println(number);
                System.exit(0);
            }
        }
    }
}
