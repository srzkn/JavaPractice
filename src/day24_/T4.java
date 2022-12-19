package day24_;

public class T4 {
    public static void main(String[] args) {
        /*
        	4. By using the reverse method above to create another method named isPalindrome
        	that passes a String parameter, the method returns true if the string is palindrome,
        	otherwise returns false
				Ex:
					str = "Level"
					isPalindrome(str) ===> true
         */
        boolean result=isPalindrome("LEvel");
        System.out.println(result);
    }

    private static boolean isPalindrome(String str)
    {
        String s="";
        for (int i=str.length()-1; i>=0; i--)
        {
            s+=str.charAt(i);
        }
        return (str.equalsIgnoreCase(s));
    }
}
