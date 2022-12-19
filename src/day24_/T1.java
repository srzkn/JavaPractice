package day24_;

public class T1 {
    public static void main(String[] args) {
        /*
        	1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word,
        	then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
         */
        String sentence = "Java java java python python";
        String word = "java";
    int freq= frequencyOfWord(sentence, word);
        System.out.println(freq);
    }

    private static int frequencyOfWord(String sentence, String word)
    {String[]arr=sentence.split(" ");
        int freq=0;
        for (String s : arr) {
            if(s.equalsIgnoreCase(word)) freq++;
        }
        return freq;
    }
}
