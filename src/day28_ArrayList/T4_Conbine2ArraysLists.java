package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class T4_Conbine2ArraysLists {
    public static void main(String[] args) {
        ArrayList<String>s1=new ArrayList<>();
        s1.addAll(Arrays.asList("A","B","C"));
        ArrayList<String>s2=new ArrayList<>();
        s2.addAll(Arrays.asList("D","E","F","G"));
        for (String each : s2) {
            s1.add(each);
        }
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
