package day23_CustomMethod;

public class T1_OddBetween1And100 {




    public static void main(String[] args) {
        oddBetween1And100();
    }
    public static void oddBetween1And100(){
        System.out.println("Odd numbers between 1 and 100 are: ");
        for (int i = 1; i <101 ; i+=2) {
            System.err.print(i+" ");
        }
    }

}
