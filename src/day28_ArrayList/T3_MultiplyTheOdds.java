package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class T3_MultiplyTheOdds {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2!=0) numbers.set(i,numbers.get(i)*2);
        }
        System.out.println("numbers = " + numbers);
    }}
