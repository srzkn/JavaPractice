package day35_OOP_Encapsulation;

public class CreditensialsObjects {
    public static void main(String[] args) {
        Credentials credentials1=new Credentials("Ozkan", "Ankara01!");
        Credentials credentials2=new Credentials("Ozkan", "a");

        System.out.println("credentials1 = " + credentials1);
        System.out.println("credentials2 = " + credentials2);
    }
}
