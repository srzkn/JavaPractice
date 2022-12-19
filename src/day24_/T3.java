package day24_;

public class T3 {
    public static void main(String[] args) {
        /*
        	3. create a method named reverse that passes one string parameter,
        	the method can return the reversed string
				Ex:
					str = "Java";
					reverse(str) ==> avaJ
         */
        String str = "Java";
        String reversed=reverse(str);
        System.out.println(reversed);
    }

    private static String reverse(String str)
    {String word="";
        for (int i=str.length()-1; i>=0; i--)
        {
            word+=str.charAt(i);
        }
        return word;
    }
}
