package day24_;

import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {
        /*
            2. create a method named isAnagram that passes two String parameters,
            the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
         */
        String str1 = "cba";
        String str2 = "bac";
        boolean result=isanagram(str1,str2);
        System.out.println(result);
    }

    private static boolean isanagram(String str1, String str2)
    {
        char s1[]=str1.toCharArray();
        char s2[]=str2.toCharArray();
        Arrays.sort(s1);
        System.out.println(s1);
        Arrays.sort(s2);
        System.out.println(s2);
        return (Arrays.equals(s1,s2));
   }
}
