package day23_CustomMethod;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfAnagram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please write the FIRST word");
        String s1=scan.next();
        System.out.println("please write the SECOND word");
        String s2=scan.next();
        checkIfAnagram(s1,s2);
    }
    public static void checkIfAnagram(String s1, String s2){
char []c1=s1.toCharArray();
        Arrays.sort(c1);
char[]c2=s2.toCharArray();
Arrays.sort(c2);
if (Arrays.equals(c1,c2)) System.out.println(s1+" and "+s2+" are anagram.");
else System.out.println(s1+" and "+s2+" ARE NOT anagram.");
        }
    }
