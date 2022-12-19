package day24_;

public class amazon {
    public static void main(String[] args) {

            String str = "amazon";

            System.out.print(str.charAt(str.length() - 1));
            for (int i =str.length()-2; i>=0; i--) {
                System.out.print("-");
                System.out.print(str.charAt(i));
            }
        }
    }
