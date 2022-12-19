package day23_CustomMethod;

public class T13_PrintEachCharacter {
    public static void main(String[] args) {
        String word="wonderful";
    eachCharacterOfAString(word);
    }
    public static void eachCharacterOfAString(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+" ");
        }
    }
}
