package oscarReviewsWeeks02;

public class PrimitiveExamples {
    public static void main(String[] args) {
        /** Variables: Primitive Types: Numbers // Characters // Boolean
         integers::: byte  --  short -- int -- long   ////
         decimals::: float -- double
         DataType
         DataType variableName = Value ; 1. Declare and 2. initialize at the same line

         DataType variableName; 1.Declare
         variableName = Value; 2. initialize */

        byte num1; // declare a variable
        num1=123; // initialize, (assign a value)

        System.out.println("-------after casting");
        num1 = 121; // re-assign a different value

        short num2=12398; //declare and initialize

        int distance=1_000_000_000;

        long distanceMore=9_000_000_000L;
        long distanceMore2=2_000_000_000;

        float rate= 1000.5F;
        double dNumber=123.4;

        //I will assign num1 (byte) to num2 (short) ---> from smaller dataType to bigger dataType
        num2=num1; //there is implicit casting : done by compiler
        System.out.println("num2 = " + num2);

        // I will assign distance variable value to num2 variable --> from bigger to smaller
        num2 = (short) distance; //explicit casting ---> done by developer/tester
        System.out.println("num2 = " + num2);

        char ch ='a';
        System.out.println("ch = " + ch);

        int x = 5 + ch; /* ch burada a'ya eşit olduğu, ve a harfi ASCI table'da 97 olduğu için
                              5 + a = 5 + 97 =102..... */
        System.out.println("x = " + x);
        String str =""+'J'+'a'+'v'+'a'; //empty ""; makes all chars to torn into Strings
        System.out.println("str = " + str);

        int y = 'J'+'a'+'v'+'a';
        System.out.println("y = " + y); //386

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 1>2;
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        /* naming Convention Examples for Valid (V) and Invalid (I) Examples;
            we can use _ underscore and $ dollar at the beginning of VariableName

            _ozkan : V ---- we can use _ underscore at the beginning of VariableName
            $ozkan : V ----  we can use $ dollar at the beginning of VariableName
            OZKAN  : V----- we can use Capital letters
            println :V ---- it is not reserved
            for     : Invalid ---- it is Reserved
            "hello" : Invalid ----- it can not start with "
           sum_of_Data: V
           42ozkan: Invalid
         */
    }
}
