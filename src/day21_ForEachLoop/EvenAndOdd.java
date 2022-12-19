package day21_ForEachLoop;

public class EvenAndOdd {
    public static void main(String[] args) {
        int[]i={77,34,-4,0,3435,45,12,7,0,-22};
        int even=0, odd=0;
        for (int i1 : i) {
            if (i1%2!=0) odd++;
            else if (i1==0) continue;
            else even++;
        }
        System.out.println("evens are: "+even+" And the odds are: "+odd);
    }
}
