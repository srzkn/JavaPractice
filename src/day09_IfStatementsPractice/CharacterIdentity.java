package day09_IfStatementsPractice;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = 78;
        if (ch >= 48 && ch <= 57) {
            System.out.println(ch + " is a Digit");
        } else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            System.out.println(ch + " is an Alphabetic Character");
        } else {
            System.out.println(ch + " is a Special Character");
        }

        System.out.println("--------------------------");
        if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println(ch + " is an Alphabetic Character");
        }
                                else
        {
            System.out.println(ch + " is a Special Character");
        }

    }
}
