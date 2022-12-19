package day24_;

public class T5 {
    public static void main(String[] args) {
        /*
            5. create method that accepts one integer array and one integer number
            and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};
                        frequency(array, 1) ==> 5
         */
        int[] array ={1,1,1,1,1,2,2};
        int number=1;
        int freq=frequencyOfInt(array,number);
        System.out.println(freq);
    }

    private static int frequencyOfInt(int array[], int number)
    {int counter=0;
        for (int i : array) {
            if (i==number) counter++;
        }
        return counter;
    }
}
