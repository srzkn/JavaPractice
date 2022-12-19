package day21_ForEachLoop;

public class CountPalidromes {
    public static void main(String[] args) {
        String[]s={"anna", "level", "Java"};
        String palindromes="";
        int k=0;
        for (String s1 : s) {
            String s2="";
            for (int i = s1.length()-1; i>=0 ; i--) {
                s2+=s1.charAt(i);
            }
            if (s2.equals(s1)) {
                palindromes += s1 + " ";
                k++;
            }
            }
        System.out.println(k);
        System.out.println(palindromes);
        }
    }
