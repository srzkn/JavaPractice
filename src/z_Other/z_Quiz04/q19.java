package z_Other.z_Quiz04;

public class q19 {
    public static void main(String[] args) {
        int i1=2;
        int i2=6;
        int it=5;
        int tot=0;
        for (int j = 0; j < it; j++) {
            if (j%3==0) continue;;
            tot+=i1+i2;
        }
        System.out.println(tot);
    }
}
