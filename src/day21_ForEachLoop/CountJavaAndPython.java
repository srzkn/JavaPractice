package day21_ForEachLoop;

import java.util.Arrays;

public class CountJavaAndPython {
    public static void main(String[] args) {
        String sentence="java is good but java is java anb python and java python python java java nepythonder java python";
        String[]words=sentence.split(" ");
        String checkJava="";
        String checkPython="";
        int countJava=0;
        int countpython=0;
        for (String word : words) {
            if (word.equals("java")) countJava++;
            if (word.equals("python")) countpython++;
        }
        System.out.println("number of java: "+countJava);
        System.out.println("number of phyton: "+countpython);
    }
}
