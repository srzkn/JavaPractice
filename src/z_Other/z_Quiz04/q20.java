package z_Other.z_Quiz04;

public class q20 {
    public static void main(String[] args) {
        int c=0;
        for (int a = 0; a < 4; a++) {
            if (a==3) continue;
            for (int b = a+1; b < 5; b++) {
                c++;
                if (b==3) break;

            }

        }
        System.out.println(c);
    }
}
