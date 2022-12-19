package day35_OOP_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyObjects {
    public static void main(String[] args) {
        Candy candy1=new Candy("bonibon", 35, 5.5, false);
        Candy candy2=new Candy("  ", -4, 0, true);
        Candy candy3=new Candy("lokum", 1, -5, false);
        Candy candy4=new Candy("sugar", 4, 10, true);
        Candy candy5=new Candy("baklava", 7, 8, true);
        ArrayList<Candy>myCandies=new ArrayList<>(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy myCandy : myCandies) {
            System.out.println(myCandy.getBrand()+" : "+myCandy.getPrice());
        }
    }
}
