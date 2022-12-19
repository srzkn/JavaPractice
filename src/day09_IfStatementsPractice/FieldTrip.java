package day09_IfStatementsPractice;
import java.util.Scanner;
public class FieldTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your grade");
        int gradeNumber= input.nextInt();
        String loc="";
        int groupNumber=0;
        String teacher="";

        if (gradeNumber>=1 && gradeNumber<=6) {
            if (gradeNumber == 1) {
                loc="Apple orchard"; groupNumber=3; teacher="Ms. Smith";
            } else if (gradeNumber == 2) {
                loc="Zoo"; groupNumber=7; teacher="Mr. Lee";;
            } else if (gradeNumber == 3) {
                loc="Aquarium"; groupNumber=5; teacher="Ms. Wilson";
            } else if (gradeNumber == 4) {
               loc="Movie theater"; groupNumber=2; teacher="Ms. Reyes";
            } else if (gradeNumber == 5) {
               loc="Museum"; groupNumber=5; teacher="Ms. Lela";
            } else {
                loc="Movie theater"; groupNumber=2; teacher="Ms. Reyes";
            }
            System.out.println("grade - " + gradeNumber + "\n" + "location - Movie theater" + "\n"
                                + "number of groups - 2" + "\n" + "teacher in charge - Ms. Reyes");
        }
        else {
            System.out.println(gradeNumber+" is not a valid grade number");
        }
        }
}
