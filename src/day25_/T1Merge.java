package day25_;

import utilities.arraysUtility;

import java.util.Arrays;

public class T1Merge {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int[]b={7,8,9,20};
        int[]c= arraysUtility.merge(a,b);
        System.out.println(Arrays.toString(c));
        System.out.println("-------------------------------");

        double[]d={1.66,2.6,3.6,4.6,5.6};
        double[]e={7.6,8.6,9.6,20.6};
        double[]f= arraysUtility.merge(d,e);
        System.out.println(Arrays.toString(f));
        System.out.println("-------------------------------");

        char[]g={'!','^','+','%'};
        char[]h={'&','(','=','?'};
        char[]i= arraysUtility.merge(g,h);
        System.out.println(Arrays.toString(i));
        System.out.println("-------------------------------");

        String[]j={"q","w","e","r","t","y"};
        String[]k={"Q","W","E","R","T","Y"};
        String[]l= arraysUtility.merge(j,k);
        System.out.println(Arrays.toString(l));
        System.out.println("-------------------------------");

    int[]i1={434,56,34,98,989,34,456};
    int maxi=arraysUtility.max(i1);
        System.out.println(maxi);
        System.out.println("-----------------");

        double[]dob={0.8,0.4,34.7,-45.6,-666.5};
        double max=arraysUtility.max(dob);
        System.out.println(max);
        System.out.println("-------------------------");

        long[]l1={41134,5116,3114,9811,98911,3411,411156};
        long maxl=arraysUtility.max(l1);
        System.out.println(maxl);
        System.out.println("-----------------");

        long[]s1={434,16,14,11,11,11,156};
        long maxs=arraysUtility.max(s1);
        System.out.println(maxs);
        System.out.println("-----------------");

        int[]arr={1,2,3,4,5};
        int[]reversed=arraysUtility.reverse(a);
        System.out.println(Arrays.toString(reversed));
        System.out.println("---------------------");

        double[]arrdd={1.4,2.5,3.6,4.7,5.8};
        double[]reversedd=arraysUtility.reverse(arrdd);
        System.out.println(Arrays.toString(reversedd));
        System.out.println("---------------------");

        char[]c1={'!','^','+','%','&','/'};
        char[]reversedChar=arraysUtility.reverse(c1);
        System.out.println(Arrays.toString(reversedChar));
        System.out.println("----------------");

        String[]ss1={"A","B","C","D","E","F","G","H",};
        String[]reversedString=arraysUtility.reverse(ss1);
        System.out.println(Arrays.toString(reversedString));
        System.out.println("----------------");
    }
}
