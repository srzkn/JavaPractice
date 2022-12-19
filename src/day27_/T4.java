package day27_;

public class T4 {
    public static void main(String[] args) {
        String str = "JAVA java";
        int upper=0;
        int lower=0;
char[]ch=str.toCharArray();
        for (char each : ch) {
            if (Character.isUpperCase(each)) upper++;
            else if (Character.isLowerCase(each)) lower++;
        }
        System.out.println(upper==lower);
    }
}
