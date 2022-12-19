package day10_Ternaries;

public class BiggerNum {
    public static void main(String[] args) {
        int n1 = 8, n2 = 9, n3 = 7;
        String st = "";
        st = (n1 > n2 && n1 > n3) ? "n1 is bigger" : (n2 > n1 && n2 > n3) ? "n2 is bigger"
                : "n3 is bigger";
        System.out.println(st);
    }
}
