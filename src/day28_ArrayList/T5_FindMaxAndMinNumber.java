package day28_ArrayList;

import java.util.ArrayList;

public class T5_FindMaxAndMinNumber {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
int max=numbers.get(0);
int min=numbers.get(0);

        for (Integer each : numbers) {
            if (each>max) max=each;
        }
        System.out.println(max);

        for (Integer each : numbers) {
            if (each<min) min=each;
        }
        System.out.println(min);
    }
}
