package utilities;

public class mathUtility {
    //returns the sum of two integers
    public static int sum(int i1, int i2){
        int sum=(i1+i2); return sum;
    }

    //returns the sum of two decimals
    public static double sum(double d1, double d2){
        double sumd=(d1+d2); return sumd;
        }

    //returns the substraction of two integers
    public static int substraction(int i1, int i2){
        int sub=(i1-i2); return sub;
    }

    //returns the substraction of two doubles
    public static double substraction(double i1, double i2){
        double sub=(i1-i2); return sub;
    }

    //returns the multiplication of two integers
    public static int multiplication(int i1, int i2){
        int multi=(i1*i2); return multi;
    }

    //returns the multiplication of two doubles
    public static double multiplication(double i1, double i2){
        double multi=(i1*i2); return multi;
    }

    //returns the division of two doubles
    public static double division(double i1, double i2){
        double div=(i1/i2); return div;
    }

    //checks if the given integer is even.
    public static void even(int a){
        if (a==0) System.out.println(a+" is not even or odd");
        else if (a%2==0) System.out.println(a+" is even");
        else System.out.println(a+" is odd");
    }

    //checks if the given integer is odd.
    public static void odd(int a){
        if (a==0) System.out.println(a+" is not even or odd");
        else if (a%2==0) System.out.println(a+" is not odd");
        else System.out.println(a+" is odd");
    }

    //returns the maximum number between two given integers
    public static int max(int i1, int i2){
        int max=i1;
        if (i2>i1) max=i2; return max;
    }

    //returns the maximum number between two given decimals
    public static double max(double i1, double i2){
        double max=i1;
        if (i2>i1) max=i2; return max;
    }

    //returns the minimum number between two given integers
    public static int min(int i1, int i2){
        int min=i1;
        if (i2<i1) min=i2; return min;
    }

    //returns the minimum number between two given decimals
    public static double min(double i1, double i2){
        double mind=i1;
        if (i2<i1) mind=i2; return mind;
    }

    //returns the square of an integer.
    public static int square(int a){
return a*a;
        }

    //returns the square of a double.
    public static double square(double a){
        return a*a;
    }

    //returns the cube of an integer.
    public static int cube(int a){
        return a*a*a;
    }

    //returns the cube of a double.
    public static double cube(double a){
        return a*a*a;
    }
}
