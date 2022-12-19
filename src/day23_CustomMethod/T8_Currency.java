package day23_CustomMethod;

public class T8_Currency {
    public static void main(String[] args) {
dollarToEuro(100);
dollarToLira(100);
    }
    public static void dollarToEuro (int dollar)
    {
        System.out.println(dollar+" dollars equal to "+(1.02*dollar)+" Euros");
    }
    public static void dollarToLira (int dollar)
    {
        System.out.println(dollar+" dollars equal to "+(18.82*dollar)+" Liras");
    }
}
