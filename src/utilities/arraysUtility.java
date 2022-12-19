package utilities;


import java.util.Arrays;

public class arraysUtility {


    //returns max element of an integer array
    public static int max(int[]a){
int max=a[0];
        for (int each: a) {
            if (each>max) max=each;
        }
        return max;
    }

    //returns max element of a double array
    public static double max(double[]a){
        double max=a[0];
        for (double each: a) {
            if (each>max) max=each;
        }
        return max;
    }

    //prints each integer of an integer array.
    public static void printEachElement(int[]a){
        for (int each : a) {
            System.out.println(each);
        }
    }

    //prints each double of a double array.
    public static void printEachElement(double[]a){
        for (double each : a) {
            System.out.println(each);
        }
    }

    //prints each char of a char array.
    public static void printEachElement(char[]a){
        for (char each : a) {
            System.out.println(each);
        }
    }

    //prints each integer of a String array.
    public static void printEachElement(String[]a){
        for (String each : a) {
            System.out.println(each);
        }
    }

    //returns the max number from an integer array
    public static int maxElement(int []numbers){
        int max=numbers[0];
        for (int i : numbers) {
            if (i>max) max=i;
        }
        return max;
    }

    //returns the max number from a double array
    public static double maxElement(double []numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns max element of a long array
    public static long max(long[]a){
        long max=a[0];
        for (long each: a) {
            if (each>max) max=each;
        }
        return max;
    }

    //returns max element of a short array
    public static short max(short[]a){
        short max=a[0];
        for (short each: a) {
            if (each>max) max=each;
        }
        return max;
    }

    //returns the min number from a double array
    public static double minElement(double []numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the min number from an integer array
    public static int minElement(int []numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array. Returns boolean
    public static boolean contains(int[]array, int element){
        boolean result=false;
        for (int each : array) {
            if (each==element){
                result=true;
                break;
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array. Returns boolean
    public static boolean contains(double[]array, double element){
        boolean result=false;
        for (double each : array) {
            if (each==element){
                result=true;
                break;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given array. Returns boolean
    public static boolean contains(char[]array, char element){
        boolean result=false;
        for (char each : array) {
            if (each==element){
                result=true;
                break;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. Returns boolean
    public static boolean contains(String[]array, String element){
        boolean result=false;
        for (String each : array) {
            if (each.equals(element)){
                result=true;
                break;
            }
        }
        return result;
    }

    //adds the given integer to an integer array and returns it.
    public static int[] add(int[] i, int i2) {
        int[] arr = new int[i.length + 1];
        int counter = 0;
        for (int i1 : i) {
            arr[counter++] = i1;
        }
        arr[counter] = i2;
        return arr;
    }

    //adds the given double to a double array and returns it.
    public static double[] add(double[] i, double i2) {
        double[] arr = new double[i.length + 1];
        int counter = 0;
        for (double i1 : i) {
            arr[counter++] = i1;
        }
        arr[counter] = i2;
        return arr;
    }

    //adds the given String to a String array and returns it.
    public static String[] add(String[] i, String i2) {
        String[] arr = new String[i.length + 1];
        int counter = 0;
        for (String i1 : i) {
            arr[counter++] = i1;
        }
        arr[counter] = i2;
        return arr;
    }

    //adds the given char to a char array and returns it.
    public static char[] add(char[] i, char i2) {
        char[] arrchar = new char[i.length + 1];
        int counter = 0;
        for (char i1 : i) {
            arrchar[counter++] = i1;
        }
        arrchar[counter] = i2;
        return arrchar;
    }

    //merges 2 integer array and returns the new array.
    public static int[]merge(int[]i1,int[]i2) {
        int counter=0;
        int[]i=new int[i1.length+i2.length];
        for (int each : i1) {
            i[counter++]=each;
        }
        for (int each : i2) {
            i[counter++]=each;
        }
        return i;
    }

    //merges 2 double array and returns the new array.
    public static double[]merge(double[]i1,double[]i2) {
        int counter=0;
        double[]i=new double[i1.length+i2.length];
        for (double each : i1) {
            i[counter++]=each;
        }
        for (double each : i2) {
            i[counter++]=each;
        }
        return i;
    }

    //merges 2 char array and returns the new array.
    public static char[]merge(char[]i1,char[]i2) {
        int counter=0;
        char[]i=new char[i1.length+i2.length];
        for (char each : i1) {
            i[counter++]=each;
        }
        for (char each : i2) {
            i[counter++]=each;
        }
        return i;
    }

    //merges 2 String array and returns the new array.
    public static String[]merge(String[]i1,String[]i2) {
        int counter=0;
        String[]i=new String[i1.length+i2.length];
        for (String each : i1) {
            i[counter++]=each;
        }
        for (String each : i2) {
            i[counter++]=each;
        }
        return i;
    }

    //removes the element of a given integer array and returns the new array.
    public static int[] removeElement(int[]array,int element){
        if (element<0 ||element>array.length-1) {System.err.println("Invalid index: "+element);
            System.exit(0);}
        int[]removed=new int[array.length-1];
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (i!=element) removed[counter++]=array[i];
        }
        return removed;
    }

    //removes the element of a given double array and returns the new array.
    public static double[] removeElement(double[]array,int element){
        if (element<0 ||element>array.length-1) {System.err.println("Invalid index: "+element);
            System.exit(0);}
        double[]removed=new double[array.length-1];
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (i!=element) removed[counter++]=array[i];
        }
        return removed;
    }

    //removes the element of a given char array and returns the new array.
    public static char[] removeElement(char[]array,int element){
        if (element<0 ||element>array.length-1) {System.err.println("Invalid index: "+element);
            System.exit(0);}
        char[]removed=new char[array.length-1];
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (i!=element) removed[counter++]=array[i];
        }
        return removed;
    }

    //removes the element of a given String array and returns the new array.

    public static String[] removeElement(String[]array,int element){
        if (element<0 ||element>array.length-1) {System.err.println("Invalid index: "+element);
            System.exit(0);}
        String[]removed=new String[array.length-1];
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (i!=element) removed[counter++]=array[i];
        }
        return removed;
    }

    //returns the frequency of a given element from an integer array
    public static int frequency(int[]array,int element){
        int counter=0;
        for (int each : array) {
            if (each==element) counter++;
        }
        return counter;
    }

    //returns the frequency of a given element from a double array
    public static int frequency(double[]array,double element){
        int counter=0;
        for (double each : array) {
            if (each==element) counter++;
        }
        return counter;
    }

    //returns the frequency of a given element from a char array
    public static int frequency(char[]array,char element){
        int counter=0;
        for (char each : array) {
            if (each==element) counter++;
        }
        return counter;
    }

    //returns the frequency of a String element from a String array
    public static int frequency(String[]array,String element){
        int counter=0;
        for (String each : array) {
            if (each.equals(element)) counter++;
        }
        return counter;
    }

    //returns the unique elements of a given integer array
    public static int[]uniqueElements(int[]array){
        int[]unique={};
        for (int each : array) {
            if (frequency(array,each)==1){
                unique=add(unique,each);
            }
        }
        return unique;
    }

    //returns the unique elements of a given double array
    public static double[]uniqueElements(double[]array){
        double[]unique={};
        for (double each : array) {
            if (frequency(array,each)==1){
                unique=add(unique,each);
            }
        }
        return unique;
    }

    //returns the unique elements of a given char array
    public static char[]uniqueElements(char[]array){
        char[]unique={};
        for (char each : array) {
            if (frequency(array,each)==1){
                unique=add(unique,each);
            }
        }
        return unique;
    }

    //returns the unique elements of a given String array
    public static String[]uniqueElements(String[]array){
        String[]unique={};
        for (String each : array) {
            if (frequency(array,each)==1){
                unique=add(unique,each);
            }
        }
        return unique;
    }

    //reverses an integer array and returns it.
    public static int[] reverse(int[]a){
        int[]reversed=new int[a.length];
        for (int j=0, i=a.length-1; i>=0; i--, j++) {
            reversed[j]=a[i];
        }
        return reversed;
    }

    //reverses a double array and returns it.
    public static double[] reverse(double[]a){
        double[]reversed=new double[a.length];
        for (int j=0, i=a.length-1; i>=0; i--, j++) {
            reversed[j]=a[i];
        }
        return reversed;
    }

    //reverses a char array and returns it.
    public static char[] reverse(char[]a){
        char[]reversed=new char[a.length];
        for (int j=0, i=a.length-1; i>=0; i--, j++) {
            reversed[j]=a[i];
        }
        return reversed;
    }

    //reverses a String array and returns it.
    public static String[] reverse(String[]a){
        String[]reversed=new String[a.length];
        for (int j=0, i=a.length-1; i>=0; i--, j++) {
            reversed[j]=a[i];
        }
        return reversed;
    }

}
