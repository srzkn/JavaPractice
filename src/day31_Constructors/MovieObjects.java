package day31_Constructors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie1=new Movie("USA", "Journey to SDET: Cydeo Batch 25", "10/25/2021", "Kuzzat Altay");
        String casts[]={"Asia","Adam","Muhtar","Ali", "Veli", "Deli"};
        movie1.addCasts(casts);
        System.out.println(movie1);

    }
}
