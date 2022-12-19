package day10_Ternaries;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        String message = "";
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            message = (grade == 'A') ? "excellent" : (grade == 'B') ? "great job"
                    : (grade == 'C') ? "good" : (grade == 'D') ? "passed" : "failed";
        } else message = "invalid";
        System.out.println(message);
    }
}
