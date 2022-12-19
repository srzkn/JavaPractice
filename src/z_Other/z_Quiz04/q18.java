package z_Other.z_Quiz04;

public class q18 {
    public static void main(String[] args) {
        String i="today it will be 100 degrees !";
        int n=0;
        while(n++<i.length()){
            if (n==8){
                continue;
            } else if (n==9){
                break;
            }
            System.out.print(i.charAt(++n));
        }
    }
}
