package day23_CustomMethod;

public class T2_EvenBetween1And100 {
    public static void main(String[] args) {
evenNumbersBetween1And100();
    }
    public static void evenNumbersBetween1And100(){
        System.out.println("Even numbers between 1 and 100  are: ");
        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i+" ");
        }
    }
}
