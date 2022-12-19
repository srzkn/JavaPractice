package day20_Arrays;

public class T3_Items {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "Gloves" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        int gloves=0;
        int score=0;
        for (int i = 0; i < items.length; i++) {
            if (gloves!=0) gloves=gloves;
else if (items[i].contains("Gloves")) {
    gloves = i;
}
            if (items[i].contains("iPad")) score++;
        }
        System.out.println("first index number of \"Gloves\" is: "+gloves);
        if (score>0)                 System.out.println("the list contains iPad");
                else System.out.println("There is no iPad in the list!");
        System.out.println("--------------------------------");
        System.out.println("name    -   price   -   #ID");
        for (int i = 0; i < 6; i++) {
            System.out.println(items[i]+"\t-\t"+prices[i]+"\t-\t"+itemIDs[i]);
        }
    }
}
