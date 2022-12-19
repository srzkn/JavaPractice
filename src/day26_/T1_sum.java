package day26_;

import utilities.mathUtility;

public class T1_sum {
    public static void main(String[] args) {
        int sum=mathUtility.sum(5,7);
        System.out.println(sum);

        double sum2=mathUtility.sum(5.4,5.776767);
        System.out.println(sum2);

        int sub=mathUtility.substraction(5,7);
        System.out.println(sub);

        double sub2=mathUtility.substraction(5.5656,7.454545);
        System.out.println(sub2);

        double div=mathUtility.division(5.5656,7.454545);
        System.out.println(div);

        mathUtility.even(2);

        mathUtility.odd(2);

        int max= mathUtility.max(-5,-666);
        System.out.println(max);

        double maxd=mathUtility.max(-3434.4,343434.44433);
        System.out.println(maxd);

        int min= mathUtility.min(-5,-666);
        System.out.println(min);

        double mind=mathUtility.min(-3434.4,343434.44433);
        System.out.println(mind);

        System.out.println(mathUtility.square(5));
        System.out.println(mathUtility.square(4.4));
        System.out.println(mathUtility.cube(5));
        System.out.println(mathUtility.cube(5.5));
    }
}
