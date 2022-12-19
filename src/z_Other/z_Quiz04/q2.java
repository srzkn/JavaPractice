package z_Other.z_Quiz04;

public class q2 {
    public static void main(String[] args) {
        String ta="A ";
        ta=ta.concat("B ");
        String tb="C ";
        ta=ta+tb;
        ta.replace('C','D');
        ta=ta+tb;
        System.out.println(ta);
    }
}
