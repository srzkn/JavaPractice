package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class T8_TotalNumbers {
    public static void main(String[] args) {
        ArrayList<Integer>scores=new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        System.out.println("scores = " + scores);
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i)<101&&scores.get(i)>89) gradeOfA.add(scores.get(i));
            else if (scores.get(i)<90&&scores.get(i)>79) gradeOfB.add(scores.get(i));
            else if (scores.get(i)<80&&scores.get(i)>69) gradeOfC.add(scores.get(i));
            else if (scores.get(i)<70&&scores.get(i)>59) gradeOfD.add(scores.get(i));
            else if (scores.get(i)<60) gradeOfF.add(scores.get(i));
        }
        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);
    }
}
